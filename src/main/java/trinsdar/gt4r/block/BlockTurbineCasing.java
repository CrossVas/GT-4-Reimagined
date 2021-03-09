package trinsdar.gt4r.block;

import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import muramasa.antimatter.datagen.builder.AntimatterBlockModelBuilder;
import muramasa.antimatter.datagen.providers.AntimatterBlockStateProvider;
import muramasa.antimatter.dynamic.ModelConfig;
import muramasa.antimatter.machine.MachineState;
import muramasa.antimatter.registration.ITextureProvider;
import muramasa.antimatter.texture.Texture;
import muramasa.antimatter.util.int3;
import net.minecraft.util.math.vector.Vector3i;
import trinsdar.gt4r.tile.multi.TileEntityLargeTurbine;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

import javax.annotation.Nullable;
import java.util.Arrays;
import java.util.List;

import static muramasa.antimatter.client.AntimatterModelManager.LOADER_DYNAMIC;

public class BlockTurbineCasing extends BlockConnectedCasing {

    public BlockTurbineCasing(String domain, String id) {
        super(domain, id);
    }

    @Override
    public ModelConfig getConfig(BlockState state, IBlockReader world, BlockPos.Mutable mut, BlockPos pos) {
        int[] conf = super.getConfig(state, world, mut, pos).getConfig();
        int[] ct = new int[conf.length+1];
        int3 mutable = new int3();
        mutable.set(pos);
        TileEntityLargeTurbine turbine = getTurbine(world, pos);
        if (turbine != null) {
            BlockPos controllerPos = turbine.getPos();
            Vector3i vec = new Vector3i(-(pos.getX()-controllerPos.getX()), -(pos.getY()-controllerPos.getY()), -(pos.getZ()-controllerPos.getZ()));
            int c = getOffset(vec);
            c += turbine.getFacing().getIndex()*1000;
            c += (turbine.getMachineState() == MachineState.ACTIVE ? 10000 : 0);
            ct[1] = c;
        }
        ct[0] = conf[0];
        return config.set(ct);
    }

    protected Texture[] turbineTextures() {
        Texture[] tex = new Texture[9];
        for (int i = 0; i <= 8; i++) {
            tex[i] = new Texture(domain,"block/ct/turbine/large_turbine_active_"+i);
        }
        return tex;
    }

    protected Texture[] turbineTexturesInactive() {
        Texture[] tex = new Texture[9];
        for (int i = 0; i <= 8; i++) {
            tex[i] = new Texture(domain,"block/ct/turbine/large_turbine_"+i);
        }
        return tex;
    }


    protected int getOffset(Vector3i vec) {
        return vec.getX() + vec.getY()*10 + vec.getZ()*100;
    }

    //essentially a facing transformation
    protected int getOffset(Vector3i vec, Direction dir) {
        switch (dir) {
            case NORTH:
                return vec.getY()*10 - vec.getX();
            case SOUTH:
                return vec.getY()*10 + vec.getX();
            case WEST:
                return vec.getY()*10 + vec.getX()*100;
            case EAST:
                return vec.getY()*10 - vec.getX()*100;
        }
        return 0;
    }

    private final static String SIDED = "antimatter:block/preset/simple_overlay";
    private final static String SIMPLE = "antimatter:block/preset/simple";

    private final Vector3i[] VECS = new Vector3i[]{
            new Vector3i(1,-1,0),
            new Vector3i(0,-1,0),
            new Vector3i(-1,-1,0),
            new Vector3i(1,0,0),
            new Vector3i(0,0,0),
            new Vector3i(-1,0,0),
            new Vector3i(1,1,0),
            new Vector3i(0,1,0),
            new Vector3i(-1,1,0),
    };

    @Override
    public AntimatterBlockModelBuilder buildBlock(Block block, AntimatterBlockStateProvider prov) {
        Texture[] tex = turbineTextures();
        Texture[] inactive = turbineTexturesInactive();
        AntimatterBlockModelBuilder builder = super.buildBlock(block, prov);
        for (Direction dir : dirs) {
            for (int i = 0; i < VECS.length; i++) {
                if (i == 4) continue;
                final int ii = i;
                builder.config(getOffset(VECS[i], dir)+dir.getIndex()*1000, SIDED, a ->
                    a.tex(t -> t.put("base",inactive[ii])).rot(dir));
                builder.config(getOffset(VECS[i], dir)+dir.getIndex()*1000+10000, SIDED, a ->
                    a.tex(t -> t.put("base",tex[ii])).rot(dir));
            }
        }
        builder.model(SIMPLE, ((ITextureProvider)block).getTextures());
        builder.loader(LOADER_DYNAMIC);
        return builder;
    }
    //just all horizontal dirs
    private static final List<Direction> dirs = Arrays.asList(Direction.NORTH, Direction.EAST, Direction.SOUTH, Direction.WEST);
    //cache.
    private static final Long2ObjectMap<TileEntityLargeTurbine> MAP = new Long2ObjectOpenHashMap<>();

    private TileEntityLargeTurbine checkTurbine(IBlockReader reader, BlockPos pos) {
        TileEntity tile = reader.getTileEntity(pos);
        return tile instanceof TileEntityLargeTurbine ? (TileEntityLargeTurbine) tile : null;
    }

    protected TileEntityLargeTurbine getTurbine(IBlockReader world, BlockPos pos) {
        int3 mutable = new int3();
        mutable.set(pos);
        return MAP.compute(pos.toLong(), (a, b) -> {
            if (b != null && !(b.isRemoved())) return b;
            TileEntityLargeTurbine t;
            for (Direction d : dirs) {
                mutable.setPos(pos);
                mutable.offset(d,1);
                t = checkTurbine(world, mutable);
                if (t != null) return t;

                mutable.setPos(pos);
                mutable.offset(d,-1);
                t = checkTurbine(world, mutable);
                if (t != null) return t;

                mutable.setPos(pos);
                mutable.offset(Direction.UP,1);
                t = checkTurbine(world, mutable);
                if (t != null) return t;

                mutable.setPos(pos);
                mutable.offset(Direction.UP,-1);
                t = checkTurbine(world, mutable);
                if (t != null) return t;

                mutable.setPos(pos);
                mutable.offset(d,1);
                mutable.offset(Direction.UP,-1);
                t = checkTurbine(world, mutable);
                if (t != null) return t;

                mutable.setPos(pos);
                mutable.offset(d);
                mutable.offset(Direction.UP,1);
                t = checkTurbine(world, mutable);
                if (t != null) return t;

                mutable.setPos(pos);
                mutable.offset(d,-1);
                mutable.offset(Direction.UP,1);
                t = checkTurbine(world, mutable);
                if (t != null) return t;

                mutable.setPos(pos);
                mutable.offset(d,-1);
                mutable.offset(Direction.UP,-1);
                t = checkTurbine(world, mutable);
                if (t != null) return t;

            }
            return null;
        });
    }
}

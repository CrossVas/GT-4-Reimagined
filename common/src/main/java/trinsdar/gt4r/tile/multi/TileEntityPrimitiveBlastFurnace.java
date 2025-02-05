package trinsdar.gt4r.tile.multi;

import muramasa.antimatter.cover.ICover;
import muramasa.antimatter.machine.types.Machine;
import muramasa.antimatter.tile.multi.TileEntityBasicMultiMachine;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.fluids.capability.IFluidHandler;
import net.minecraftforge.items.IItemHandler;
import tesseract.api.gt.IEnergyHandler;

public class TileEntityPrimitiveBlastFurnace extends TileEntityBasicMultiMachine<TileEntityPrimitiveBlastFurnace> {

    public TileEntityPrimitiveBlastFurnace(Machine<?> type, BlockPos pos, BlockState state) {
        super(type, pos, state);
    }

    @Override
    public int maxShares() {
        return 0;
    }

    //    @Override
//    public boolean onStructureFormed() {
//        super.onStructureFormed();
//        int3 controller = new int3(getPos(), getFacing());
//        controller.back(1);
//        getWorld().setBlockState(controller, Blocks.LAVA.getDefaultState(), 3);
//        controller.up(1);
//        getWorld().setBlockState(controller, Blocks.LAVA.getDefaultState(), 3);
//        return true;
//    }

    @Override
    public <T> LazyOptional<T> getCapabilityFromFake(Class<T> cap, BlockPos pos, Direction side, ICover coverPresent) {
        if (cap == IItemHandler.class && itemHandler.isPresent()) return itemHandler.side(side).cast();
        else if (cap == IFluidHandler.class && fluidHandler.isPresent()) return fluidHandler.side(side).cast();
        else if (cap == IEnergyHandler.class && energyHandler.isPresent()) return energyHandler.side(side).cast();
        return LazyOptional.empty();
    }
}

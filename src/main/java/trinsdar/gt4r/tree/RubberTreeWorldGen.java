package trinsdar.gt4r.tree;

import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import muramasa.antimatter.worldgen.object.WorldGenBase;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.feature.TwoLayerFeature;
import net.minecraft.world.gen.feature.WorldDecoratingHelper;
import net.minecraft.world.gen.placement.AtSurfaceWithExtraConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.treedecorator.LeaveVineTreeDecorator;
import net.minecraft.world.gen.trunkplacer.StraightTrunkPlacer;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import trinsdar.gt4r.data.GT4RData;

import java.util.Random;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static muramasa.antimatter.Ref.RNG;

public class RubberTreeWorldGen  extends WorldGenBase<RubberTreeWorldGen> {
    public static Predicate<Biome.Category> getValidBiomesStatic() {
        final Set<Biome.Category> blacklist = new ObjectOpenHashSet<>();
        blacklist.add(Biome.Category.DESERT);
        blacklist.add(Biome.Category.TAIGA);
        blacklist.add(Biome.Category.EXTREME_HILLS);
        blacklist.add(Biome.Category.ICY);
        blacklist.add(Biome.Category.THEEND);
        blacklist.add(Biome.Category.OCEAN);
        blacklist.add(Biome.Category.NETHER);
        blacklist.add(Biome.Category.PLAINS);
        return b -> !blacklist.contains(b);
    }

    final static BaseTreeFeatureConfig RUBBER_TREE_CONFIG_SWAMP =
            (new BaseTreeFeatureConfig.Builder(RubberTree.TRUNK_BLOCKS, new SimpleBlockStateProvider(GT4RData.RUBBER_LEAVES.getDefaultState()),
                    new RubberFoliagePlacer(), new StraightTrunkPlacer(4, 3, 0), new TwoLayerFeature(1, 0, 2))).setIgnoreVines().setMaxWaterDepth(1).setDecorators(ImmutableList.of(new LeaveVineTreeDecorator())).build();

    final static BaseTreeFeatureConfig RUBBER_TREE_CONFIG_JUNGLE =
            (new BaseTreeFeatureConfig.Builder(RubberTree.TRUNK_BLOCKS, new SimpleBlockStateProvider(GT4RData.RUBBER_LEAVES.getDefaultState()),
                    new RubberFoliagePlacer(), new StraightTrunkPlacer(6, 3, 0), new TwoLayerFeature(1, 0, 2))).setIgnoreVines().setDecorators(ImmutableList.of(new LeaveVineTreeDecorator())).build();

    final static BaseTreeFeatureConfig RUBBER_TREE_CONFIG_NORMAL =
            (new BaseTreeFeatureConfig.Builder(RubberTree.TRUNK_BLOCKS, new SimpleBlockStateProvider(GT4RData.RUBBER_LEAVES.getDefaultState()),
                    new RubberFoliagePlacer(), new StraightTrunkPlacer(4, 3, 0), new TwoLayerFeature(1, 0, 2))).setIgnoreVines().build();



    public RubberTreeWorldGen(){
        super("rubber_tree", RubberTreeWorldGen.class, World.OVERWORLD);
    }


    public static void onEvent(BiomeLoadingEvent builder){
        Biome.Category biomeCategory = builder.getCategory();
        if (!getValidBiomesStatic().test(biomeCategory)) return;
        float p = 0.15F;
        if (builder.getClimate().temperature > 0.8f) {
            p = 0.04F;
            if (builder.getClimate().precipitation == Biome.RainType.RAIN)
                p += 0.04F;
        }
        float finalp = p;
        builder.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION).add(() -> RubberTree.TREE_FEATURE.withConfiguration(getTreeConfig(biomeCategory))
                .withPlacement(new RubberTreePlacement().configure(new AtSurfaceWithExtraConfig(0, finalp, 1))));
        if (RNG.nextInt(4) == 0){
            builder.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION).add(() -> RubberTree.TREE_FEATURE.withConfiguration(getTreeConfig(biomeCategory))
                    .withPlacement(new RubberTreePlacement().configure(new AtSurfaceWithExtraConfig(0, finalp, 1))));
            if (RNG.nextInt(6) == 0){
                builder.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION).add(() -> RubberTree.TREE_FEATURE.withConfiguration(getTreeConfig(biomeCategory))
                        .withPlacement(new RubberTreePlacement().configure(new AtSurfaceWithExtraConfig(0, finalp, 1))));
            }
        }
    }

    static BaseTreeFeatureConfig getTreeConfig(Biome.Category biome){
        BaseTreeFeatureConfig config = RUBBER_TREE_CONFIG_NORMAL;
        if (biome == Biome.Category.SWAMP)
            config = RUBBER_TREE_CONFIG_SWAMP;
        else if (biome == Biome.Category.JUNGLE)
            config = RUBBER_TREE_CONFIG_JUNGLE;
        return config;
    }
    public static class RubberTreePlacement extends Placement<AtSurfaceWithExtraConfig> {
        public RubberTreePlacement() {
            super(AtSurfaceWithExtraConfig.CODEC);
        }
        @Override
        public Stream<BlockPos> getPositions(WorldDecoratingHelper helper, Random random, AtSurfaceWithExtraConfig config, BlockPos pos) {
            int i = config.count;
            if (random.nextDouble() < config.extraChance) {
                i = random.nextInt(config.extraCount) + config.extraCount;
            }
            return IntStream.range(0, i).mapToObj((ix) -> {
                int j = random.nextInt(16) + pos.getX();
                int k = random.nextInt(16) + pos.getZ();
                return new BlockPos(j, helper.func_242893_a(Heightmap.Type.MOTION_BLOCKING, j, k), k);
            });
        }


    }
}

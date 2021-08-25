package trinsdar.gt4r.loader;

import muramasa.antimatter.Antimatter;
import muramasa.antimatter.AntimatterConfig;
import muramasa.antimatter.Data;
import muramasa.antimatter.worldgen.object.WorldGenStoneLayer;
import muramasa.antimatter.worldgen.object.WorldGenVeinLayer;
import muramasa.antimatter.worldgen.old.WorldGenAsteroid;
import net.minecraft.world.World;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import trinsdar.gt4r.GT4RConfig;
import trinsdar.gt4r.data.GT4RData;
import trinsdar.gt4r.tree.RubberTreeWorldGen;

import java.util.ArrayList;
import java.util.List;

import static muramasa.antimatter.Ref.*;
import static net.minecraftforge.common.BiomeDictionary.Type.*;
import static trinsdar.gt4r.data.Materials.*;

public class WorldGenLoader {


    public static void init() {
        if (GT4RConfig.WORLD.GENERATE_STONE_LAYERS){
            WorldGenStoneLayer.add(GT4RData.GRANITE_BLACK, 2, World.OVERWORLD);
            WorldGenStoneLayer.add(GT4RData.GRANITE_RED, 2, World.OVERWORLD);
            WorldGenStoneLayer.add(GT4RData.KOMATIITE, 4, World.OVERWORLD);
            WorldGenStoneLayer.add(GT4RData.BASALT, 3, World.OVERWORLD);
            WorldGenStoneLayer.add(GT4RData.MARBLE, 4, World.OVERWORLD);
            WorldGenStoneLayer.add(GT4RData.LIMESTONE, 3, World.OVERWORLD);
            WorldGenStoneLayer.add(GT4RData.GREEN_SCHIST, 1, World.OVERWORLD);
            WorldGenStoneLayer.add(GT4RData.BLUE_SCHIST, 1, World.OVERWORLD);
            WorldGenStoneLayer.add(GT4RData.KIMBERLITE, 3, World.OVERWORLD);
            WorldGenStoneLayer.add(GT4RData.QUARTZITE, 4, World.OVERWORLD);
            if (AntimatterConfig.WORLD.VANILLA_STONE_GEN){
                WorldGenStoneLayer.add(Data.GRANITE, 4, World.OVERWORLD);
                WorldGenStoneLayer.add(Data.ANDESITE, 4, World.OVERWORLD);
                WorldGenStoneLayer.add(Data.DIORITE, 4, World.OVERWORLD);
                WorldGenStoneLayer.add(Data.STONE, 4, World.OVERWORLD);
            }
        }
    }
}

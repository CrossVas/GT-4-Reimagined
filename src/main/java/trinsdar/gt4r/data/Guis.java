package trinsdar.gt4r.data;

import muramasa.antimatter.AntimatterAPI;
import muramasa.antimatter.gui.GuiData;
import muramasa.antimatter.machine.Tier;
import net.minecraft.util.ResourceLocation;

import static muramasa.antimatter.gui.ButtonBody.*;
import static muramasa.antimatter.gui.SlotType.*;
import static muramasa.antimatter.machine.Tier.*;
import static trinsdar.gt4r.data.Machines.*;

public class Guis {

    //TODO move these to the API somehow
    public static GuiData MULTI_DISPLAY = new GuiData("antimatter", "multi_display").add(IT_IN, 17, 16).add(IT_IN, 35, 16).add(IT_IN, 53, 16).add(IT_IN, 17, 34).add(IT_IN, 35, 34).add(IT_IN, 53, 34).add(IT_OUT, 107, 16).add(IT_OUT, 125, 16).add(IT_OUT, 143, 16).add(IT_OUT, 107, 34).add(IT_OUT, 125, 34).add(IT_OUT, 143, 34).add(FL_IN, 17, 63).add(FL_IN, 35, 63).add(FL_IN, 53, 63).add(FL_OUT, 107, 63).add(FL_OUT, 125, 63).add(FL_OUT, 143, 63);
    public static GuiData MULTI_DISPLAY_COMPACT = new GuiData("antimatter", "multi_display").add(MULTI_DISPLAY).setPadding(0, 0, 0, 0);
    public static GuiData BASIC_TANK = new GuiData("antimatter", "basic_tank").add(CELL_IN, 9, 22).add(CELL_OUT, 9, 58).add(FL_IN, 106, 43);

    public static GuiData ORE_BYPRODUCTS = new GuiData("antimatter", "ore_byproducts") {
        @Override
        public ResourceLocation getTexture(Tier tier,String type) {
            return new ResourceLocation(loc.getNamespace(), "textures/gui/" + loc.getPath() + ".png");
        }
    }.setPadding(0, 0, 0, 0).add(IT_IN, 17, 16).add(IT_IN, 35, 16).add(IT_IN, 53, 16).add(IT_IN, 17, 34).add(IT_IN, 35, 34).add(IT_IN, 53, 34).add(IT_OUT, 107, 16).add(IT_OUT, 125, 16).add(IT_OUT, 142, 16).add(IT_OUT, 107, 34).add(IT_OUT, 125, 34).add(IT_OUT, 143, 34);

    public static void init() {

        AntimatterAPI.registerJEICategory(RecipeMaps.ORE_BYPRODUCTS, Guis.ORE_BYPRODUCTS);
//        GregTechAPI.registerJEICategory(RecipeMaps.SMELTING, Guis.MULTI_DISPLAY_COMPACT);
        AntimatterAPI.registerJEICategory(RecipeMaps.STEAM_FUELS, Guis.MULTI_DISPLAY_COMPACT);
        AntimatterAPI.registerJEICategory(RecipeMaps.GAS_FUELS, Guis.MULTI_DISPLAY_COMPACT);
        AntimatterAPI.registerJEICategory(RecipeMaps.COMBUSTION_FUELS, Guis.MULTI_DISPLAY_COMPACT);
        AntimatterAPI.registerJEICategory(RecipeMaps.NAQUADAH_FUELS, Guis.MULTI_DISPLAY_COMPACT);
        AntimatterAPI.registerJEICategory(RecipeMaps.PLASMA_FUELS, Guis.MULTI_DISPLAY_COMPACT);

        //TODO changing slots of a machine in world, will crash from GTItemHandler.validateSlot()

        ALLOY_SMELTER.getGui().add(IT_IN, 35, 25).add(IT_IN, 53, 25).add(IT_OUT, 107, 25).add(ENERGY,80, 63);
        ASSEMBLER.getGui().add(IT_IN, 17, 16).add(IT_IN, 35, 16).add(IT_IN, 53, 16).add(IT_IN, 17, 34).add(IT_IN, 35, 34).add(IT_IN, 53, 34).add(IT_OUT, 107, 25)
                .add(FL_IN,53, 63)
                .add(ENERGY,80, 63);
        BENDER.getGui().add(ALLOY_SMELTER);
        CANNER.getGui().add(IT_IN, 35, 25).add(IT_IN, 53, 25).add(IT_OUT, 107, 25).add(ENERGY,80, 63);
        COMPRESSOR.getGui().add(IT_IN, 53, 25).add(IT_OUT, 107, 25).add(ENERGY,80, 63);
        CUTTER.getGui().add(IT_IN, 53, 25).add(FL_IN, 53, 63).add(IT_OUT, 107, 25).add(IT_OUT, 125, 25).add(ENERGY,80, 63);
        FURNACE.getGui().add(IT_IN, 53, 25).add(IT_OUT, 107, 25).add(ENERGY,80, 63);
        EXTRACTOR.getGui().add(COMPRESSOR);
        EXTRUDER.getGui().add(ALLOY_SMELTER);
        LATHE.getGui().add(CUTTER);
        PULVERIZER.getGui().add(COMPRESSOR);
        PULVERIZER.getGui().add(HV, PULVERIZER).add(HV, IT_OUT, 125, 25);
        PULVERIZER.getGui().add(EV, PULVERIZER).add(EV, IT_OUT, 125, 25).add(EV, IT_OUT, 143, 25);
        PULVERIZER.getGui().add(IV, IT_IN, 53, 25).add(IV, IT_OUT, 107, 16).add(IV, IT_OUT, 125, 16).add(IV, IT_OUT, 107, 34).add(IV, IT_OUT, 125, 34);
        RECYCLER.getGui().add(COMPRESSOR);
        WIRE_MILL.getGui().add(COMPRESSOR);
        CENTRIFUGE.getGui().add(IT_IN, 35, 25).add(IT_IN, 53, 25).add(IT_OUT, 107, 16).add(IT_OUT, 125, 16).add(IT_OUT, 142, 16).add(IT_OUT, 107, 34).add(IT_OUT, 125, 34).add(IT_OUT, 143, 34).add(ENERGY,80, 63).add(FL_OUT, 107, 63);
        ELECTROLYZER.getGui().add(CENTRIFUGE);
        CHEMICAL_REACTOR.getGui().add(IT_IN, 35, 25).add(IT_IN, 53, 25).add(IT_OUT, 107, 25).add(FL_IN, 53, 63).add(FL_OUT, 107, 63);
        FLUID_CANNER.getGui().add(COMPRESSOR).add(FL_IN, 53, 63).add(FL_OUT, 107, 63);
        DISASSEMBLER.getGui().add(IT_IN, 53, 25)
                .add(IT_OUT, 107, 7).add(IT_OUT, 107+18, 7).add(IT_OUT, 107+18*2, 7)
                .add(IT_OUT, 107, 25).add(IT_OUT, 107+18, 25).add(IT_OUT, 107+18*2, 25)
                .add(IT_OUT, 107, 43).add(IT_OUT, 107+18, 43).add(IT_OUT, 107+18*2, 43)
                .add(ENERGY,80, 63);
        MASS_FABRICATOR.getGui().add(COMPRESSOR);

        COKE_OVEN.getGui().add(IT_IN, 53,16).add(IT_OUT,107,25);

        BATTERY_BUFFER_FOUR.getGui().add(ENERGY,71,27).add(ENERGY,89,27).add(ENERGY,71,45).add(ENERGY,89,45);
        BATTERY_BUFFER_ONE.getGui().add(ENERGY,80,40);
        BATTERY_BUFFER_NINE.getGui().add(ENERGY,62,21).add(ENERGY,80,21).add(ENERGY,98,21)
                .add(ENERGY,62,39).add(ENERGY,80,39).add(ENERGY,98,39)
                .add(ENERGY,62,57).add(ENERGY,80,57).add(ENERGY,98,57);

        COAL_BOILER.getGui().add(ALLOY_SMELTER);
        LAVA_BOILER.getGui().add(ALLOY_SMELTER);
        SOLAR_BOILER.getGui().add(ALLOY_SMELTER);

        STEAM_ALLOY_SMELTER.getGui().add(BRONZE, ALLOY_SMELTER).add(BRONZE, FL_IN, 53, 63);
        STEAM_ALLOY_SMELTER.getGui().add(STEEL, ALLOY_SMELTER).add(STEEL, FL_IN, 53, 63);
        STEAM_COMPRESSOR.getGui().add(BRONZE, COMPRESSOR).add(BRONZE, FL_IN, 53, 63);
        STEAM_COMPRESSOR.getGui().add(STEEL, COMPRESSOR).add(STEEL, FL_IN, 53, 63);
        STEAM_FURNACE.getGui().add(BRONZE, FURNACE).add(BRONZE, FL_IN, 53, 63);
        STEAM_FURNACE.getGui().add(STEEL, FURNACE).add(STEEL, FL_IN, 53, 63);
        STEAM_EXTRACTOR.getGui().add(BRONZE, EXTRACTOR).add(BRONZE, FL_IN, 53, 63);
        STEAM_EXTRACTOR.getGui().add(STEEL, EXTRACTOR).add(STEEL, FL_IN, 53, 63);
        STEAM_PULVERIZER.getGui().add(BRONZE, PULVERIZER).add(BRONZE, FL_IN, 53, 63);
        STEAM_PULVERIZER.getGui().add(STEEL, PULVERIZER).add(STEEL, FL_IN, 53, 63);
        //STEAM_FORGE_HAMMER.getGui().add(BRONZE, FORGE_HAMMER).add(BRONZE, FL_IN, 53, 63);

        STEAM_GENERATOR.getGui().add(BASIC_TANK);
        GAS_GENERATOR.getGui().add(BASIC_TANK);
        NAQUADAH_GENERATOR.getGui().add(BASIC_TANK);
        PLASMA_GENERATOR.getGui().add(BASIC_TANK);

        INFINITE_STEAM.getGui().add(BASIC_TANK);

        QUANTUM_TANK.getGui().add(BASIC_TANK);

        PRIMITIVE_BLAST_FURNACE.getGui().add(IT_IN, 53, 16).add(IT_IN, 53, 34).add(IT_IN, 53, 52).add(IT_OUT, 107, 25).add(IT_OUT, 125, 25).add(IT_OUT, 143, 25).setPadding(0, 0, 0, 0);
        FUSION_REACTOR.getGui().setEnablePlayerSlots(false);

        HATCH_MUFFLER.getGui().add(IT_IN, 79, 34);

        HATCH_ITEM_I.getGui().add(ULV, IT_IN, 79, 34);
        HATCH_ITEM_I.getGui().add(LV, IT_IN, 70, 25).add(LV, IT_IN, 88, 25).add(LV, IT_IN, 70, 43).add(LV, IT_IN, 88, 43);
        HATCH_ITEM_I.getGui().add(MV, IT_IN, 61, 16).add(MV, IT_IN, 79, 16).add(MV, IT_IN, 97, 16).add(MV, IT_IN, 61, 34).add(MV, IT_IN, 79, 34).add(MV, IT_IN, 97, 34).add(MV, IT_IN, 61, 52).add(MV, IT_IN, 79, 52).add(MV, IT_IN, 97, 52);
        HATCH_ITEM_I.getGui().add(HV, IT_IN, 52, 7).add(HV, IT_IN, 70, 7).add(HV, IT_IN, 88, 7).add(HV, IT_IN, 106, 7).add(HV, IT_IN, 52, 25).add(HV, IT_IN, 70, 25).add(HV, IT_IN, 88, 25).add(HV, IT_IN, 106, 25).add(HV, IT_IN, 52, 43).add(HV, IT_IN, 70, 43).add(HV, IT_IN, 88, 43).add(HV, IT_IN, 106, 43).add(HV, IT_IN, 52, 61).add(HV, IT_IN, 70, 61).add(HV, IT_IN, 88, 61).add(HV, IT_IN, 106, 61);
        HATCH_ITEM_I.getGui().add(EV, HATCH_ITEM_I, HV);
        HATCH_ITEM_I.getGui().add(IV, HATCH_ITEM_I, HV);
        HATCH_ITEM_I.getGui().add(LUV, HATCH_ITEM_I, HV);
        HATCH_ITEM_I.getGui().add(ZPM, HATCH_ITEM_I, HV);
        HATCH_ITEM_I.getGui().add(UV, HATCH_ITEM_I, HV);
        HATCH_ITEM_I.getGui().add(MAX, HATCH_ITEM_I, HV);

        HATCH_ITEM_O.getGui().add(ULV, IT_OUT, 79, 34);
        HATCH_ITEM_O.getGui().add(LV, IT_OUT, 70, 25).add(LV, IT_OUT, 88, 25).add(LV, IT_OUT, 70, 43).add(LV, IT_OUT, 88, 43);
        HATCH_ITEM_O.getGui().add(MV, IT_OUT, 61, 16).add(MV, IT_OUT, 79, 16).add(MV, IT_OUT, 97, 16).add(MV, IT_OUT, 61, 34).add(MV, IT_OUT, 79, 34).add(MV, IT_OUT, 97, 34).add(MV, IT_OUT, 61, 52).add(MV, IT_OUT, 79, 52).add(MV, IT_OUT, 97, 52);
        HATCH_ITEM_O.getGui().add(HV, IT_OUT, 52, 7).add(HV, IT_OUT, 70, 7).add(HV, IT_OUT, 88, 7).add(HV, IT_OUT, 106, 7).add(HV, IT_OUT, 52, 25).add(HV, IT_OUT, 70, 25).add(HV, IT_OUT, 88, 25).add(HV, IT_OUT, 106, 25).add(HV, IT_OUT, 52, 43).add(HV, IT_OUT, 70, 43).add(HV, IT_OUT, 88, 43).add(HV, IT_OUT, 106, 43).add(HV, IT_OUT, 52, 61).add(HV, IT_OUT, 70, 61).add(HV, IT_OUT, 88, 61).add(HV, IT_OUT, 106, 61);
        HATCH_ITEM_O.getGui().add(EV, HATCH_ITEM_O, HV);
        HATCH_ITEM_O.getGui().add(IV, HATCH_ITEM_O, HV);
        HATCH_ITEM_O.getGui().add(LUV, HATCH_ITEM_O, HV);
        HATCH_ITEM_O.getGui().add(ZPM, HATCH_ITEM_O, HV);
        HATCH_ITEM_O.getGui().add(UV, HATCH_ITEM_O, HV);
        HATCH_ITEM_O.getGui().add(MAX, HATCH_ITEM_O, HV);

        HATCH_FLUID_I.getGui().add(FL_IN, 79, 34).add(CELL_IN, 9, 22).add(CELL_OUT, 9, 58);
        HATCH_FLUID_I.getGui().add(LV, HATCH_FLUID_I, ULV);
        HATCH_FLUID_I.getGui().add(MV, HATCH_FLUID_I, ULV);
        HATCH_FLUID_I.getGui().add(HV, HATCH_FLUID_I, ULV);
        HATCH_FLUID_I.getGui().add(EV, FL_IN, 61, 16).add(EV, FL_IN, 79, 16).add(EV, FL_IN, 97, 16).add(EV, FL_IN, 61, 34).add(EV, FL_IN, 79, 34).add(EV, FL_IN, 97, 34).add(EV, FL_IN, 61, 52).add(EV, FL_IN, 79, 52).add(EV, FL_IN, 97, 52);
        HATCH_FLUID_I.getGui().add(IV, HATCH_FLUID_I, ULV);
        HATCH_FLUID_I.getGui().add(LUV, HATCH_FLUID_I, ULV);
        HATCH_FLUID_I.getGui().add(ZPM, HATCH_FLUID_I, ULV);
        HATCH_FLUID_I.getGui().add(UV, HATCH_FLUID_I, ULV);
        HATCH_FLUID_I.getGui().add(MAX, HATCH_FLUID_I, ULV);

        HATCH_FLUID_O.getGui().add(FL_OUT, 79, 34).add(CELL_IN, 9, 22).add(CELL_OUT, 9, 58);
        HATCH_FLUID_O.getGui().add(LV, HATCH_FLUID_O, ULV);
        HATCH_FLUID_O.getGui().add(MV, HATCH_FLUID_O, ULV);
        HATCH_FLUID_O.getGui().add(HV, HATCH_FLUID_O, ULV);
        HATCH_FLUID_O.getGui().add(EV, HATCH_FLUID_O, ULV);
        HATCH_FLUID_O.getGui().add(IV, HATCH_FLUID_O, ULV);
        HATCH_FLUID_O.getGui().add(LUV, HATCH_FLUID_O, ULV);
        HATCH_FLUID_O.getGui().add(ZPM, HATCH_FLUID_O, ULV);
        HATCH_FLUID_O.getGui().add(UV, FL_OUT, 61, 16).add(UV, FL_OUT, 79, 16).add(UV, FL_OUT, 97, 16).add(UV, FL_OUT, 61, 34).add(UV, FL_OUT, 79, 34).add(UV, FL_OUT, 97, 34).add(UV, FL_OUT, 61, 52).add(UV, FL_OUT, 79, 52).add(UV, FL_OUT, 97, 52);
        HATCH_FLUID_O.getGui().add(MAX, HATCH_FLUID_O, ULV);

        TRANSFORMER_DIGITAL.getGui()
                .addButton(10, 18, 14, 14, APAD_LEFT)
                .addButton(25, 18, 14, 14, PAD_LEFT)
                .addButton(10, 33, 14, 14, APAD_LEFT)
                .addButton(25, 33, 14, 14, PAD_LEFT)
                .addButton(10, 48, 14, 14, APAD_LEFT)
                .addButton(25, 48, 14, 14, PAD_LEFT)
                .addButton(10, 63, 14, 14, APAD_LEFT)
                .addButton(25, 63, 14, 14, PAD_LEFT)
                .addButton(137, 18, 14, 14, PAD_RIGHT)
                .addButton(152, 18, 14, 14, APAD_RIGHT)
                .addButton(137, 33, 14, 14, PAD_RIGHT)
                .addButton(152, 33, 14, 14, APAD_RIGHT)
                .addButton(137, 48, 14, 14, PAD_RIGHT)
                .addButton(152, 48, 14, 14, APAD_RIGHT)
                .addButton(137, 63, 14, 14, PAD_RIGHT)
                .addButton(152, 63, 14, 14, APAD_RIGHT);
    }
}

package trinsdar.gt4r.loader.machines;

import muramasa.antimatter.pipe.PipeSize;
import net.minecraft.world.item.ItemStack;
import trinsdar.gt4r.data.GT4RData;

import static muramasa.antimatter.data.AntimatterMaterialTypes.DUST;
import static muramasa.antimatter.data.AntimatterMaterialTypes.INGOT;
import static muramasa.antimatter.data.AntimatterMaterials.*;
import static trinsdar.gt4r.data.Materials.*;
import static trinsdar.gt4r.data.RecipeMaps.WIRE_MILLING;

public class WiremillLoader {

    public static void init() {
        WIRE_MILLING.RB().ii(INGOT.getMaterialIngredient(Lead, 1)).io(new ItemStack(GT4RData.WIRE_LEAD.getBlockItem(PipeSize.VTINY), 4)).add(Lead.getId() + "_wire", 150,64);
        WIRE_MILLING.RB().ii(INGOT.getMaterialIngredient(Tin, 1)).io(new ItemStack(GT4RData.WIRE_TIN.getBlockItem(PipeSize.VTINY), 4)).add(Tin.getId() + "_wire", 150,64);
        WIRE_MILLING.RB().ii(INGOT.getMaterialIngredient(Copper, 1)).io(new ItemStack(GT4RData.WIRE_COPPER.getBlockItem(PipeSize.VTINY), 3)).add(Copper.getId() + "_wire", 100,64);
        WIRE_MILLING.RB().ii(INGOT.getMaterialIngredient(Nickel, 1)).io(new ItemStack(GT4RData.WIRE_NICKEL.getBlockItem(PipeSize.VTINY), 3)).add(Nickel.getId() + "_wire", 100,64);
        WIRE_MILLING.RB().ii(INGOT.getMaterialIngredient(Gold, 1)).io(new ItemStack(GT4RData.WIRE_GOLD.getBlockItem(PipeSize.VTINY), 6)).add(Gold.getId() + "_wire", 200,64);
        WIRE_MILLING.RB().ii(INGOT.getMaterialIngredient(Electrum, 1)).io(new ItemStack(GT4RData.WIRE_ELECTRUM.getBlockItem(PipeSize.VTINY), 6)).add(Electrum.getId() + "_wire", 200,64);
        WIRE_MILLING.RB().ii(INGOT.getMaterialIngredient(Steel, 1)).io(new ItemStack(GT4RData.WIRE_STEEL.getBlockItem(PipeSize.VTINY), 6)).add(Steel.getId() + "_wire", 200,64);
        WIRE_MILLING.RB().ii(INGOT.getMaterialIngredient(Aluminium, 1)).io(new ItemStack(GT4RData.WIRE_ALUMINIUM.getBlockItem(PipeSize.VTINY), 6)).add(Aluminium.getId() + "_wire", 200,64);
        WIRE_MILLING.RB().ii(INGOT.getMaterialIngredient(Osmium, 1)).io(new ItemStack(GT4RData.WIRE_OSMIUM.getBlockItem(PipeSize.VTINY), 4)).add(Osmium.getId() + "_wire", 240,64);
        WIRE_MILLING.RB().ii(INGOT.getMaterialIngredient(Tungsten, 1)).io(new ItemStack(GT4RData.WIRE_TUNGSTEN.getBlockItem(PipeSize.VTINY), 4)).add(Tungsten.getId() + "_wire", 240,64);

        WIRE_MILLING.RB().ii(INGOT.getMaterialIngredient(Kanthal, 4)).io(new ItemStack(GT4RData.KanthalHeatingCoil)).add("kanthal_heating_coil",450, 12);
        WIRE_MILLING.RB().ii(INGOT.getMaterialIngredient(Nichrome, 5)).io(new ItemStack(GT4RData.NichromeHeatingCoil)).add("nichroome_heating_coil",600, 16);
        WIRE_MILLING.RB().ii(INGOT.getMaterialIngredient(Cupronickel, 3)).io(new ItemStack(GT4RData.CupronickelHeatingCoil)).add("cupronickel_heating_coil",300, 8);
        WIRE_MILLING.RB().ii(DUST.getMaterialIngredient(Carbon, 8)).io(new ItemStack(GT4RData.CarbonFibre)).add("carbon_fibre",400, 2);
        WIRE_MILLING.RB().ii(DUST.getMaterialIngredient(Charcoal, 8)).io(new ItemStack(GT4RData.CarbonFibre)).add("carbon_fibre_1",400, 2);
        WIRE_MILLING.RB().ii(DUST.getMaterialIngredient(Coal, 4)).io(new ItemStack(GT4RData.CarbonFibre)).add("carbon_fibre_2",400, 2);
    }
}

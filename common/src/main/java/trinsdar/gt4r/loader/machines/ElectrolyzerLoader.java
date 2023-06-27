package trinsdar.gt4r.loader.machines;

import muramasa.antimatter.data.AntimatterMaterialTypes;
import muramasa.antimatter.data.AntimatterMaterials;
import muramasa.antimatter.material.Material;
import muramasa.antimatter.material.MaterialStack;
import muramasa.antimatter.recipe.ingredient.RecipeIngredient;
import muramasa.antimatter.recipe.map.RecipeBuilder;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.fluids.FluidStack;
import trinsdar.gt4r.data.GT4RMaterialTags;

import java.util.List;
import java.util.stream.Collectors;

import static muramasa.antimatter.data.AntimatterMaterialTypes.*;
import static muramasa.antimatter.data.AntimatterMaterials.*;
import static muramasa.antimatter.recipe.ingredient.RecipeIngredient.*;
import static trinsdar.gt4r.data.GT4RMaterialTags.ELEC;
import static trinsdar.gt4r.data.Materials.*;
import static trinsdar.gt4r.data.RecipeMaps.ELECTROLYZING;

public class ElectrolyzerLoader {
    static boolean breakMethod = true;
    public static void init() {

        // TODO: Re-add when duration issue is fixed
//        ELEC.all().forEach(m -> {
//            int power = 0;
//            if (m.has(GT4RMaterialTags.ELEC30)) power = 30;
//            if (m.has(GT4RMaterialTags.ELEC60)) power = 60;
//            if (m.has(GT4RMaterialTags.ELEC90)) power = 90;
//            if (m.has(GT4RMaterialTags.ELEC120)) power = 120;
//            if (power == 0) return;
//            if (!m.has(DUST) && !m.has(LIQUID) && !m.has(GAS)) return;
//            int count = m.getProcessInto().stream().mapToInt(t -> t.s).sum();
//            if (m.has(LIQUID) || m.has(GAS)) count *= 4;
//            add(m, power, (int) m.getMass() * count);
//        });

        ELECTROLYZING.RB().fi(Water.getLiquid(3000)).fo(Hydrogen.getGas(2000), Oxygen.getGas(1000)).add("water",2000, 30);
        ELECTROLYZING.RB().ii(RecipeIngredient.of(new ItemStack(Items.BONE_MEAL, 3))).io(DUST.get(Calcium, 1)).add("bone_meal",24, 106);
        ELECTROLYZING.RB().ii(RecipeIngredient.of(new ItemStack(Blocks.SAND, 8))).io(DUST.get(SiliconDioxide, 1)).add("sand",500, 25);
        ELECTROLYZING.RB().ii(RecipeIngredient.of(new ItemStack(Blocks.RED_SAND, 8))).io(DUST.get(SiliconDioxide, 1), DUST_TINY.get(Iron, 1)).add("red_sand",500, 25);
        ELECTROLYZING.RB().ii(RecipeIngredient.of(DUST.get(Diamond, 1))).io(DUST.get(Carbon, 64), DUST.get(Carbon, 64)).add("diamond_dust",1536,60);
        add(Steel,50, 60, 2600);
        add(DarkAsh, 1, 30, 24);
        add(AntimatterMaterials.Coal, 1, 30, 24);
//        if (breakMethod) return;

        add(SodiumPersulfate, 90, 432); //close
        add(Methane, 60, 80); // close: 1 sec off
        //add(Sugar, 90, 448);
        add(Glyceryl, 90, 800); // close

        //add(Apatite, 90, 288);

        //add(NitroCarbon, 60, 96);
        add(Lazurite, 120, 392); // fixed
        add(Galena, 90, 832); // slightly over
        //add(CalciumCarbonate, 90, 400);
        add(Salt, 30,320); // far under

        // GT4 Reference
        ELECTROLYZING.RB().fi(Water.getLiquid(3000)).fo(Hydrogen.getGas(2000), Oxygen.getGas(1000)).add(Water.getId(), 215, 120);
        ELECTROLYZING.RB().ii(of(DUST.get(Uvarovite, 20))).fo(Oxygen.getGas(12000)).io(DUST.get(Calcium, 3), DUST.get(Chrome, 2), DUST.get(Silicon, 3)).add(Uvarovite.getId(), 480, 120);
        ELECTROLYZING.RB().ii(of(DUST.get(Tungstate, 7))).fo(Oxygen.getGas(4000)).io(DUST.get(Tungsten, 1), DUST.get(Lithium, 2)).add(Tungstate.getId(), 480, 120);
        ELECTROLYZING.RB().fi(SulfuricAcid.getLiquid(7000)).fo(Hydrogen.getGas(2000), Oxygen.getGas(4000)).io(DUST.get(Sulfur, 1)).add(SulfuricAcid.getId(), 392, 90);
        ELECTROLYZING.RB().ii(of(DUST.get(Spessartine, 20))).fo(Oxygen.getGas(12000)).io(DUST.get(Aluminium, 2), DUST.get(Manganese, 3), DUST.get(Silicon, 3)).add(Spessartine.getId(), 440, 120);
        ELECTROLYZING.RB().fi(SodiumPersulfate.getLiquid(6000)).fo(Oxygen.getGas(4000)).io(DUST.get(Sodium, 1), DUST.get(Sulfur, 1)).add(SodiumPersulfate.getId(), 432, 90);
        ELECTROLYZING.RB().ii(of(DUST.get(SiliconDioxide, 3))).fo(Oxygen.getGas(2000)).io(DUST.get(Silicon)).add(SiliconDioxide.getId(), 60, 60);
        ELECTROLYZING.RB().ii(of(DUST.get(Sapphire, 5))).fo(Oxygen.getGas(3000)).io(DUST.get(Aluminium, 2)).add(Sapphire.getId(), 100, 60);
        ELECTROLYZING.RB().ii(of(DUST.get(Saltpeter, 5))).fo(Nitrogen.getGas(1000), Oxygen.getGas(3000)).io(DUST.get(Potassium)).add(Saltpeter.getId(), 100, 90);
        ELECTROLYZING.RB().ii(of(DUST.get(Ruby, 6))).fo(Oxygen.getGas(3000)).io(DUST.get(Chrome, 1), DUST.get(Aluminium, 2)).add(Ruby.getId(), 144, 90);
        ELECTROLYZING.RB().ii(of(DUST.get(RedGranite, 6))).fo(Oxygen.getGas(3000)).io(DUST.get(Aluminium, 2), DUST.get(PotassiumFeldspar, 1)).add(RedGranite.getId(), 120, 90);
        ELECTROLYZING.RB().ii(of(DUST.get(Pyrope, 20))).fo(Oxygen.getGas(12000)).io(DUST.get(Aluminium, 2), DUST.get(Magnesium, 3), DUST.get(Silicon, 3)).add(Pyrope.getId(), 400, 120);
        ELECTROLYZING.RB().ii(of(DUST.get(Prismarine, 16))).fo(Oxygen.getGas(8000)).io(DUST.get(Potassium, 2), DUST.get(Manganese, 1), DUST.get(Silicon, 5)).add(Prismarine.getId(), 500, 30);
        ELECTROLYZING.RB().ii(of(DUST.get(PotassiumFeldspar, 13))).fo(Oxygen.getGas(8000)).io(DUST.get(Potassium, 2), DUST.get(Aluminium, 1), DUST.get(Silicon, 3)).add(PotassiumFeldspar.getId(), 260, 120);
        ELECTROLYZING.RB().ii(of(DUST.get(Phosphate, 6))).fo(Oxygen.getGas(4000)).io(DUST.get(Phosphor, 1)).add(Phosphate.getId(), 90, 60);
        ELECTROLYZING.RB().ii(of(DUST.get(Olivine, 8))).fo(Oxygen.getGas(4000)).io(DUST.get(Magnesium, 2), DUST.get(Iron, 1), DUST.get(Silicon, 1)).add(Olivine.getId(), 140, 90);
        ELECTROLYZING.RB().ii(of(DUST.get(Obsidian, 12))).fo(Oxygen.getGas(8000)).io(DUST.get(Magnesium, 1), DUST.get(Iron, 1), DUST.get(Silicon, 2)).add(Obsidian.getId(), 140, 90);
        ELECTROLYZING.RB().fi(NitrogenDioxide.getGas(3000)).fo(Nitrogen.getGas(1000), Oxygen.getGas(2000)).add(NitrogenDioxide.getId(), 168, 60);
        ELECTROLYZING.RB().ii(of(DUST.get(Magnesite, 5))).fo(Oxygen.getGas(3000)).io(DUST.get(Magnesium, 1), DUST.get(Carbon, 1)).add(Magnesite.getId(), 80, 90);
        ELECTROLYZING.RB().ii(of(DUST.get(Grossular, 20))).fo(Oxygen.getGas(12000)).io(DUST.get(Calcium, 3), DUST.get(Aluminium, 2), DUST.get(Silicon, 3)).add(Grossular.getId(), 440, 120);
        ELECTROLYZING.RB().fi(Glyceryl.getLiquid(20000)).fo(Hydrogen.getGas(5000), Nitrogen.getGas(3000), Oxygen.getGas(9000)).io(DUST.get(Carbon, 3)).add(Glyceryl.getId(), 800, 90);
        ELECTROLYZING.RB().ii(of(DUST.get(Emerald, 29))).fo(Oxygen.getGas(18000)).io(DUST.get(Beryllium, 3), DUST.get(Aluminium, 2), DUST.get(Silicon, 6)).add(Emerald.getId(), 522, 120);
        ELECTROLYZING.RB().ii(of(DUST.get(Chromite, 7))).fo(Oxygen.getGas(4000)).io(DUST.get(Iron, 1), DUST.get(Chrome, 2)).add(Chromite.getId(), 210, 90);
        ELECTROLYZING.RB().ii(of(DUST.get(Cassiterite, 3))).fo(Oxygen.getGas(6000)).io(DUST.get(Tin, 3)).add(Cassiterite.getId(), 396, 60);
        ELECTROLYZING.RB().ii(of(DUST.get(Calcite, 5))).fo(Oxygen.getGas(3000)).io(DUST.get(Calcium, 1), DUST.get(Carbon, 1)).add(Calcite.getId(), 100, 90);
        ELECTROLYZING.RB().ii(of(DUST.get(Biotite, 22))).fo(Fluorine.getGas(2000), Oxygen.getGas(10000)).io(DUST.get(Potassium, 1), DUST.get(Magnesium, 3), DUST.get(Aluminium, 3), DUST.get(Silicon, 3)).add(Biotite.getId(), 440, 120);
        ELECTROLYZING.RB().ii(of(DUST.get(Bauxite, 39))).fo(Hydrogen.getGas(10000), Oxygen.getGas(12000)).io(DUST.get(Titanium, 1), DUST.get(Aluminium, 16)).add(Bauxite.getId(), 624, 120);
        ELECTROLYZING.RB().ii(of(DUST.get(Andradite, 20))).fo(Oxygen.getGas(12000)).io(DUST.get(Calcium, 3), DUST.get(Iron, 2), DUST.get(Silicon, 3)).add(Andradite.getId(), 480, 120);
        ELECTROLYZING.RB().ii(of(DUST.get(Almandine, 20))).fo(Oxygen.getGas(12000)).io(DUST.get(Aluminium, 2), DUST.get(Iron, 3), DUST.get(Silicon, 3)).add(Almandine.getId(), 480, 120);
    }

    private static void add(Material dust, long euT, int duration) {
        add(dust, dust.getProcessInto().stream().mapToInt(t -> t.s).sum(), euT, duration);
    }

    private static void add(Material dust, int count, long euT, int duration) {
        List<MaterialStack> stacks = dust.getProcessInto();
        List<FluidStack> fluidStacks = stacks.stream().filter(t -> (t.m.has(LIQUID) || t.m.has(GAS)) && !t.m.has(DUST)).map(t -> {
            return t.m.has(LIQUID) ? t.m.getLiquid(t.s * 1000) : t.m.getGas(t.s * 1000);
        }).toList();
        List<ItemStack> itemStacks = dust.getProcessInto().stream().filter(t -> t.m.has(DUST)).map(t -> new ItemStack(DUST.get(t.m), t.s)).toList();
        RecipeBuilder rb = ELECTROLYZING.RB();
        String suffix = dust.has(LIQUID) ? "_liquid" : dust.has(GAS) ? "_gas" :"_dust";
        if ((dust.has(LIQUID) || dust.has(GAS)) && !dust.has(DUST)){
            rb.fi(getFluid(dust,count * 1000));
        } else {
            rb.ii(RecipeIngredient.of(DUST.get(dust), count));
        }
        if (!itemStacks.isEmpty()) rb.io(itemStacks.toArray(new ItemStack[0]));
        if (!fluidStacks.isEmpty()) rb.fo(fluidStacks.toArray(new FluidStack[0]));
        rb.add(dust.getId() + suffix, duration, euT);
    }

    private static FluidStack getFluid(Material mat, int amount){
        if (mat.has(LIQUID)){
            return mat.getLiquid(amount);
        } else if (mat.has(GAS)){
            return mat.getGas(amount);
        } else if (mat.has(AntimatterMaterialTypes.PLASMA)){
            return mat.getPlasma(amount);
        } else {
            return mat.getLiquid(amount);
        }
    }
}

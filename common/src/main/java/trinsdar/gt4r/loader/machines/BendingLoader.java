package trinsdar.gt4r.loader.machines;

import muramasa.antimatter.data.AntimatterMaterialTypes;
import muramasa.antimatter.data.AntimatterMaterials;
import muramasa.antimatter.material.Material;
import muramasa.antimatter.recipe.ingredient.RecipeIngredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import trinsdar.gt4r.data.GT4RData;

import static muramasa.antimatter.data.AntimatterMaterialTypes.*;
import static muramasa.antimatter.data.AntimatterMaterials.*;
import static trinsdar.gt4r.data.Materials.*;
import static trinsdar.gt4r.data.RecipeMaps.BENDING;

public class BendingLoader {
    public static void init() {
        // TODO: Re-add when duration issue is fixed
//        AntimatterMaterialTypes.PLATE.all().forEach(t -> {
//            long duration = Math.max(t.getMass(), 1);
//            if (!t.has(INGOT)) return;
//            BENDING.RB().ii(INGOT.getMaterialIngredient(t,1), GT4RData.INT_CIRCUITS.get(1)).io(PLATE.get(t,1)).add(t.getId() + "_plate", duration, 24);
//        });
        AntimatterMaterialTypes.PLATE_DENSE.all().forEach(t -> {
            long duration = Math.max(t.getMass(), 1);
            if (!t.has(INGOT)) return;
            BENDING.RB().ii(INGOT.getMaterialIngredient(t,9), GT4RData.INT_CIRCUITS.get(9)).io(PLATE_DENSE.get(t,1)).add(t.getId() + "_dense_plate", duration, 24);
        });
        AntimatterMaterialTypes.RING.all().forEach(m -> {
            long duration = Math.max(m.getMass(), 1);
            if (!m.has(ROD)) return;
            BENDING.RB().ii(ROD.getMaterialIngredient(m, 1), GT4RData.INT_CIRCUITS.get(1)).io(RING.get(m, 2)).add(m.getId() + "_ring", duration, 24);
        });
        BENDING.RB().ii(RecipeIngredient.of(GT4RData.MixedMetal, 1)).io(new ItemStack(GT4RData.AdvancedAlloy)).add("advanced_alloy",100, 8);
        BENDING.RB().ii(PLATE.getMaterialIngredient(Tin, 2)).io(new ItemStack(GT4RData.CellTin)).add("tin_cell",200, 8);
        BENDING.RB().ii(PLATE.getMaterialIngredient(Iron, 3)).io(new ItemStack(Items.BUCKET)).add("bucket",200, 4);

        addRecipe(Iron, 100);
        addRecipe(Gold, 380);
        addRecipe(Netherite, 294);
        addRecipe(Rubber, 68);
        addRecipe(Bronze, 140);
        addRecipe(Steel, 100);
        addRecipe(StainlessSteel, 100);
        addRecipe(Invar, 100);
        addRecipe(Tungsten, 360);
        addRecipe(TungstenSteel, 220);
        addRecipe(Copper, 120);
        addRecipe(Aluminium, 40);
        addRecipe(Beryllium, 17);
        addRecipe(Carbon, 36);
        addRecipe(Chrome, 100);
        addRecipe(Iridium, 380);
        addRecipe(Lead, 400);
        addRecipe(Nickel, 100);
        addRecipe(Osmium, 380);
        addRecipe(Platinum, 380);
        addRecipe(Silver, 200);
        addRecipe(Titanium, 80);
        addRecipe(Silicon, 40);
        addRecipe(Tin, 220);
        addRecipe(Zinc, 120);
        addRecipe(Technetium, 294);
        addRecipe(BatteryAlloy, 360);
        addRecipe(Brass, 120);
        addRecipe(Cupronickel, 120);
        addRecipe(Electrum, 300);
        addRecipe(Kanthal, 80);
        addRecipe(Magnalium, 40);
        addRecipe(SolderingAlloy, 220);
        addRecipe(WroughtIron, 100);
        addRecipe(TungstenCarbide, 291);
        addRecipe(RedAlloy, 430);
        addRecipe(Osmiridium, 180);
        addRecipe(IronMagnetic, 100);
        addRecipe(SteelMagnetic, 100);
    }

    public static void addRecipe(Material mat, int duration) {
        BENDING.RB().ii(INGOT.getMaterialIngredient(mat, 1), GT4RData.INT_CIRCUITS.get(1)).io(PLATE.get(mat, 1)).add(mat.getId() + "_plate", duration, 24);
    }
}

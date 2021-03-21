package trinsdar.gt4r.loader.machines;

import muramasa.antimatter.recipe.ingredient.AntimatterIngredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import trinsdar.gt4r.data.GT4RData;

import static muramasa.antimatter.Data.*;
import static trinsdar.gt4r.data.Materials.Iron;
import static trinsdar.gt4r.data.Materials.Tin;
import static trinsdar.gt4r.data.RecipeMaps.BENDING;

public class BendingLoader {
    public static void init() {
        PLATE.all().forEach(t -> {
            long duration = Math.max(t.getMass(), 1);
            if (!t.has(INGOT)) return;
            BENDING.RB().ii(INGOT.getMaterialIngredient(t,1), GT4RData.INT_CIRCUITS.get(1)).io(PLATE.get(t,1)).add(duration, 24);
        });
        PLATE_DENSE.all().forEach(t -> {
            long duration = Math.max(t.getMass(), 1);
            if (!t.has(INGOT)) return;
            BENDING.RB().ii(INGOT.getMaterialIngredient(t,9), GT4RData.INT_CIRCUITS.get(9)).io(PLATE_DENSE.get(t,1)).add(duration, 24);
        });
        BENDING.RB().ii(AntimatterIngredient.of(GT4RData.MixedMetal, 1)).io(new ItemStack(GT4RData.AdvancedAlloy)).add(100, 8);
        BENDING.RB().ii(PLATE.getMaterialIngredient(Tin, 2)).io(new ItemStack(GT4RData.CellTin)).add(200, 8);
        BENDING.RB().ii(PLATE.getMaterialIngredient(Iron, 3)).io(new ItemStack(Items.BUCKET)).add(200, 4);
    }
}

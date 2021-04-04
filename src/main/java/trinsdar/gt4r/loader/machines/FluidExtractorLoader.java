package trinsdar.gt4r.loader.machines;

import muramasa.antimatter.material.Material;
import muramasa.antimatter.recipe.ingredient.RecipeIngredient;
import net.minecraft.item.Item;

import static muramasa.antimatter.Data.*;
import static trinsdar.gt4r.data.RecipeMaps.FLUID_EXTRACTING;

public class FluidExtractorLoader {
    public static void init() {
        ROD.all().forEach(r -> {
            add(r, ROD.get(r), 72);
        });
        PLATE.all().forEach(r -> {
            add(r, PLATE.get(r), 144);
        });
        INGOT.all().forEach(r -> {
            add(r, INGOT.get(r), 72);
        });
        GEAR.all().forEach(r -> {
            add(r, GEAR.get(r), 144*4);
        });
        PLATE_DENSE.all().forEach(r -> {
            add(r, PLATE_DENSE.get(r), 144*9);
        });
    }

    private static void add(Material m, Item i, int amount) {
        if (!m.has(LIQUID)) return;
        FLUID_EXTRACTING.RB()
                .ii(RecipeIngredient.of(i,1))
                .fo(m.getLiquid(amount))
                .add(m.getMass()*amount/144, 64);
    }
}

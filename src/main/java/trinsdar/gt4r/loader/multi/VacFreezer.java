package trinsdar.gt4r.loader.multi;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import static muramasa.antimatter.Data.INGOT;
import static muramasa.antimatter.Data.INGOT_HOT;
import static trinsdar.gt4r.data.RecipeMaps.VACUUM_FREEZING;
import static muramasa.antimatter.recipe.ingredient.AntimatterIngredient.*;

public class VacFreezer {
    public static void init() {
        INGOT_HOT.all().forEach(hi -> {
            Item ingot = INGOT.get(hi);
            VACUUM_FREEZING.RB().ii(of(INGOT_HOT.get(hi),1))
                    .io(new ItemStack(ingot,1)).add(hi.getMass(), 120);
        });
    }
}

package trinsdar.gt4r.loader.machines;

import muramasa.antimatter.data.AntimatterMaterialTypes;
import muramasa.antimatter.data.AntimatterMaterials;
import muramasa.antimatter.material.Material;
import muramasa.antimatter.material.MaterialTags;
import net.minecraft.world.item.ItemStack;

import static muramasa.antimatter.recipe.ingredient.RecipeIngredient.of;
import static trinsdar.gt4r.data.RecipeMaps.ORE_WASHING;

public class WasherLoader {
    public static void init() {
        AntimatterMaterialTypes.CRUSHED.all().forEach(m -> {
            if (!m.has(AntimatterMaterialTypes.CRUSHED_PURIFIED)) return;
            ItemStack stoneDust = AntimatterMaterialTypes.DUST.get(AntimatterMaterials.Stone, 1);

            Material aOreByProduct1 = m.getByProducts().size() >= 1 ? m.getByProducts().get(0) : MaterialTags.MACERATE_INTO.getMapping(m);
            //Material aOreByProduct2 = m.getByProducts().size() >= 2 ? m.getByProducts().get(1) : aOreByProduct1;
            ORE_WASHING.RB().fi(AntimatterMaterials.Water.getLiquid(1000)).ii(of(AntimatterMaterialTypes.CRUSHED.get(m,1))).io(AntimatterMaterialTypes.CRUSHED_PURIFIED.get(m,1), AntimatterMaterialTypes.DUST_TINY.get(aOreByProduct1,1), stoneDust).add(200, 24);
        });
    }
}

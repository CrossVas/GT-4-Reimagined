package trinsdar.gt4r.loader.machines;

import muramasa.antimatter.AntimatterAPI;
import muramasa.antimatter.AntimatterConfig;
import muramasa.antimatter.data.AntimatterMaterialTypes;
import muramasa.antimatter.data.AntimatterMaterials;
import muramasa.antimatter.material.Material;
import muramasa.antimatter.ore.CobbleStoneType;
import muramasa.antimatter.ore.StoneType;
import muramasa.antimatter.recipe.ingredient.RecipeIngredient;
import muramasa.antimatter.util.TagUtils;
import muramasa.antimatter.util.Utils;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import trinsdar.gt4r.Ref;
import muramasa.antimatter.data.ForgeCTags;

import static muramasa.antimatter.data.AntimatterMaterialTypes.*;
import static muramasa.antimatter.data.AntimatterMaterials.*;
import static muramasa.antimatter.data.AntimatterMaterials.Copper;
import static muramasa.antimatter.material.MaterialTags.MACERATE_INTO;
import static muramasa.antimatter.material.MaterialTags.ORE_MULTI;
import static muramasa.antimatter.material.MaterialTags.RUBBERTOOLS;
import static trinsdar.gt4r.data.Materials.*;
import static trinsdar.gt4r.data.RecipeMaps.HAMMERING;

public class ForgeHammerLoader {

    static int in = AntimatterConfig.GAMEPLAY.LOSSY_PART_CRAFTING ? 3 : 1;
    static int out = AntimatterConfig.GAMEPLAY.LOSSY_PART_CRAFTING ? 2 : 1;

    public static void init(){
        AntimatterMaterialTypes.CRUSHED.all().forEach(m -> {
            if (!m.has(AntimatterMaterialTypes.ORE) && m != AntimatterMaterials.Gold && m != AntimatterMaterials.Iron && m != AntimatterMaterials.Diamond && m != AntimatterMaterials.Emerald && m != AntimatterMaterials.Lapis && m != AntimatterMaterials.Redstone) return;
            int multiplier = 1;
            RecipeIngredient ore = RecipeIngredient.of(TagUtils.getForgelikeItemTag("sandless_ores/" + m.getId()),1), crushed = AntimatterMaterialTypes.CRUSHED.getIngredient(m, 1);
            ItemStack crushedStack = AntimatterMaterialTypes.CRUSHED.get(m,1);

            HAMMERING.RB().ii(ore).io(Utils.ca(ORE_MULTI.getInt(m) * multiplier, crushedStack)).add(m.getId() + "_ore",16, 10);
            HAMMERING.RB().ii(crushed).io(DUST_IMPURE.get(MACERATE_INTO.getMapping(m), 1)).add(m.getId() + "_crushed_ore",16, 10);
            HAMMERING.RB().ii(RecipeIngredient.of(CRUSHED_PURIFIED.get(m,1))).io(DUST_PURE.get(MACERATE_INTO.getMapping(m), 1)).add(m.getId() + "_purified_ore",16, 10);
            if (m.has(CRUSHED_REFINED)) {
                HAMMERING.RB().ii(RecipeIngredient.of(CRUSHED_REFINED.get(m,1))).io(DUST.get(MACERATE_INTO.getMapping(m), 1)).add(m.getId() + "_centrifuged_ore",16, 10);
            }
            if (m.has(RAW_ORE)){
                HAMMERING.RB().ii(RecipeIngredient.of(RAW_ORE.getMaterialTag(m), 1)).io(Utils.ca((ORE_MULTI.getInt(m) * multiplier), crushedStack)).add(m.getId() + "_raw_ore",16, 10);
            }
        });
//        AntimatterMaterialTypes.PLATE.all().stream().filter(m -> m.has(AntimatterMaterialTypes.INGOT) && !m.has(RUBBERTOOLS)).forEach(m -> {
//            int in = AntimatterConfig.GAMEPLAY.LOSSY_PART_CRAFTING ? 3 : 1;
//            int out = AntimatterConfig.GAMEPLAY.LOSSY_PART_CRAFTING ? 2 : 1;
//            HAMMERING.RB().ii(INGOT.getMaterialIngredient(m, in)).io(PLATE.get(m, out)).add(m.getId() + "_plate", m.getMass(), 16);
//        });
        AntimatterAPI.all(StoneType.class, Ref.ID, s -> {
            if (!(s instanceof CobbleStoneType)) return;
            HAMMERING.RB().ii(RecipeIngredient.of(((CobbleStoneType)s).getBlock(""), 1)).io(new ItemStack(((CobbleStoneType)s).getBlock("cobble"))).add(s.getId() + "_to_cobble",10, 16);
        });
        HAMMERING.RB().ii(RecipeIngredient.of(ForgeCTags.COBBLESTONE, 1)).io(new ItemStack(Items.GRAVEL)).add("gravel",10, 16);
        HAMMERING.RB().ii(RecipeIngredient.of(Items.STONE, 1)).io(new ItemStack(Items.COBBLESTONE)).add("cobblestone",10, 16);
        HAMMERING.RB().ii(RecipeIngredient.of(ForgeCTags.GRAVEL, 1)).io(new ItemStack(Items.SAND)).add("sand",10, 16);
        HAMMERING.RB().ii(RecipeIngredient.of(Items.BRICK, 1)).io(DUST_SMALL.get(Brick, 1)).add("brick_dust_small",10, 16);
        HAMMERING.RB().ii(RecipeIngredient.of(Items.BRICKS, 1)).io(DUST.get(Brick, 1)).add("brick_dust",40, 16);

        // Plates
        // BRONZE: duration * 3
        addRecipe(Iron, 168);
        addRecipe(Gold, 588);
        addRecipe(Netherite, 294);
        addRecipe(Rubber, 36);
        addRecipe(Bronze, 228);
        addRecipe(Steel, 165);
        addRecipe(StainlessSteel, 294);
        addRecipe(Invar, 168);
        addRecipe(Tungsten, 549);
        addRecipe(TungstenSteel, 357);
        addRecipe(Copper, 189);
        addRecipe(Aluminium, 78);
        addRecipe(Beryllium, 27);
        addRecipe(Carbon, 36);
        addRecipe(Chrome, 156);
        addRecipe(Iridium, 576);
        addRecipe(Lead, 621);
        addRecipe(Nickel, 174);
        addRecipe(Osmium, 570);
        addRecipe(Platinum, 585);
        addRecipe(Silver, 321);
        addRecipe(Titanium, 144);
        addRecipe(Silicon, 84);
        addRecipe(Tin, 354);
        addRecipe(Zinc, 195);
        addRecipe(Technetium, 294);
        addRecipe(BatteryAlloy, 567);
        addRecipe(Brass, 189);
        addRecipe(Cupronickel, 180);
        addRecipe(Electrum, 453);
        addRecipe(Kanthal, 132);
        addRecipe(Magnalium, 75);
        addRecipe(SolderingAlloy, 354);
        addRecipe(WroughtIron, 168);
        addRecipe(TungstenCarbide, 291);
        addRecipe(RedAlloy, 240);
        addRecipe(Osmiridium, 573);
        addRecipe(IronMagnetic, 168);
        addRecipe(SteelMagnetic, 165);
    }

    public static void addRecipe(Material mat, int duration) {
        HAMMERING.RB().ii(INGOT.getMaterialIngredient(mat, in)).io(PLATE.get(mat, out)).add(mat.getId() + "_plate", duration, 16);
    }
}

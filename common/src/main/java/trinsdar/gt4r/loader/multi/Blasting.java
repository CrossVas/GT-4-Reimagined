package trinsdar.gt4r.loader.multi;

import muramasa.antimatter.util.TagUtils;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import trinsdar.gt4r.Ref;

import static muramasa.antimatter.data.AntimatterMaterialTypes.*;
import static muramasa.antimatter.data.AntimatterMaterials.*;
import static muramasa.antimatter.recipe.ingredient.RecipeIngredient.of;
import static trinsdar.gt4r.data.CustomTags.DUSTS_COALS;
import static trinsdar.gt4r.data.Materials.*;
import static trinsdar.gt4r.data.RecipeMaps.BASIC_BLASTING;
import static trinsdar.gt4r.data.RecipeMaps.BLASTING;

public class Blasting {
    public static int mixedOreYield = Ref.mixedOreYieldsTwoThirdsPureOre ? 2 : 3;

    public static void init() {
        BASIC_BLASTING.RB().ii(DUST.getMaterialIngredient(CoalCoke, 2), INGOT.getMaterialIngredient(Iron, 1)).io(INGOT.get(Steel,1), DUST_TINY.get(DarkAsh, 2)).add("steel",4800);
        BASIC_BLASTING.RB().ii(of(DUSTS_COALS, 4), INGOT.getMaterialIngredient(Iron, 1)).io(INGOT.get(Steel,1), DUST_TINY.get(DarkAsh, 4)).add("steel_1",7200);
        BASIC_BLASTING.RB().ii(of(DUSTS_COALS, 2), DUST.getMaterialIngredient(Steel, 1)).io(INGOT.get(Steel,1), DUST_TINY.get(DarkAsh, 2)).add("steel_2",7200);
        BASIC_BLASTING.RB().ii(GEM.getMaterialIngredient(CoalCoke, 2), INGOT.getMaterialIngredient(Iron, 1)).io(INGOT.get(Steel,1), DUST_TINY.get(DarkAsh, 2)).add("steel_3",4800);
        BASIC_BLASTING.RB().ii(of(TagUtils.getItemTag(new ResourceLocation("minecraft", "coals")), 4), INGOT.getMaterialIngredient(Iron, 1)).io(INGOT.get(Steel,1), DUST_TINY.get(DarkAsh, 4)).add("steel_4",7200);
        BASIC_BLASTING.RB().ii(DUST.getMaterialIngredient(Carbon, 2), INGOT.getMaterialIngredient(Iron, 1)).io(INGOT.get(Steel,1), DUST_TINY.get(DarkAsh, 2)).add("steel_5",7200);
        BASIC_BLASTING.RB().ii(DUST.getMaterialIngredient(Galena, 2), of(DUSTS_COALS, 1)).io(INGOT.get(Lead, 1), INGOT.get(Silver, 1), DUST_TINY.get(DarkAsh, 1)).add("galena",7200);
        BASIC_BLASTING.RB().ii(DUST.getMaterialIngredient(Galena, 4), DUST.getMaterialIngredient(CoalCoke, 1)).io(INGOT.get(Lead, 2), INGOT.get(Silver, 2), DUST_TINY.get(DarkAsh, 2)).add("galena_1",14400);
        BASIC_BLASTING.RB().ii(DUST.getMaterialIngredient(Pyrite, 3), DUST.getMaterialIngredient(Calcite, 1), of(DUSTS_COALS, 1)).io(new ItemStack(Items.IRON_INGOT, 2), DUST_TINY.get(DarkAsh, 1)).add("iron",1200);
        BASIC_BLASTING.RB().ii(of(ORE.getMaterialTag(Iron), 1), DUST.getMaterialIngredient(Calcite, 1), of(DUSTS_COALS, 1)).io(new ItemStack(Items.IRON_INGOT, 3), DUST_TINY.get(DarkAsh, 1)).add("iron_1",1200);
        BASIC_BLASTING.RB().ii(DUST.getMaterialIngredient(Galena, 2), of(TagUtils.getItemTag(new ResourceLocation("minecraft", "coals")), 1)).io(INGOT.get(Lead, 1), INGOT.get(Silver, 1), DUST_TINY.get(DarkAsh, 1)).add("galena_2",1200);
        BASIC_BLASTING.RB().ii(DUST.getMaterialIngredient(Galena, 4), GEM.getMaterialIngredient(CoalCoke, 1)).io(INGOT.get(Lead, 2), INGOT.get(Silver, 2), DUST_TINY.get(DarkAsh, 2)).add("galena_3",2400);
        BASIC_BLASTING.RB().ii(DUST.getMaterialIngredient(Pyrite, 3), DUST.getMaterialIngredient(Calcite, 1), of(TagUtils.getItemTag(new ResourceLocation("minecraft", "coals")), 1)).io(new ItemStack(Items.IRON_INGOT, 2), DUST_TINY.get(DarkAsh, 1)).add("iron_2",1200);
        BASIC_BLASTING.RB().ii(of(ORE.getMaterialTag(Iron), 1), DUST.getMaterialIngredient(Calcite, 1), of(TagUtils.getItemTag(new ResourceLocation("minecraft", "coals")), 1)).io(new ItemStack(Items.IRON_INGOT, 3), DUST_TINY.get(DarkAsh, 1)).add("iron_3",1200);
        // TODO: Re-add this when duration issue is fixed
//        DUST.all().forEach(m -> {
//            if (m.has(GT4RMaterialTags.NEEDS_BLAST_FURNACE) && m.has(GT4RMaterialTags.BLAST_FURNACE_TEMP)){
//                ItemStack ingot = DIRECT_SMELT_INTO.getMapping(m).has(INGOT_HOT) ? INGOT_HOT.get(DIRECT_SMELT_INTO.getMapping(m), 1) : INGOT.get(DIRECT_SMELT_INTO.getMapping(m), 1);
//                int heat = GT4RMaterialTags.BLAST_FURNACE_TEMP.getInt(m);
//                BLASTING.RB().ii(DUST.getMaterialIngredient(m, 1)).io(ingot).add(DIRECT_SMELT_INTO.getMapping(m).getId() + "_ingot_from_" + m.getId() + "_dust", Math.max(m.getMass() * 10L, 1L)* heat / 200, 120, heat);
//            }
//        });
//        BLASTING.RB().ii(of(TagUtils.getForgelikeItemTag("ores/iron"), 1), of(DUST.get(Calcite, 1))).io(new ItemStack(Items.IRON_INGOT, 3), DUST.get(DarkAsh, 1)).add("iron",500, 120, 1500);
//        BLASTING.RB().ii(of(DUST.get(Pyrite, 3)), of(DUST.get(Calcite, 1))).io(new ItemStack(Items.IRON_INGOT, 2)).add("iron_1",500, 120, 1500);
//        BLASTING.RB().ii(of(INGOT.get(Iron, 1)), of(DUST.get(Carbon, 1))).io(INGOT.get(Steel, 1)).add("steel_1",600, 120, GT4RMaterialTags.BLAST_FURNACE_TEMP.getInt(Steel));
//        BLASTING.RB().ii(of(INGOT.get(Iron, 1)), of(DUST.get(CoalCoke, 1))).io(INGOT.get(Steel, 1)).add("steel_2",600, 120, GT4RMaterialTags.BLAST_FURNACE_TEMP.getInt(Steel));
//        BLASTING.RB().ii(of(INGOT.get(Tungsten,1)), of(INGOT.get(Steel,1))).io(INGOT_HOT.get(TungstenSteel, 2), DUST.get(DarkAsh, 4)).add("tungsten_steel",1700, 120, GT4RMaterialTags.BLAST_FURNACE_TEMP.getInt(TungstenSteel));
//        BLASTING.RB().ii(of(DUST.get(NetheriteScrap,4)), of(INGOT.get(Gold,4))).io(INGOT.get(Netherite, 1), DUST.get(DarkAsh, 4)).add("netherrite",1700, 120, GT4RMaterialTags.BLAST_FURNACE_TEMP.getInt(Netherite));
//        BLASTING.RB().ii(of(INGOT.get(Tungsten,1)), of(DUST.get(Carbon,1))).io(INGOT_HOT.get(TungstenCarbide, 2), DUST.get(DarkAsh, 4)).add("tungsten_carbide",1700, 120, GT4RMaterialTags.BLAST_FURNACE_TEMP.getInt(TungstenCarbide));
//        BLASTING.RB().ii(of(DUST.get(Galena,2))).io(INGOT.get(Lead, 1), INGOT.get(Silver, 1)).add("galena",600, 120, 1500);
//        BLASTING.RB().ii(of(INGOT.get(Osmium,1)), of(INGOT.get(Iridium, 1))).io(INGOT_HOT.get(Osmiridium, 2)).add("osmiridium",10000, 120, GT4RMaterialTags.BLAST_FURNACE_TEMP.getInt(Osmiridium));
//        BLASTING.RB().ii(of(INGOT.get(Iron,6)), of(INGOT.get(Nickel, 1)), of(INGOT.get(Chrome, 1)), of(INGOT.get(Manganese, 1))).io(INGOT.get(StainlessSteel, 9)).add("stainless_steel",10200, 120, GT4RMaterialTags.BLAST_FURNACE_TEMP.getInt(StainlessSteel));
//        BLASTING.RB().ii(of(INGOT.get(Iron,1)), of(INGOT.get(Aluminium, 1)), of(INGOT.get(Chrome, 1))).io(INGOT_HOT.get(Kanthal, 3)).add("kanthal",5100, 120, GT4RMaterialTags.BLAST_FURNACE_TEMP.getInt(Kanthal));
//        BLASTING.RB().ii(of(INGOT.get(Nickel,4)), of(INGOT.get(Chrome, 1)), INT_CIRCUITS.get(2)).io(INGOT_HOT.get(Nichrome, 5)).add("nichrome",10200, 120, GT4RMaterialTags.BLAST_FURNACE_TEMP.getInt(Nichrome));
        // TungstenSteel

        BLASTING.RB().ii(of(DUST.get(TungstenSteel))).io(INGOT_HOT.get(TungstenSteel)).add("tungsten_steel", 6000, 120, 3000);
        BLASTING.RB().ii(of(INGOT.get(Tungsten)), of(INGOT.get(Steel))).io(INGOT_HOT.get(TungstenSteel, 2), DUST.get(DarkAsh, 4)).add("tungsten_steel_2", 500, 500, 3000);
        // Tungsten
        BLASTING.RB().ii(of(DUST.get(Tungsten))).io(INGOT_HOT.get(Tungsten)).add("tungsten", 10000, 120, 2500);
        // TungstenCarbide
        BLASTING.RB().ii(of(DUST.get(TungstenCarbide))).io(INGOT_HOT.get(TungstenCarbide)).add("tungsten_carbide", 4920, 480, 2460);
        BLASTING.RB().ii(of(INGOT.get(Tungsten)), of(DUST.get(Carbon))).io(INGOT_HOT.get(TungstenCarbide, 2), DUST.get(DarkAsh, 4)).add("tungsten_carbide_1", 2410, 120, 2460);
        // Titanium
        BLASTING.RB().ii(of(DUST.get(Titanium))).io(INGOT.get(Titanium)).add("titanium", 1500, 120, 1500);
        // Steel
        BLASTING.RB().ii(of(INGOT.get(Iron, 1)), of(DUST.get(Carbon, 2))).io(INGOT.get(Steel, 1), DUST.get(DarkAsh, 2)).add("steel", 500, 120, 1000);
        BLASTING.RB().ii(of(DUST.get(Steel))).io(INGOT.get(Steel)).add("steel_2", 1000, 120, 1000);
        // StainlessSteel
        BLASTING.RB().ii(of(DUST.get(StainlessSteel))).io(INGOT.get(StainlessSteel)).add("stainless_steel", 1700, 120, 1700);
        // Silicon
        BLASTING.RB().ii(of(DUST.get(Silicon))).io(INGOT.get(Silicon)).add("silicon", 1500, 120, 1500);
        // Osmium
        BLASTING.RB().ii(of(DUST.get(Osmium))).io(INGOT_HOT.get(Osmium)).add("osmium", 3140, 120, 3300);
        // Osmiridium
        BLASTING.RB().ii(of(DUST.get(Osmiridium))).io(INGOT_HOT.get(Osmiridium)).add("osmiridium", 6303, 120, 3300);
        BLASTING.RB().ii(of(INGOT.get(Osmium)), of(INGOT.get(Iridium))).io(INGOT_HOT.get(Osmiridium, 2)).add("osmiridium_2", 10000, 120, 3300);
        // Nichrome
        BLASTING.RB().ii(of(DUST.get(Nichrome))).io(INGOT_HOT.get(Nichrome)).add("nichrome", 3600, 120, 2500);
        // Netherite
        BLASTING.RB().ii(of(DUST.get(NetheriteScrap, 4)), of(INGOT.get(Gold, 4))).io(INGOT.get(Netherite, 1), DUST.get(DarkAsh, 4)).add("netherite", 1700, 120, 1300);
        BLASTING.RB().ii(of(DUST.get(Netherite))).io(INGOT.get(Netherite, 1)).add("netherite_1", 364, 120, 1300);
        // MagneticSteel
        BLASTING.RB().ii(of(DUST.get(SteelMagnetic))).io(INGOT.get(SteelMagnetic)).add("magnetic_steel", 1406, 120, 1000);
        // Kanthal
        BLASTING.RB().ii(of(DUST.get(Kanthal))).io(INGOT_HOT.get(Kanthal)).add("kanthal", 2500, 120, 2500);
        // Iron
        BLASTING.RB().ii(of(TagUtils.getForgelikeItemTag("ores/iron"), 1), of(DUST.get(Calcite))).io(INGOT.get(Iron, 3), DUST.get(DarkAsh, 1)).add("iron", 500, 120, 1500);
        BLASTING.RB().ii(of(TagUtils.getForgelikeItemTag("raw_materials/iron"), 2), of(DUST.get(Calcite))).io(INGOT.get(Iron, 3), DUST.get(DarkAsh, 1)).add("iron_2", 500, 120, 1500);
        BLASTING.RB().ii(of(DUST.get(Pyrite, 3)), of(DUST.get(Calcite, 1))).io(INGOT.get(Iron, 2)).add("iron_3", 500, 120, 1500);
        // Iridium
        BLASTING.RB().ii(of(DUST.get(Iridium))).io(INGOT_HOT.get(Iridium)).add("iridium", 2880, 120, 3000);
        // Galena
        BLASTING.RB().ii(of(DUST.get(Galena, 2))).io(INGOT.get(Lead), INGOT.get(Silver)).add("galena", 400, 120, 1500);
        // Chrome
        BLASTING.RB().ii(of(DUST.get(Chrome))).io(INGOT.get(Chrome)).add("chrome", 1700, 120, 1700);
        // Carbon
        BLASTING.RB().ii(of(DUST.get(Carbon))).io(INGOT.get(Carbon)).add("carbon", 60, 120, 1000);
        // Alu
        BLASTING.RB().ii(of(DUST.get(Aluminium))).io(INGOT.get(Aluminium)).add("aluminium", 1700, 120, 1700);
    }
}

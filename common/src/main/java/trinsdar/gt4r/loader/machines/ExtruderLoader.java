package trinsdar.gt4r.loader.machines;

import muramasa.antimatter.AntimatterAPI;
import muramasa.antimatter.data.AntimatterMaterialTypes;
import muramasa.antimatter.material.Material;
import muramasa.antimatter.pipe.PipeSize;
import muramasa.antimatter.pipe.types.FluidPipe;
import muramasa.antimatter.pipe.types.ItemPipe;
import muramasa.antimatter.recipe.ingredient.RecipeIngredient;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import trinsdar.gt4r.data.GT4RData;

import static muramasa.antimatter.data.AntimatterMaterialTypes.*;
import static muramasa.antimatter.data.AntimatterMaterials.*;
import static muramasa.antimatter.material.MaterialTags.RUBBERTOOLS;
import static trinsdar.gt4r.data.Materials.*;
import static trinsdar.gt4r.data.RecipeMaps.EXTRUDING;

public class ExtruderLoader {
    public static void init(){

        addPlate(Iron, 2.8);
        addPlate(Gold, 9.8);
        addPlate(Netherite, 7.2);
        addPlate(Rubber, 0.25);
        addPlate(Bronze, 3.8);
        addPlate(Steel, 2.8);
        addPlate(StainlessSteel, 2.75);
        addPlate(Invar, 2.8);
        addPlate(Tungsten, 9.15);
        addPlate(TungstenSteel, 5.95);
        addPlate(Copper, 3.15);
        addPlate(Aluminium, 1.3);
        addPlate(Beryllium, 0.45);
        addPlate(Carbon, 0.25);
        addPlate(Chrome, 2.6);
        addPlate(Iridium, 9.6);
        addPlate(Lead, 10.35);
        addPlate(Nickel, 2.9);
        addPlate(Osmium, 9.5);
        addPlate(Platinum, 9.75);
        addPlate(Silver, 5.35);
        addPlate(Titanium, 2.4);
        addPlate(Silicon, 1.4);
        addPlate(Tin, 5.9);
        addPlate(Zinc, 3.25);
        addPlate(Technetium, 4.9);
        addPlate(BatteryAlloy, 9.45);
        addPlate(Brass, 3.15);
        addPlate(Cupronickel, 3);
        addPlate(Electrum, 7.55);
        addPlate(Kanthal, 2.2);
        addPlate(Magnalium, 1.25);
        addPlate(SolderingAlloy, 5.9);
        addPlate(WroughtIron, 2.8);
        addPlate(TungstenCarbide, 7.25);
        addPlate(RedAlloy, 2);
        addPlate(Osmiridium, 4.9);
        addPlate(IronMagnetic, 2.8);
        addPlate(SteelMagnetic, 2.8);
        addPlate(Plastic, 0.2);

        addRod(Iron, 2.8);
        addRod(Gold, 9.8);
        addRod(Netherite, 7.2);
        addRod(Rubber, 0.25);
        addRod(Bronze, 3.8);
        addRod(Steel, 2.8);
        addRod(StainlessSteel, 2.75);
        addRod(Invar, 2.8);
        addRod(Tungsten, 9.15);
        addRod(TungstenSteel, 5.95);
        addRod(Copper, 3.15);
        addRod(Aluminium, 1.3);
        addRod(Beryllium, 0.45);
        addRod(Carbon, 0.25);
        addRod(Chrome, 2.6);
        addRod(Iridium, 9.6);
        addRod(Lead, 10.35);
        addRod(Nickel, 2.9);
        addRod(Osmium, 9.5);
        addRod(Platinum, 9.75);
        addRod(Silver, 5.35);
        addRod(Titanium, 2.4);
        addRod(Silicon, 1.4);
        addRod(Tin, 5.9);
        addRod(Zinc, 3.25);
        addRod(Technetium, 4.9);
        addRod(BatteryAlloy, 9.45);
        addRod(Brass, 3.15);
        addRod(Cupronickel, 3);
        addRod(Electrum, 7.55);
        addRod(Kanthal, 2.2);
        addRod(Magnalium, 1.25);
        addRod(SolderingAlloy, 5.9);
        addRod(WroughtIron, 2.8);
        addRod(TungstenCarbide, 7.25);
        addRod(RedAlloy, 2);
        addRod(Osmiridium, 4.9);
        addRod(IronMagnetic, 2.8);
        addRod(SteelMagnetic, 2.8);
        addRod(Plastic, 0.2);

        EXTRUDING.RB().ii(INGOT.getMaterialIngredient(Lead, 1), getReusable(GT4RData.ShapeWire)).io(new ItemStack(GT4RData.WIRE_LEAD.getBlockItem(PipeSize.VTINY), 4)).add(Lead.getId() + "_wire", 3,64);
        EXTRUDING.RB().ii(INGOT.getMaterialIngredient(Tin, 1), getReusable(GT4RData.ShapeWire)).io(new ItemStack(GT4RData.WIRE_TIN.getBlockItem(PipeSize.VTINY), 4)).add(Tin.getId() + "_wire", 3,64);

        EXTRUDING.RB().ii(INGOT.getMaterialIngredient(Copper, 1), getReusable(GT4RData.ShapeWire)).io(new ItemStack(GT4RData.WIRE_COPPER.getBlockItem(PipeSize.VTINY), 3)).add(Copper.getId() + "_wire", 4,64);
        EXTRUDING.RB().ii(INGOT.getMaterialIngredient(Nickel, 1), getReusable(GT4RData.ShapeWire)).io(new ItemStack(GT4RData.WIRE_NICKEL.getBlockItem(PipeSize.VTINY), 3)).add(Nickel.getId() + "_wire", 4,64);

        EXTRUDING.RB().ii(INGOT.getMaterialIngredient(Gold, 1), getReusable(GT4RData.ShapeWire)).io(new ItemStack(GT4RData.WIRE_GOLD.getBlockItem(PipeSize.VTINY), 6)).add(Gold.getId() + "_wire", 4,64);
        EXTRUDING.RB().ii(INGOT.getMaterialIngredient(Electrum, 1), getReusable(GT4RData.ShapeWire)).io(new ItemStack(GT4RData.WIRE_ELECTRUM.getBlockItem(PipeSize.VTINY), 6)).add(Electrum.getId() + "_wire", 4,64);

        EXTRUDING.RB().ii(INGOT.getMaterialIngredient(Steel, 1), getReusable(GT4RData.ShapeWire)).io(new ItemStack(GT4RData.WIRE_STEEL.getBlockItem(PipeSize.VTINY), 6)).add(Steel.getId() + "_wire", 8,64);
        EXTRUDING.RB().ii(INGOT.getMaterialIngredient(Aluminium, 1), getReusable(GT4RData.ShapeWire)).io(new ItemStack(GT4RData.WIRE_ALUMINIUM.getBlockItem(PipeSize.VTINY), 6)).add(Aluminium.getId() + "_wire", 8,64);

        EXTRUDING.RB().ii(INGOT.getMaterialIngredient(Osmium, 1), getReusable(GT4RData.ShapeWire)).io(new ItemStack(GT4RData.WIRE_OSMIUM.getBlockItem(PipeSize.VTINY), 4)).add(Osmium.getId() + "_wire", 16,64);
        EXTRUDING.RB().ii(INGOT.getMaterialIngredient(Tungsten, 1), getReusable(GT4RData.ShapeWire)).io(new ItemStack(GT4RData.WIRE_TUNGSTEN.getBlockItem(PipeSize.VTINY), 4)).add(Tungsten.getId() + "_wire", 16,64);


        AntimatterAPI.all(FluidPipe.class).forEach(t -> {
            if (!t.getMaterial().has(AntimatterMaterialTypes.INGOT)) return;
            Item pipeTiny = t.getBlockItem(PipeSize.TINY);
            Item pipeSmall = t.getBlockItem(PipeSize.SMALL);
            Item pipeNormal = t.getBlockItem(PipeSize.NORMAL);
            Item pipeLarge = t.getBlockItem(PipeSize.LARGE);
            Item pipeHuge = t.getBlockItem(PipeSize.HUGE);
            if (t.getSizes().contains(PipeSize.TINY)) {
                EXTRUDING.RB().ii(INGOT.getMaterialIngredient(t.getMaterial(),1), getReusable(GT4RData.ShapePipeTiny)).io(new ItemStack(pipeTiny, 2)).add(t.getMaterial().getId() + "_fluid_pipe_tiny",t.getMaterial().getMass()*2,128);
            }
            if (t.getSizes().contains(PipeSize.SMALL)) {
                EXTRUDING.RB().ii(INGOT.getMaterialIngredient(t.getMaterial(),1), getReusable(GT4RData.ShapePipeSmall)).io(new ItemStack(pipeSmall, 1)).add(t.getMaterial().getId() + "_fluid_pipe_small",t.getMaterial().getMass(),128);
            }
            if (t.getSizes().contains(PipeSize.NORMAL)) {
                EXTRUDING.RB().ii(INGOT.getMaterialIngredient(t.getMaterial(),3), getReusable(GT4RData.ShapePipeNormal)).io(new ItemStack(pipeNormal, 1)).add(t.getMaterial().getId() + "_fluid_pipe_normal",t.getMaterial().getMass()*3,128);
            }
            if (t.getSizes().contains(PipeSize.LARGE)) {
                EXTRUDING.RB().ii(INGOT.getMaterialIngredient(t.getMaterial(),6), getReusable(GT4RData.ShapePipeLarge)).io(new ItemStack(pipeLarge, 1)).add(t.getMaterial().getId() + "_fluid_pipe_large",t.getMaterial().getMass()*6,128);
            }
            if (t.getSizes().contains(PipeSize.HUGE)) {
                EXTRUDING.RB().ii(INGOT.getMaterialIngredient(t.getMaterial(),12), getReusable(GT4RData.ShapePipeHuge)).io(new ItemStack(pipeHuge, 1)).add(t.getMaterial().getId() + "_fluid_pipe_huge",t.getMaterial().getMass()*12,128);
            }
        });

        AntimatterAPI.all(ItemPipe.class).forEach(t -> {
            if (!t.getMaterial().has(INGOT)) return;
            Item pipeTiny = t.getBlockItem(PipeSize.TINY);
            Item pipeSmall = t.getBlockItem(PipeSize.SMALL);
            Item pipeNormal = t.getBlockItem(PipeSize.NORMAL);
            Item pipeLarge = t.getBlockItem(PipeSize.LARGE);
            Item pipeHuge = t.getBlockItem(PipeSize.HUGE);
            if (t.getSizes().contains(PipeSize.TINY)) {
                EXTRUDING.RB().ii(INGOT.getMaterialIngredient(t.getMaterial(),1), getReusable(GT4RData.ShapePipeTiny)).io(new ItemStack(pipeTiny, 2)).add(t.getMaterial().getId() + "_item_pipe_tiny",t.getMaterial().getMass()*2,128);
            }
            if (t.getSizes().contains(PipeSize.SMALL)) {
                EXTRUDING.RB().ii(INGOT.getMaterialIngredient(t.getMaterial(),1), getReusable(GT4RData.ShapePipeSmall)).io(new ItemStack(pipeSmall, 1)).add(t.getMaterial().getId() + "_item_pipe_small",t.getMaterial().getMass(),128);
            }
            if (t.getSizes().contains(PipeSize.NORMAL)) {
                EXTRUDING.RB().ii(INGOT.getMaterialIngredient(t.getMaterial(),3), getReusable(GT4RData.ShapePipeNormal)).io(new ItemStack(pipeNormal, 1)).add(t.getMaterial().getId() + "_item_pipe_normal",t.getMaterial().getMass()*3,128);
            }
            if (t.getSizes().contains(PipeSize.LARGE)) {
                EXTRUDING.RB().ii(INGOT.getMaterialIngredient(t.getMaterial(),6), getReusable(GT4RData.ShapePipeLarge)).io(new ItemStack(pipeLarge, 1)).add(t.getMaterial().getId() + "_item_pipe_large",t.getMaterial().getMass()*6,128);
            }
            if (t.getSizes().contains(PipeSize.HUGE)) {
                EXTRUDING.RB().ii(INGOT.getMaterialIngredient(t.getMaterial(),12), getReusable(GT4RData.ShapePipeHuge)).io(new ItemStack(pipeHuge, 1)).add(t.getMaterial().getId() + "_item_pipe_huge",t.getMaterial().getMass()*12,128);
            }
        });

        BLOCK.all().forEach(m -> {
            if (!m.has(INGOT)) return;
            EXTRUDING.RB().ii(INGOT.getMaterialIngredient(m, 9), getReusable(GT4RData.ShapeBlock)).io(BLOCK.get().get(m).asStack()).add(m.getId() + "_block",10, 128);
        });
        GEAR.all().forEach(m -> {
            if (!m.has(INGOT)) return;
            EXTRUDING.RB().ii(INGOT.getMaterialIngredient(m, 4), getReusable(GT4RData.ShapeGear)).io(GEAR.get(m, 1)).add(m.getId() + "_gear", (m.getMass() * 5), 128);
        });
        AntimatterMaterialTypes.RING.all().forEach(m -> {
            if (!m.has(AntimatterMaterialTypes.INGOT)) return;
            int euPerTick = m == Rubber ? 32 : 128;
            EXTRUDING.RB().ii(INGOT.getMaterialIngredient(m, 1), getReusable(GT4RData.ShapeRing)).io(RING.get(m, 4)).add(m.getId() + "_ring", (m.getMass() * 4), euPerTick);
            if (m.has(RUBBERTOOLS) && m.has(DUST)){
                EXTRUDING.RB().ii(DUST.getMaterialIngredient(m, 1), getReusable(GT4RData.ShapeRing)).io(RING.get(m, 4)).add(m.getId() + "_ring_1", m.getMass() * 4, euPerTick);
            }
        });
        AntimatterMaterialTypes.BOLT.all().forEach(m -> {
            if (!m.has(AntimatterMaterialTypes.INGOT)) return;
            int euPerTick = m == Rubber ? 32 : 128;
            EXTRUDING.RB().ii(INGOT.getMaterialIngredient(m, 1), getReusable(GT4RData.ShapeBolt)).io(BOLT.get(m, 8)).add(m.getId() + "_bolt", (m.getMass() * 8), euPerTick);
            if (m.has(RUBBERTOOLS) && m.has(DUST)){
                EXTRUDING.RB().ii(DUST.getMaterialIngredient(m, 1), getReusable(GT4RData.ShapeBolt)).io(BOLT.get(m, 8)).add(m.getId() + "_bolt_1", m.getMass() * 8, euPerTick);
            }
        });

        EXTRUDING.RB().ii(INGOT.getMaterialIngredient(Tin, 2), getReusable(GT4RData.ShapeCell)).io(new ItemStack(GT4RData.CellTin)).add("tin_cell",128, 32);
        EXTRUDING.RB().ii(DUST.getMaterialIngredient(Rubber, 1), getReusable(GT4RData.ShapeIngot)).io(INGOT.get(Rubber, 1)).add("rubber_ingot",10, 16);
        EXTRUDING.RB().ii(INGOT.getMaterialIngredient(WroughtIron, 1), getReusable(GT4RData.ShapeIngot)).io(new ItemStack(Items.IRON_INGOT)).add("iron_ingot",10, 64);
        EXTRUDING.RB().ii(DUST.getMaterialIngredient(SiliconDioxide, 1), getReusable(GT4RData.ShapeBottle)).io(new ItemStack(Items.GLASS_BOTTLE)).add("glass_bottle",32, 16);
    }

    public static void addPlate(Material mat, double duration) {
        EXTRUDING.RB().ii(INGOT.getMaterialIngredient(mat, 1), getReusable(GT4RData.ShapePlate)).io(PLATE.get(mat)).add(mat.getId() + "_plate", (long) (duration * 20), 128);
    }

    public static void addRod(Material mat, double duration) {
        EXTRUDING.RB().ii(INGOT.getMaterialIngredient(mat, 1), getReusable(GT4RData.ShapeRod)).io(ROD.get(mat, 2)).add(mat.getId() + "_rod", (long) (duration * 40), 96);
    }

    private static RecipeIngredient getReusable(TagKey<Item> tag){
        return RecipeIngredient.of(tag, 1).setNoConsume();
    }

    private static RecipeIngredient getReusable(ItemLike item){
        return RecipeIngredient.of(item, 1).setNoConsume();
    }
}

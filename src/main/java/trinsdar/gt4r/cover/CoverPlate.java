package trinsdar.gt4r.cover;

import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import muramasa.antimatter.AntimatterAPI;
import muramasa.antimatter.Data;
import muramasa.antimatter.cover.CoverMaterial;
import muramasa.antimatter.material.Material;
import muramasa.antimatter.material.MaterialType;
import muramasa.antimatter.material.TextureSet;
import muramasa.antimatter.texture.Texture;
import trinsdar.gt4r.Ref;
import net.minecraft.item.ItemStack;

import java.util.Arrays;
import java.util.List;

public class CoverPlate extends CoverMaterial {

    private MaterialType<?> type;
    private Material material;

    public CoverPlate() {

    }

    @Override
    public String getDomain() {
        return Ref.ID;
    }

    public CoverPlate(MaterialType<?> type, Material material) {
        this.type = type;
        this.material = material;
    }

    @Override
    public String getId() {
        return "plate";
    }

    public MaterialType<?> getType() {
        return type;
    }

    public Material getMaterial() {
        return material;
    }

    @Override
    public ItemStack getDroppedStack() {
        return Data.PLATE.get(material, 1);
    }

    /*@Override
    public Cover onPlace(ItemStack stack) {
        Material material = MaterialItem.getMaterial(stack);
        if (material != null) return new CoverPlate(MaterialType.BLOCK, material);
        return super.onPlace(stack);
    }*/

    @Override
    public Texture[] getTextures() {
        List<Texture> textures = new ObjectArrayList<>();
        for (TextureSet set : AntimatterAPI.all(TextureSet.class)) {
            //TODO fix domain
            textures.addAll(Arrays.asList(set.getTextures(Data.BLOCK)));
        }
        return textures.toArray(new Texture[0]);
    }
}

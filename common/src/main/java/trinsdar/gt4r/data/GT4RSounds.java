package trinsdar.gt4r.data;

import muramasa.antimatter.AntimatterAPI;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import trinsdar.gt4r.Ref;

public class GT4RSounds {

    public static void init() {

    }

    public static final SoundEvent EXTRACTOR = AntimatterAPI.register(SoundEvent.class, Ref.ID, "extractor", new SoundEvent(new ResourceLocation(Ref.ID, "extractor")));
    public static final SoundEvent MACERATOR = AntimatterAPI.register(SoundEvent.class, Ref.ID, "macerator", new SoundEvent(new ResourceLocation(Ref.ID, "macerator")));
    public static final SoundEvent MAGNETIZER = AntimatterAPI.register(SoundEvent.class, Ref.ID, "magnetizer", new SoundEvent(new ResourceLocation(Ref.ID, "magnetizer")));
    public static final SoundEvent FURNACE = AntimatterAPI.register(SoundEvent.class, Ref.ID, "furnace", new SoundEvent(new ResourceLocation(Ref.ID, "furnace")));
    public static final SoundEvent COMPRESSOR = AntimatterAPI.register(SoundEvent.class, Ref.ID, "compressor", new SoundEvent(new ResourceLocation(Ref.ID, "compressor")));
    public static final SoundEvent PRESS = AntimatterAPI.register(SoundEvent.class, Ref.ID, "press", new SoundEvent(new ResourceLocation(Ref.ID, "press")));
    public static final SoundEvent RECYCLER = AntimatterAPI.register(SoundEvent.class, Ref.ID, "recycler", new SoundEvent(new ResourceLocation(Ref.ID, "recycler")));
}

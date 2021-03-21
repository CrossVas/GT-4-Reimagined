package trinsdar.gt4r.tile.single;

import com.mojang.blaze3d.matrix.MatrixStack;
import muramasa.antimatter.machine.types.Machine;
import muramasa.antimatter.recipe.Recipe;
import muramasa.antimatter.tile.TileEntityMachine;
import net.minecraft.client.gui.FontRenderer;

public class TileEntitySteamMachine extends TileEntityMachine {

    public TileEntitySteamMachine(Machine<?> type) {
        super(type);
    }

    @Override
    public void drawInfo(MatrixStack stack, FontRenderer renderer, int left, int top) {
        recipeHandler.ifPresent(h -> {
            Recipe r = h.getActiveRecipe();
            if (r != null) {
                if (r.hasInputFluids()) renderer.drawString(stack,"Steam: " + r.getPower() + "L/t (" + r.getSpecialValue() + " total)", left + 10, top, 16448255);
                if (r.getDuration() > 0) renderer.drawString(stack,"Time: " + (r.getDuration() / (float) 20) + "s (" + r.getDuration() + " ticks)", left + 10, top + 10, 16448255);
            }
        });
    }
}

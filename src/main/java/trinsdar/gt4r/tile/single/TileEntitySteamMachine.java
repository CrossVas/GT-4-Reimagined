package trinsdar.gt4r.tile.single;

import muramasa.antimatter.machine.types.Machine;
import muramasa.antimatter.recipe.Recipe;
import muramasa.antimatter.tile.TileEntityMachine;
import net.minecraft.client.gui.FontRenderer;

public class TileEntitySteamMachine extends TileEntityMachine {

    public TileEntitySteamMachine(Machine<?> type) {
        super(type);
        //recipeHandler.setup((tile, tag) -> new FluidResourceMachineRecipeHandler<>(tile, tag, Data.GAS.get().get(Material.get("steam"), 1)));
    }

    @Override
    public void drawInfo(FontRenderer renderer, int left, int top) {
        recipeHandler.ifPresent(h -> {
            Recipe r = h.getActiveRecipe();
            if (r != null) {
                if (r.hasInputFluids()) renderer.drawString("Steam: " + r.getPower() + "L/t (" + r.getSpecialValue() + " total)", left + 10, top, 16448255);
                if (r.getDuration() > 0) renderer.drawString("Time: " + (r.getDuration() / (float) 20) + "s (" + r.getDuration() + " ticks)", left + 10, top + 10, 16448255);
            }
        });
    }
}

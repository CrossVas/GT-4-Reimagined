package trinsdar.gt4r.tile.single;

import com.mojang.blaze3d.matrix.MatrixStack;
import muramasa.antimatter.capability.machine.MachineRecipeHandler;
import muramasa.antimatter.machine.Tier;
import muramasa.antimatter.machine.types.Machine;
import muramasa.antimatter.recipe.Recipe;
import muramasa.antimatter.tile.TileEntityMachine;
import muramasa.antimatter.util.LazyHolder;
import net.minecraft.client.gui.FontRenderer;
import trinsdar.gt4r.data.Materials;

import java.util.Arrays;

import static muramasa.antimatter.machine.Tier.BRONZE;

public class TileEntitySteamMachine extends TileEntityMachine {

    public TileEntitySteamMachine(Machine<?> type) {
        super(type);
        recipeHandler = LazyHolder.of(() -> new MachineRecipeHandler<TileEntitySteamMachine>(this) {
            @Override
            public boolean consumeResourceForRecipe() {
                return tile.fluidHandler.map(t -> t.consumeAndReturnInputs(Arrays.asList(Materials.Steam.getGas((int)activeRecipe.getPower()))).size() == 0)
                        .orElse(false);
            }
            //Allow up to 16 .
            @Override
            protected boolean validateRecipe(Recipe r) {
                return r.getPower() <= Tier.LV.getVoltage()/2;
            }
            @Override
            protected int getOverclock() {
                return tile.getMachineTier() == BRONZE ? 0 : 1;
            }
        });
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

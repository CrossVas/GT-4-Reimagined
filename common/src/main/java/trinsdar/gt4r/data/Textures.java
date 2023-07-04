package trinsdar.gt4r.data;

import muramasa.antimatter.machine.MachineState;
import muramasa.antimatter.machine.Tier;
import muramasa.antimatter.texture.IOverlayModeler;
import muramasa.antimatter.texture.IOverlayTexturer;
import muramasa.antimatter.texture.ITextureHandler;
import muramasa.antimatter.texture.Texture;
import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceLocation;
import trinsdar.gt4r.Ref;

public class Textures {

    public static final Texture ROTOR = new Texture(Ref.ID, "material/rotor");
    public static final Texture MACHINE_BASE = new Texture(Ref.ID, "block/machine/base/machine_base");
    public static final Texture BRONZE_MACHINE_BASE = new Texture(Ref.ID, "block/machine/base/tiers/bronze");
    public static final Texture FUSION_IN = new Texture(Ref.ID, "block/machine/base/fusion_control_computer");
    public static final Texture FUSION_OUT = new Texture(Ref.ID, "block/machine/base/fusion_out");

    public static final IOverlayTexturer ALLOY_SMELTER = (m, s, t) -> {
        String stateDir = s == MachineState.IDLE ? "" : "_active";
        return new Texture[] {
                new Texture(Ref.ID, "block/machine/base/bottom"), // bottom
                new Texture(Ref.ID, "block/machine/top/base"), // top
                new Texture(Ref.ID, "block/machine/side/base"), // side - back
                new Texture(Ref.ID, "block/machine/front/alloy_smelter" + stateDir), // side - front
                new Texture(Ref.ID, "block/machine/side/base"), // side - left
                new Texture(Ref.ID, "block/machine/side/base") // side - right
        };
    };

    public static final IOverlayTexturer ASSEMBLER = (m, s, t) -> {
        String stateDir = s == MachineState.IDLE ? "" : "_active";
        return new Texture[] {
                new Texture(Ref.ID, "block/machine/base/bottom"), // bottom
                new Texture(Ref.ID, "block/machine/top/assembler"), // top
                new Texture(Ref.ID, "block/machine/side/base"), // side - back
                new Texture(Ref.ID, "block/machine/front/assembler" + stateDir), // side - front
                new Texture(Ref.ID, "block/machine/side/base"), // side - left
                new Texture(Ref.ID, "block/machine/side/base") // side - right
        };
    };

    public static final IOverlayTexturer BATH = (m, s, t) -> {
        String stateDir = s == MachineState.IDLE ? "" : "_active";
        return new Texture[] {
                new Texture(Ref.ID, "block/machine/base/bottom"), // bottom
                new Texture(Ref.ID, "block/machine/top/base"), // top
                new Texture(Ref.ID, "block/machine/side/base"), // side - back
                new Texture(Ref.ID, "block/machine/front/bath" + stateDir), // side - front
                new Texture(Ref.ID, "block/machine/side/base"), // side - left
                new Texture(Ref.ID, "block/machine/side/base") // side - right
        };
    };

    public static final IOverlayTexturer BENDER = (m, s, t) -> {
        String stateDir = s == MachineState.IDLE ? "" : "_active";
        return new Texture[] {
                new Texture(Ref.ID, "block/machine/base/bottom"), // bottom
                new Texture(Ref.ID, "block/machine/top/base"), // top
                new Texture(Ref.ID, "block/machine/side/base"), // side - back
                new Texture(Ref.ID, "block/machine/front/bender" + stateDir), // side - front
                new Texture(Ref.ID, "block/machine/side/base"), // side - left
                new Texture(Ref.ID, "block/machine/side/base") // side - right
        };
    };

    public static final IOverlayTexturer CANNER = (m, s, t) -> {
        String stateDir = s == MachineState.IDLE ? "" : "_active";
        return new Texture[] {
                new Texture(Ref.ID, "block/machine/base/bottom"), // bottom
                new Texture(Ref.ID, "block/machine/top/base"), // top
                new Texture(Ref.ID, "block/machine/side/base"), // side - back
                new Texture(Ref.ID, "block/machine/front/canner" + stateDir), // side - front
                new Texture(Ref.ID, "block/machine/side/base"), // side - left
                new Texture(Ref.ID, "block/machine/side/base") // side - right
        };
    };

    public static final IOverlayTexturer COMPRESSOR = (m, s, t) -> {
        String stateDir = s == MachineState.IDLE ? "" : "_active";
        return new Texture[] {
                new Texture(Ref.ID, "block/machine/base/bottom"), // bottom
                new Texture(Ref.ID, "block/machine/top/compressor" + stateDir), // top
                new Texture(Ref.ID, "block/machine/side/base"), // side - back
                new Texture(Ref.ID, "block/machine/front/compressor" + stateDir), // side - front
                new Texture(Ref.ID, "block/machine/side/base"), // side - left
                new Texture(Ref.ID, "block/machine/side/base") // side - right
        };
    };

    public static final IOverlayTexturer CUTTER = (m, s, t) -> {
        String stateDir = s == MachineState.IDLE ? "" : "_active";
        return new Texture[] {
                new Texture(Ref.ID, "block/machine/base/bottom"), // bottom
                new Texture(Ref.ID, "block/machine/top/base"), // top
                new Texture(Ref.ID, "block/machine/side/base"), // side - back
                new Texture(Ref.ID, "block/machine/front/cutter" + stateDir), // side - front
                new Texture(Ref.ID, "block/machine/side/base"), // side - left
                new Texture(Ref.ID, "block/machine/side/base") // side - right
        };
    };

    public static final IOverlayTexturer FURNACE = (m, s, t) -> {
        String stateDir = s == MachineState.IDLE ? "" : "_active";
        return new Texture[] {
                new Texture(Ref.ID, "block/machine/base/bottom"), // bottom
                new Texture(Ref.ID, "block/machine/top/base"), // top
                new Texture(Ref.ID, "block/machine/side/base"), // side - back
                new Texture(Ref.ID, "block/machine/front/furnace" + stateDir), // side - front
                new Texture(Ref.ID, "block/machine/side/base"), // side - left
                new Texture(Ref.ID, "block/machine/side/base") // side - right
        };
    };

    public static final IOverlayTexturer EXTRACTOR = (m, s, t) -> {
        String stateDir = s == MachineState.IDLE ? "" : "_active";
        return new Texture[] {
                new Texture(Ref.ID, "block/machine/base/bottom"), // bottom
                new Texture(Ref.ID, "block/machine/top/extractor" + stateDir), // top
                new Texture(Ref.ID, "block/machine/side/base"), // side - back
                new Texture(Ref.ID, "block/machine/front/extractor" + stateDir), // side - front
                new Texture(Ref.ID, "block/machine/side/extractor" + stateDir), // side - left
                new Texture(Ref.ID, "block/machine/side/extractor" + stateDir) // side - right
        };
    };

    public static final IOverlayTexturer EXTRUDER = (m, s, t) -> {
        String stateDir = s == MachineState.IDLE ? "" : "_active";
        return new Texture[] {
                new Texture(Ref.ID, "block/machine/base/bottom"), // bottom
                new Texture(Ref.ID, "block/machine/top/base"), // top
                new Texture(Ref.ID, "block/machine/side/base"), // side - back
                new Texture(Ref.ID, "block/machine/front/extruder" + stateDir), // side - front
                new Texture(Ref.ID, "block/machine/side/base"), // side - left
                new Texture(Ref.ID, "block/machine/side/base") // side - right
        };
    };

    public static final IOverlayTexturer LATHE = (m, s, t) -> {
        String stateDir = s == MachineState.IDLE ? "" : "_active";
        return new Texture[] {
                new Texture(Ref.ID, "block/machine/base/bottom"), // bottom
                new Texture(Ref.ID, "block/machine/top/base"), // top
                new Texture(Ref.ID, "block/machine/side/base"), // side - back
                new Texture(Ref.ID, "block/machine/front/lathe" + stateDir), // side - front
                new Texture(Ref.ID, "block/machine/side/base"), // side - left
                new Texture(Ref.ID, "block/machine/side/base") // side - right
        };
    };

    public static final IOverlayTexturer MACERATOR = (m, s, t) -> {
        String stateDir = s == MachineState.IDLE ? "" : "_active";
        return new Texture[] {
                new Texture(Ref.ID, "block/machine/base/bottom"), // bottom
                new Texture(Ref.ID, "block/machine/top/macerator" + stateDir), // top
                new Texture(Ref.ID, "block/machine/side/base"), // side - back
                new Texture(Ref.ID, "block/machine/front/macerator" + stateDir), // side - front
                new Texture(Ref.ID, "block/machine/side/base"), // side - left
                new Texture(Ref.ID, "block/machine/side/base") // side - right
        };
    };

    public static final IOverlayTexturer UNIVERSAL_MACERATOR = (m, s, t) -> {
        String stateDir = s == MachineState.IDLE ? "" : "_active";
        return new Texture[] {
                new Texture(Ref.ID, "block/machine/base/bottom"), // bottom
                new Texture(Ref.ID, "block/machine/top/macerator" + stateDir), // top
                new Texture(Ref.ID, "block/machine/side/base"), // side - back
                new Texture(Ref.ID, "block/machine/front/universal_macerator" + stateDir), // side - front
                new Texture(Ref.ID, "block/machine/side/base"), // side - left
                new Texture(Ref.ID, "block/machine/side/base") // side - right
        };
    };

    public static final IOverlayTexturer RECYCLER = (m, s, t) -> {
        String stateDir = s == MachineState.IDLE ? "" : "_active";
        return new Texture[] {
                new Texture(Ref.ID, "block/machine/base/bottom"), // bottom
                new Texture(Ref.ID, "block/machine/top/recycler" + stateDir), // top
                new Texture(Ref.ID, "block/machine/side/base"), // side - back
                new Texture(Ref.ID, "block/machine/front/compressor" + stateDir), // side - front
                new Texture(Ref.ID, "block/machine/side/base"), // side - left
                new Texture(Ref.ID, "block/machine/side/base") // side - right
        };
    };

    public static final IOverlayTexturer WIREMILL = (m, s, t) -> {
        String stateDir = s == MachineState.IDLE ? "" : "_active";
        return new Texture[] {
                new Texture(Ref.ID, "block/machine/base/bottom"), // bottom
                new Texture(Ref.ID, "block/machine/top/wiremill"), // top
                new Texture(Ref.ID, "block/machine/side/base"), // side - back
                new Texture(Ref.ID, "block/machine/front/assembler" + stateDir), // side - front
                new Texture(Ref.ID, "block/machine/side/base"), // side - left
                new Texture(Ref.ID, "block/machine/side/base") // side - right
        };
    };

    public static final IOverlayTexturer CENTRIFUGE = (m, s, t) -> {
        String stateDir = s == MachineState.IDLE ? "" : "_active";
        return new Texture[] {
                new Texture(Ref.ID, "block/machine/base/bottom"), // bottom
                new Texture(Ref.ID, "block/machine/top/centrifuge"), // top
                new Texture(Ref.ID, "block/machine/front/centrifuge" + stateDir), // side - back
                new Texture(Ref.ID, "block/machine/front/centrifuge" + stateDir), // side - front
                new Texture(Ref.ID, "block/machine/front/centrifuge" + stateDir), // side - left
                new Texture(Ref.ID, "block/machine/front/centrifuge" + stateDir) // side - right
        };
    };

    public static final IOverlayTexturer ELECTROLYZER = (m, s, t) -> {
        String stateDir = s == MachineState.IDLE ? "" : "_active";
        return new Texture[] {
                new Texture(Ref.ID, "block/machine/base/bottom"), // bottom
                new Texture(Ref.ID, "block/machine/top/base"), // top
                new Texture(Ref.ID, "block/machine/front/electrolyzer" + stateDir), // side - back
                new Texture(Ref.ID, "block/machine/front/electrolyzer" + stateDir), // side - front
                new Texture(Ref.ID, "block/machine/front/electrolyzer" + stateDir), // side - left
                new Texture(Ref.ID, "block/machine/front/electrolyzer" + stateDir) // side - right
        };
    };

    public static final IOverlayTexturer CHEMICAL = (m, s, t) -> {
        String stateDir = s == MachineState.IDLE ? "" : "_active";
        return new Texture[] {
                new Texture(Ref.ID, "block/machine/base/bottom"), // bottom
                new Texture(Ref.ID, "block/machine/top/base"), // top
                new Texture(Ref.ID, "block/machine/front/chemical" + stateDir), // side - back
                new Texture(Ref.ID, "block/machine/front/chemical" + stateDir), // side - front
                new Texture(Ref.ID, "block/machine/front/chemical" + stateDir), // side - left
                new Texture(Ref.ID, "block/machine/front/chemical" + stateDir) // side - right
        };
    };

    public static final IOverlayTexturer FLUID_CANNER = (m, s, t) -> {
        String stateDir = s == MachineState.IDLE ? "" : "_active";
        return new Texture[] {
                new Texture(Ref.ID, "block/machine/base/bottom"), // bottom
                new Texture(Ref.ID, "block/machine/top/base"), // top
                new Texture(Ref.ID, "block/machine/side/base"), // side - back
                new Texture(Ref.ID, "block/machine/front/pump" + stateDir), // side - front
                new Texture(Ref.ID, "block/machine/side/pump" + stateDir), // side - left
                new Texture(Ref.ID, "block/machine/side/pump" + stateDir) // side - right
        };
    };

    public static final IOverlayTexturer DISASSEMBLER = (m, s, t) -> {
        String stateDir = s == MachineState.IDLE ? "" : "_active";
        return new Texture[] {
                new Texture(Ref.ID, "block/machine/base/bottom"), // bottom
                new Texture(Ref.ID, "block/machine/top/base"), // top
                new Texture(Ref.ID, "block/machine/side/base"), // side - back
                new Texture(Ref.ID, "block/machine/front/assembler" + stateDir), // side - front
                new Texture(Ref.ID, "block/machine/side/base"), // side - left
                new Texture(Ref.ID, "block/machine/side/base") // side - right
        };
    };

    public static final IOverlayTexturer FORGE_HAMMER = (m, s, t) -> {
        String stateDir = s == MachineState.IDLE ? "" : "_active";
        return new Texture[] {
                new Texture(Ref.ID, "block/machine/base/bottom"), // bottom
                new Texture(Ref.ID, "block/machine/top/base"), // top
                new Texture(Ref.ID, "block/machine/side/base"), // side - back
                new Texture(Ref.ID, "block/machine/front/forge_hammer" + stateDir), // side - front
                new Texture(Ref.ID, "block/machine/side/base"), // side - left
                new Texture(Ref.ID, "block/machine/side/base") // side - right
        };
    };

    public static final IOverlayTexturer ORE_WASHER = (m, s, t) -> {
        String stateDir = s == MachineState.IDLE ? "" : "_active";
        return new Texture[] {
                new Texture(Ref.ID, "block/machine/base/bottom"), // bottom
                new Texture(Ref.ID, "block/machine/top/base"), // top
                new Texture(Ref.ID, "block/machine/side/base"), // side - back
                new Texture(Ref.ID, "block/machine/front/ore_washer" + stateDir), // side - front
                new Texture(Ref.ID, "block/machine/side/pump" + stateDir), // side - left
                new Texture(Ref.ID, "block/machine/side/pump" + stateDir) // side - right
        };
    };

    public static final IOverlayTexturer THERMAL_CENTRIFUGE = (m, s, t) -> {
        String stateDir = s == MachineState.IDLE ? "" : "_active";
        return new Texture[] {
                new Texture(Ref.ID, "block/machine/base/bottom"), // bottom
                new Texture(Ref.ID, "block/machine/top/base"), // top
                new Texture(Ref.ID, "block/machine/side/base"), // side - back
                new Texture(Ref.ID, "block/machine/front/thermal_centrifuge" + stateDir), // side - front
                new Texture(Ref.ID, "block/machine/side/base"), // side - left
                new Texture(Ref.ID, "block/machine/side/base") // side - right
        };
    };

    public static final IOverlayTexturer FLUID_EXTRACTOR = (m, s, t) -> {
        String stateDir = s == MachineState.IDLE ? "" : "_active";
        return new Texture[] {
                new Texture(Ref.ID, "block/machine/base/bottom"), // bottom
                new Texture(Ref.ID, "block/machine/top/extractor" + stateDir), // top
                new Texture(Ref.ID, "block/machine/side/base"), // side - back
                new Texture(Ref.ID, "block/machine/front/extractor" + stateDir), // side - front
                new Texture(Ref.ID, "block/machine/side/fluid_extractor" + stateDir), // side - left
                new Texture(Ref.ID, "block/machine/side/fluid_extractor" + stateDir) // side - right
        };
    };

    public static final IOverlayTexturer FLUID_SOLIDIFIER= (m, s, t) -> {
        String stateDir = s == MachineState.IDLE ? "" : "_active";
        return new Texture[] {
                new Texture(Ref.ID, "block/machine/base/bottom"), // bottom
                new Texture(Ref.ID, "block/machine/top/base"), // top
                new Texture(Ref.ID, "block/machine/side/base"), // side - back
                new Texture(Ref.ID, "block/machine/front/fluid_solidifier" + stateDir), // side - front
                new Texture(Ref.ID, "block/machine/side/base"), // side - left
                new Texture(Ref.ID, "block/machine/side/base") // side - right
        };
    };

    public static final IOverlayTexturer SIFTER = (m, s, t) -> {
        String stateDir = s == MachineState.IDLE ? "" : "_active";
        return new Texture[] {
                new Texture(Ref.ID, "block/machine/base/bottom"), // bottom
                new Texture(Ref.ID, "block/machine/top/sifter" + stateDir), // top
                new Texture(Ref.ID, "block/machine/side/base"), // side - back
                new Texture(Ref.ID, "block/machine/front/sifter" + stateDir), // side - front
                new Texture(Ref.ID, "block/machine/side/base"), // side - left
                new Texture(Ref.ID, "block/machine/side/base") // side - right
        };
    };

    public static final IOverlayTexturer DISTILLERY = (m, s, t) -> {
        String stateDir = s == MachineState.IDLE ? "" : "_active";
        return new Texture[] {
                new Texture(Ref.ID, "block/machine/base/bottom"), // bottom
                new Texture(Ref.ID, "block/machine/top/base"), // top
                new Texture(Ref.ID, "block/machine/side/base"), // side - back
                new Texture(Ref.ID, "block/machine/front/distillery" + stateDir), // side - front
                new Texture(Ref.ID, "block/machine/side/distillery" + stateDir), // side - left
                new Texture(Ref.ID, "block/machine/side/distillery" + stateDir) // side - right
        };
    };

    public static final IOverlayTexturer FERMENTER = (m, s, t) -> {
        String stateDir = s == MachineState.IDLE ? "" : "_active";
        return new Texture[] {
                new Texture(Ref.ID, "block/machine/base/bottom"), // bottom
                new Texture(Ref.ID, "block/machine/top/base"), // top
                new Texture(Ref.ID, "block/machine/side/base"), // side - back
                new Texture(Ref.ID, "block/machine/front/fermenter" + stateDir), // side - front
                new Texture(Ref.ID, "block/machine/side/fermenter" + stateDir), // side - left
                new Texture(Ref.ID, "block/machine/side/fermenter" + stateDir) // side - right
        };
    };

    public static final IOverlayTexturer HATCH_MUFFLER = (m, s, t) -> new Texture[] {
            new Texture(Ref.ID, "block/machine/side/base"),
            new Texture(Ref.ID, "block/machine/side/base"),
            new Texture(Ref.ID, "block/machine/side/base"),
            new Texture(Ref.ID, "block/machine/front/muffler"),
            new Texture(Ref.ID, "block/machine/side/base"),
            new Texture(Ref.ID, "block/machine/side/base")
    };

    public static final IOverlayTexturer HATCH = (m, s, t) -> new Texture[] {
            new Texture(Ref.ID, "block/machine/side/base"),
            new Texture(Ref.ID, "block/machine/side/base"),
            new Texture(Ref.ID, "block/machine/side/base"),
            new Texture(Ref.ID, "block/machine/side/base"),
            new Texture(Ref.ID, "block/machine/side/base"),
            new Texture(Ref.ID, "block/machine/side/base")
    };

    public static final IOverlayTexturer DIGITAL_TANK = (m, s, t) -> new Texture[] {
            new Texture(Ref.ID, "block/machine/side/base"), // bottom
            new Texture(Ref.ID, "block/machine/top/digital_tank"), // top
            new Texture(Ref.ID, "block/machine/side/base"), // back
            new Texture(Ref.ID, "block/machine/side/base"), // front
            new Texture(Ref.ID, "block/machine/side/base"), // left
            new Texture(Ref.ID, "block/machine/side/base") // right
    };

    public static final IOverlayTexturer DIGITAL_CHEST = (m, s, t) -> new Texture[] {
            new Texture(Ref.ID, "block/machine/side/base"), // bottom
            new Texture(Ref.ID, "block/machine/top/base"), // top
            new Texture(Ref.ID, "block/machine/side/base"), // back
            new Texture(Ref.ID, "block/machine/front/digital_chest"), // front
            new Texture(Ref.ID, "block/machine/side/base"), // left
            new Texture(Ref.ID, "block/machine/side/base") // right
    };

    public static final IOverlayTexturer STEAM_TURBINE = (m, s, t) -> {
        String stateDir = s == MachineState.IDLE ? "" : "_active";
        return new Texture[] {
                new Texture(Ref.ID, "block/machine/base/bottom"), // bottom
                new Texture(Ref.ID, "block/machine/top/base"), // top
                new Texture(Ref.ID, "block/machine/front/steam_turbine" + stateDir), // side - back
                new Texture(Ref.ID, "block/machine/front/steam_turbine" + stateDir), // side - front
                new Texture(Ref.ID, "block/machine/side/base"), // side - left
                new Texture(Ref.ID, "block/machine/side/base") // side - right
        };
    };

    public static final IOverlayTexturer GAS_TURBINE = (m, s, t) -> {
        String stateDir = s == MachineState.IDLE ? "" : "_active";
        return new Texture[] {
                new Texture(Ref.ID, "block/machine/base/bottom"), // bottom
                new Texture(Ref.ID, "block/machine/top/gas_turbine" + stateDir), // top
                new Texture(Ref.ID, "block/machine/side/base"), // side - back
                new Texture(Ref.ID, "block/machine/side/base"), // side - front
                new Texture(Ref.ID, "block/machine/side/base"), // side - left
                new Texture(Ref.ID, "block/machine/side/base") // side - right
        };
    };

    public static final IOverlayTexturer HEAT_EXCHANGER = (m, s, t) -> {
        String stateDir = s == MachineState.IDLE ? "" : "_active";
        return new Texture[] {
                new Texture(Ref.ID, "block/machine/base/bottom"), // bottom
                new Texture(Ref.ID, "block/machine/top/base"), // top
                new Texture(Ref.ID, "block/machine/side/base"), // side - back
                new Texture(Ref.ID, "block/machine/front/heat_exchanger" + stateDir), // side - front
                new Texture(Ref.ID, "block/machine/side/base"), // side - left
                new Texture(Ref.ID, "block/machine/side/base") // side - right
        };
    };

    public static final IOverlayTexturer DIESEL_GENERATOR = (m, s, t) -> {
        String stateDir = s == MachineState.IDLE ? "" : "_active";
        return new Texture[] {
                new Texture(Ref.ID, "block/machine/base/bottom"), // bottom
                new Texture(Ref.ID, "block/machine/top/diesel_generator" + stateDir), // top
                new Texture(Ref.ID, "block/machine/side/base"), // side - back
                new Texture(Ref.ID, "block/machine/side/base"), // side - front
                new Texture(Ref.ID, "block/machine/side/base"), // side - left
                new Texture(Ref.ID, "block/machine/side/base") // side - right
        };
    };

    public static final IOverlayTexturer SEMIFLUID_GENERATOR = (m, s, t) -> {
        String stateDir = s == MachineState.IDLE ? "" : "_active";
        return new Texture[] {
                new Texture(Ref.ID, "block/machine/base/bottom"), // bottom
                new Texture(Ref.ID, "block/machine/top/base"), // top
                new Texture(Ref.ID, "block/machine/front/semifluid_generator" + stateDir), // side - back
                new Texture(Ref.ID, "block/machine/front/semifluid_generator" + stateDir), // side - front
                new Texture(Ref.ID, "block/machine/front/semifluid_generator" + stateDir), // side - left
                new Texture(Ref.ID, "block/machine/front/semifluid_generator" + stateDir) // side - right
        };
    };

    public static final IOverlayTexturer THERMAL_GENERATOR = (m, s, t) -> {
        String stateDir = s == MachineState.IDLE ? "" : "_active";
        return new Texture[] {
                new Texture(Ref.ID, "block/machine/base/bottom"), // bottom
                new Texture(Ref.ID, "block/machine/top/thermal_generator" + stateDir), // top
                new Texture(Ref.ID, "block/machine/side/base"), // side - back
                new Texture(Ref.ID, "block/machine/side/base"), // side - front
                new Texture(Ref.ID, "block/machine/side/base"), // side - left
                new Texture(Ref.ID, "block/machine/side/base") // side - right
        };
    };

    public static final IOverlayTexturer BUFFER_1 = (m, s, t) -> new Texture[] {
            new Texture(Ref.ID, "block/machine/base/" + t.getId()), // bottom
            new Texture(Ref.ID, "block/machine/base/" + t.getId()), // top
            new Texture(Ref.ID, "block/machine/base/" + t.getId()), // side - back
            new Texture(Ref.ID, "block/machine/front/buffer_1"), // side - front
            new Texture(Ref.ID, "block/machine/base/" + t.getId()), // side - left
            new Texture(Ref.ID, "block/machine/base/" + t.getId()) // side - right
    };

    public static final IOverlayTexturer BUFFER_4 = (m, s, t) -> new Texture[] {
            new Texture(Ref.ID, "block/machine/base/" + t.getId()), // bottom
            new Texture(Ref.ID, "block/machine/base/" + t.getId()), // top
            new Texture(Ref.ID, "block/machine/base/" + t.getId()), // side - back
            new Texture(Ref.ID, "block/machine/front/buffer_4"), // side - front
            new Texture(Ref.ID, "block/machine/base/" + t.getId()), // side - left
            new Texture(Ref.ID, "block/machine/base/" + t.getId()) // side - right
    };

    public static final IOverlayTexturer BUFFER_8 = (m, s, t) -> new Texture[] {
            new Texture(Ref.ID, "block/machine/base/" + t.getId()), // bottom
            new Texture(Ref.ID, "block/machine/base/" + t.getId()), // top
            new Texture(Ref.ID, "block/machine/base/" + t.getId()), // side - back
            new Texture(Ref.ID, "block/machine/front/buffer_8"), // side - front
            new Texture(Ref.ID, "block/machine/base/" + t.getId()), // side - left
            new Texture(Ref.ID, "block/machine/base/" + t.getId()) // side - right
    };

    public static final IOverlayTexturer TRANSFORMER = (m, s, t) -> {
        String stateDir = s == MachineState.IDLE ? "_out" : "_in";
        return new Texture[] {
                new Texture(Ref.ID, "block/machine/front/transformer_1" + stateDir), // bottom
                new Texture(Ref.ID, "block/machine/front/transformer_1" + stateDir), // top
                new Texture(Ref.ID, "block/machine/front/transformer_1" + stateDir), // side - back
                new Texture(Ref.ID, "block/machine/front/transformer_4" + stateDir), // side - front
                new Texture(Ref.ID, "block/machine/front/transformer_1" + stateDir), // side - left
                new Texture(Ref.ID, "block/machine/front/transformer_1" + stateDir) // side - right
        };
    };

    public static final IOverlayTexturer TIER_SPECIFIC_OVERLAY_HANDLER = (type, state, tier) -> {
        if (state != MachineState.ACTIVE && state != MachineState.INVALID_STRUCTURE) state = MachineState.IDLE;
        String stateDir = state == MachineState.IDLE ? "" : state.getId() + "/";

        return new Texture[] {
                new Texture(Ref.ID, "block/machine/overlay/" + type.getId() + "/" + tier.getId() + "/" + stateDir + "bottom"),
                new Texture(Ref.ID, "block/machine/overlay/" + type.getId() + "/" + tier.getId() + "/" + stateDir + "top"),
                new Texture(Ref.ID, "block/machine/overlay/" + type.getId() + "/" + tier.getId() + "/" + stateDir + "back"),
                new Texture(Ref.ID, "block/machine/overlay/" + type.getId() + "/" + tier.getId() + "/" + stateDir + "front"),
                new Texture(Ref.ID, "block/machine/overlay/" + type.getId() + "/" + tier.getId() + "/" + stateDir + "side"),
                new Texture(Ref.ID, "block/machine/overlay/" + type.getId() + "/" + tier.getId() + "/" + stateDir + "side")
        };
    };

    public static final IOverlayTexturer TELEPORT = (m, s, t) -> {
        boolean hv = t == Tier.HV;
        String stateDir = s == MachineState.IDLE ? "" : "_active";
        if (hv) {
            return new Texture[] {
                    new Texture(Ref.ID, "block/casing/advanced_machine_block"), // bottom
                    new Texture(Ref.ID, "block/machine/top/teleport" + stateDir), // top
                    new Texture(Ref.ID, "block/casing/advanced_machine_block"), // side - back
                    new Texture(Ref.ID, "block/casing/advanced_machine_block"), // side - front
                    new Texture(Ref.ID, "block/casing/advanced_machine_block"), // side - left
                    new Texture(Ref.ID, "block/casing/advanced_machine_block") // side - right
            };
        } else {
            return new Texture[] {
                    new Texture(Ref.ID, "block/casing/advanced_machine_block"), // bottom
                    new Texture(Ref.ID, "block/casing/advanced_machine_block"), // top
                    new Texture(Ref.ID, "block/casing/advanced_machine_block"), // side - back
                    new Texture(Ref.ID, "block/machine/front/luv_teleport" + stateDir), // side - front
                    new Texture(Ref.ID, "block/casing/advanced_machine_block"), // side - left
                    new Texture(Ref.ID, "block/casing/advanced_machine_block") // side - right
            };
        }
    };

    public static IOverlayTexturer CUBE = (type, state, tier) -> new Texture[]{
            new Texture(Ref.ID, "block/machine/front/cube"), // bottom
            new Texture(Ref.ID, "block/machine/front/cube"), // top
            new Texture(Ref.ID, "block/machine/front/cube"), // back
            new Texture(Ref.ID, "block/machine/front/cube"), // front
            new Texture(Ref.ID, "block/machine/front/cube"), // left
            new Texture(Ref.ID, "block/machine/front/cube") // right
    };

    public static final ITextureHandler BOILER_HANDLER = (m, t) -> new Texture[] {
        new Texture(Ref.ID, "block/machine/base/brick"),
        new Texture(Ref.ID, "block/machine/base/" + t.getId()),
        new Texture(Ref.ID, "block/machine/base/bricked_" + t.getId()),
        new Texture(Ref.ID, "block/machine/base/bricked_" + t.getId()),
        new Texture(Ref.ID, "block/machine/base/bricked_" + t.getId()),
        new Texture(Ref.ID, "block/machine/base/bricked_" + t.getId())
    };

    public static final ITextureHandler DUSTBIN_HANDLER = (m, t) -> new Texture[] {
            new Texture(Ref.ID, "block/machine/base/dust_bin/bottom"),
            new Texture(Ref.ID, "block/machine/base/dust_bin/top"),
            new Texture(Ref.ID, "block/machine/base/dust_bin/side"),
            new Texture(Ref.ID, "block/machine/base/dust_bin/side"),
            new Texture(Ref.ID, "block/machine/base/dust_bin/side"),
            new Texture(Ref.ID, "block/machine/base/dust_bin/side")
    };

    public static final IOverlayTexturer LEFT_RIGHT_HANDLER = (type, state, tier) -> {
        if (state != MachineState.ACTIVE && state != MachineState.INVALID_STRUCTURE) state = MachineState.IDLE;
        String stateDir = state == MachineState.IDLE ? "" : state.getId() + "/";

        return new Texture[] {
                new Texture(Ref.ID, "block/machine/overlay/" + type.getId() + "/" + stateDir + "bottom"),
                new Texture(Ref.ID, "block/machine/overlay/" + type.getId() + "/" + stateDir + "top"),
                new Texture(Ref.ID, "block/machine/overlay/" + type.getId() + "/" + stateDir + "back"),
                new Texture(Ref.ID, "block/machine/overlay/" + type.getId() + "/" + stateDir + "front"),
                new Texture(Ref.ID, "block/machine/overlay/" + type.getId() + "/" + stateDir + "left"),
                new Texture(Ref.ID, "block/machine/overlay/" + type.getId() + "/" + stateDir + "right")
        };
    };

    public static final ITextureHandler CABINET_HANDLER = (m, t) -> new Texture[] {
            new Texture(Ref.ID, "block/machine/base/cabinet/bottom"),
            new Texture(Ref.ID, "block/machine/base/cabinet/top"),
            new Texture(Ref.ID, "block/machine/base/cabinet/back"),
            new Texture(Ref.ID, "block/machine/base/cabinet/front"),
            new Texture(Ref.ID, "block/machine/base/cabinet/side"),
            new Texture(Ref.ID, "block/machine/base/cabinet/side")
    };

    public static final ITextureHandler CHEST_HANDLER = (m, t) -> new Texture[] {
            new Texture(Ref.ID, "model/material_chest_particle"),
            new Texture(Ref.ID, "model/material_chest_particle"),
            new Texture(Ref.ID, "model/material_chest_particle"),
            new Texture(Ref.ID, "model/material_chest_particle"),
            new Texture(Ref.ID, "model/material_chest_particle"),
            new Texture(Ref.ID, "model/material_chest_particle")
    };

    public static final IOverlayTexturer CABINET_OVERLAY_HANDLER = (type, state, tier) -> new Texture[] {
            new Texture(Ref.ID, "block/machine/overlay/cabinet/bottom"),
            new Texture(Ref.ID, "block/machine/overlay/cabinet/top"),
            new Texture(Ref.ID, "block/machine/overlay/cabinet/back"),
            new Texture(Ref.ID, "block/machine/overlay/cabinet/front"),
            new Texture(Ref.ID, "block/machine/overlay/cabinet/side"),
            new Texture(Ref.ID, "block/machine/overlay/cabinet/side")
    };

    public static final IOverlayTexturer CHEST_OVERLAY_HANDLER = (type, state, tier) -> new Texture[] {
            new Texture(Ref.ID, "model/material_chest_overlay_inventory"),
            new Texture(Ref.ID, "model/material_chest_overlay_inventory"),
            new Texture(Ref.ID, "model/material_chest_overlay_inventory"),
            new Texture(Ref.ID, "model/material_chest_overlay_inventory"),
            new Texture(Ref.ID, "model/material_chest_overlay_inventory"),
            new Texture(Ref.ID, "model/material_chest_overlay_inventory")
    };

    public static IOverlayTexturer SIMPLE_ACTIVE_SIDED = (type, state, tier) -> {
        if (state != MachineState.ACTIVE && state != MachineState.INVALID_STRUCTURE) state = MachineState.IDLE;
        String stateDir = state == MachineState.IDLE ? "" : state.getId() + "/";
        return new Texture[]{
                new Texture(Ref.ID, "block/machine/overlay/" + type.getId() + "/" + stateDir + "side"),
                new Texture(Ref.ID, "block/machine/overlay/" + type.getId() + "/" + stateDir + "side"),
                new Texture(Ref.ID, "block/machine/overlay/" + type.getId() + "/" + stateDir + "side"),
                new Texture(Ref.ID, "block/machine/overlay/" + type.getId() + "/" + stateDir + "side"),
                new Texture(Ref.ID, "block/machine/overlay/" + type.getId() + "/" + stateDir + "side"),
                new Texture(Ref.ID, "block/machine/overlay/" + type.getId() + "/" + stateDir + "side")
        };
    };

    public static IOverlayModeler TURBINE = (type, state, side) -> {
        String suffix = "";
        if (side == Direction.SOUTH && state != MachineState.INVALID_STRUCTURE){
            suffix = "_" + state.getId();
        }
        return new ResourceLocation(type.getDomain(), "block/machine/overlay/" + type.getId() + "/" + side.getSerializedName() + suffix);
    };
}

package gttweaker;

import gregtech.api.GregTech_API;
import gttweaker.mods.gregtech.Fuels;
import gttweaker.mods.gregtech.machines.AlloySmelter;
import gttweaker.mods.gregtech.machines.Amplifabricator;
import gttweaker.mods.gregtech.machines.ArcFurnace;
import gttweaker.mods.gregtech.machines.Assembler;
import gttweaker.mods.gregtech.machines.AssemblyLine;
import gttweaker.mods.gregtech.machines.Autoclave;
import gttweaker.mods.gregtech.machines.Blastfurnace;
import gttweaker.mods.gregtech.machines.Brewery;
import gttweaker.mods.gregtech.machines.Canner;
import gttweaker.mods.gregtech.machines.Centrifuge;
import gttweaker.mods.gregtech.machines.ChemicalBath;
import gttweaker.mods.gregtech.machines.ChemicalReactor;
import gttweaker.mods.gregtech.machines.CuttingSaw;
import gttweaker.mods.gregtech.machines.DistillationTower;
import gttweaker.mods.gregtech.machines.Distillery;
import gttweaker.mods.gregtech.machines.Electrolyzer;
import gttweaker.mods.gregtech.machines.Extruder;
import gttweaker.mods.gregtech.machines.Fermenter;
import gttweaker.mods.gregtech.machines.FluidCanner;
import gttweaker.mods.gregtech.machines.FluidExtractor;
import gttweaker.mods.gregtech.machines.FluidHeater;
import gttweaker.mods.gregtech.machines.FluidSolidifier;
import gttweaker.mods.gregtech.machines.ForgeHammer;
import gttweaker.mods.gregtech.machines.FormingPress;
import gttweaker.mods.gregtech.machines.FusionReactor;
import gttweaker.mods.gregtech.machines.ImplosionCompressor;
import gttweaker.mods.gregtech.machines.Lathe;
import gttweaker.mods.gregtech.machines.Mixer;
import gttweaker.mods.gregtech.machines.OilCracker;
import gttweaker.mods.gregtech.machines.Packer;
import gttweaker.mods.gregtech.machines.PlasmaArcFurnace;
import gttweaker.mods.gregtech.machines.PlateBender;
import gttweaker.mods.gregtech.machines.Polarizer;
import gttweaker.mods.gregtech.machines.PrecisionLaser;
import gttweaker.mods.gregtech.machines.Printer;
import gttweaker.mods.gregtech.machines.Pulverizer;
import gttweaker.mods.gregtech.machines.PyrolyseOven;
import gttweaker.mods.gregtech.machines.Separator;
import gttweaker.mods.gregtech.machines.Sifter;
import gttweaker.mods.gregtech.machines.Slicer;
import gttweaker.mods.gregtech.machines.Unpacker;
import gttweaker.mods.gregtech.machines.VacuumFreezer;
import gttweaker.mods.gregtech.machines.Wiremill;
import minetweaker.MineTweakerAPI;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;

@Mod(modid = "GTTweaker", useMetadata = true)
public class GTTweaker {
	@EventHandler
	public void init(FMLInitializationEvent event) {
        MineTweakerAPI.registerClass(AlloySmelter.class);
        MineTweakerAPI.registerClass(Amplifabricator.class);
        MineTweakerAPI.registerClass(Assembler.class);
        MineTweakerAPI.registerClass(Autoclave.class);
        MineTweakerAPI.registerClass(Blastfurnace.class);
        MineTweakerAPI.registerClass(Brewery.class);
        MineTweakerAPI.registerClass(Canner.class);
        MineTweakerAPI.registerClass(Centrifuge.class);
        MineTweakerAPI.registerClass(ChemicalBath.class);
        MineTweakerAPI.registerClass(ChemicalReactor.class);
        MineTweakerAPI.registerClass(CuttingSaw.class);
        MineTweakerAPI.registerClass(Distillery.class);
        MineTweakerAPI.registerClass(Electrolyzer.class);
        MineTweakerAPI.registerClass(Extruder.class);
        MineTweakerAPI.registerClass(Fermenter.class);
        MineTweakerAPI.registerClass(FluidCanner.class);
        MineTweakerAPI.registerClass(FluidExtractor.class);
        MineTweakerAPI.registerClass(FluidHeater.class);
        MineTweakerAPI.registerClass(FluidSolidifier.class);
        MineTweakerAPI.registerClass(ForgeHammer.class);
        MineTweakerAPI.registerClass(FormingPress.class);
        MineTweakerAPI.registerClass(Fuels.class);
        MineTweakerAPI.registerClass(ImplosionCompressor.class);
        MineTweakerAPI.registerClass(Lathe.class);
        MineTweakerAPI.registerClass(Mixer.class);
        MineTweakerAPI.registerClass(Packer.class);
        MineTweakerAPI.registerClass(PlateBender.class);
        MineTweakerAPI.registerClass(Polarizer.class);
        MineTweakerAPI.registerClass(PrecisionLaser.class);
        MineTweakerAPI.registerClass(Printer.class);
        MineTweakerAPI.registerClass(Pulverizer.class);
        MineTweakerAPI.registerClass(Separator.class);
        MineTweakerAPI.registerClass(Sifter.class);
        MineTweakerAPI.registerClass(Slicer.class);
        MineTweakerAPI.registerClass(Unpacker.class);
        MineTweakerAPI.registerClass(VacuumFreezer.class);
        MineTweakerAPI.registerClass(Wiremill.class);
        if (GregTech_API.VERSION >= 508) {
            MineTweakerAPI.registerClass(ArcFurnace.class);
            MineTweakerAPI.registerClass(DistillationTower.class);
            MineTweakerAPI.registerClass(FusionReactor.class);
            MineTweakerAPI.registerClass(PlasmaArcFurnace.class);
        }
        if (GregTech_API.VERSION >= 509) {
            MineTweakerAPI.registerClass(PyrolyseOven.class);
            MineTweakerAPI.registerClass(OilCracker.class);
            MineTweakerAPI.registerClass(AssemblyLine.class);
        }
    }
    
    @EventHandler
    public void onPostInit(FMLPostInitializationEvent ev) {
        MineTweakerAPI.registerClassRegistry(GTTweakerRegistry.class);
    }
}

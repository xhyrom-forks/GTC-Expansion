package gtc_expansion.util;

import ic2.core.item.recipe.entry.RecipeInputOreDict;
import net.minecraft.item.ItemStack;
import trinsdar.ic2c_extras.Ic2cExtrasConfig;
import trinsdar.ic2c_extras.events.RadiationEvent;
import trinsdar.ic2c_extras.tileentity.TileEntityOreWashingPlant;
import trinsdar.ic2c_extras.tileentity.TileEntityThermalCentrifuge;

public class GTCXIc2cECompat {

    public static void addOreWashingMachineRecipe(String input, int count, ItemStack... output){
        TileEntityOreWashingPlant.addRecipe(new RecipeInputOreDict(input, count), 1000, output);
    }

    public static void addThermalCentrifugeRecipe(String input, int count, int heat, ItemStack... output){
        TileEntityThermalCentrifuge.addRecipe(new RecipeInputOreDict(input, count), heat, output);
    }

    public static void addToRadiationWhitelist(ItemStack stack){
        RadiationEvent.radiation.add(stack);
    }

    public static boolean isOverridingLossyWrench(){
        return Ic2cExtrasConfig.removeLossyWrenchMechanic;
    }
}

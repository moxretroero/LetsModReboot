package com.moxretroero.sailcraft.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;

public class Recipes
{
    //Notes to self:
    //format (shaped): output item, tokens for the item in row/col format, tokens, then the associated items they represent.
    //format (shapeless): output item, item stacks for each ingredient.
    //for shapeless can replace itemstack with ore dictionary string ("itemString" eg)
    //format (ore shaped): see shaped, but requires Registry.addRecipe(new ShapedOreRecipe(###)
    //format (ore shapeless): see shapeless, but requires Registry.addRecipe(new ShapelessOreRecipe(###)
    public static void init()
    {
        //Seasoned Wood Items
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.seasonedWoodPlanks, 4), new ItemStack(ModBlocks.seasonedLog));

        //Seasoned Iron Items
        GameRegistry.addRecipe(new ItemStack(ModItems.seasonedIronBand, 3), "iii", 'i', new ItemStack(ModItems.seasonedIronIngot));
        GameRegistry.addRecipe(new ItemStack(ModItems.seasonedIronBand, 3), "i", "i", "i", 'i', new ItemStack(ModItems.seasonedIronIngot));
        GameRegistry.addRecipe(new ItemStack(ModItems.seasonedIronRing, 2), " i ", "i i", " i ", 'i', new ItemStack(ModItems.seasonedIronBand));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.seasonedIronBlock), "iii", "iii", "iii", 'i', new ItemStack(ModItems.seasonedIronIngot));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.seasonedIronIngot, 9), new ItemStack(ModBlocks.seasonedIronBlock));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.seasonedIronFrame), "bbb", "r r", "bbb", 'b', new ItemStack(ModItems.seasonedIronBand),
            'r', new ItemStack(ModItems.seasonedIronRing));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.seasonedIronFrame), "brb", "b b", "brb", 'b', new ItemStack(ModItems.seasonedIronBand),
            'r', new ItemStack(ModItems.seasonedIronRing));

        //Decorative Blocks
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.limeWoodPlanks, 4), new ItemStack(ModBlocks.limeTreeLog));
    }
}

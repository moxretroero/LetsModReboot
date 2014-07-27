package com.moxretroero.sailcraft.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemFoodOrange extends ItemFoodSC
    {
        public ItemFoodOrange()
        {
            super(1, 1, false);
            this.setUnlocalizedName("orangeFruit");
            this.setAlwaysEdible();
        }

        @Override
        public ItemStack onEaten(ItemStack itemStack, World world, EntityPlayer player)
        {
            if(!world.isRemote)
            {
                player.clearActivePotions();
            }
            return super.onEaten(itemStack, world, player);
        }
}
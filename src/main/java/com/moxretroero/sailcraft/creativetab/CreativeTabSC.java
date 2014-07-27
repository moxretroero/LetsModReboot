package com.moxretroero.sailcraft.creativetab;

import com.moxretroero.sailcraft.init.ModItems;
import com.moxretroero.sailcraft.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabSC
{
    public static final CreativeTabs SC_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.reinforcedBoat;
        }
    };

}

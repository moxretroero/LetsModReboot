package com.moxretroero.sailcraft.init;

import com.moxretroero.sailcraft.item.*;
import com.moxretroero.sailcraft.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder (Reference.MOD_ID)
public class ModItems
{
    //Materials
    public static final ItemSC seasonedIronIngot = new ItemSeasonedIronIngot();
    public static final ItemSC pearl = new ItemPearl();

    //Tools
    public static final ItemSC hook = new ItemHook();
    public static final ItemSC flintlock = new ItemFlintlock();


    public static void init()
    {
        GameRegistry.registerItem(pearl, "pearl");
        GameRegistry.registerItem(seasonedIronIngot, "seasonedIronIngot");

        GameRegistry.registerItem(hook, "hook");
        GameRegistry.registerItem(flintlock, "flintlock");
    }
}

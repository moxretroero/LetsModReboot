package com.moxretroero.sailcraft.init;

import com.moxretroero.sailcraft.item.*;
import com.moxretroero.sailcraft.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder (Reference.MOD_ID)
public class ModItems
{
    //Materials
    public static final ItemSC seasonedIronIngot = new ItemSeasonedIronIngot();
    public static final ItemSC seasonedIronBand = new ItemSeasonedIronBand();
    public static final ItemSC seasonedIronRing = new ItemSeasonedIronRing();
    public static final ItemSC pearl = new ItemPearl();

    //Food
    public static final ItemFoodSC limeFruit = new ItemFoodLime();
    public static final ItemFoodSC lemonFruit = new ItemFoodLemon();
    public static final ItemFoodSC orangeFruit = new ItemFoodOrange();

    //Tools
    public static final ItemSC hook = new ItemHook();
    public static final ItemSC flintlock = new ItemFlintlock();

    //Boats
    public static final ItemSC reinforcedBoat = new ItemReinforcedBoat();

    public static void init()
    {
        //Materials
        GameRegistry.registerItem(pearl, "pearl");
        GameRegistry.registerItem(seasonedIronIngot, "seasonedIronIngot");
        GameRegistry.registerItem(seasonedIronBand, "seasonedIronBand");
        GameRegistry.registerItem(seasonedIronRing, "seasonedIronRing");

        //Food
        GameRegistry.registerItem(limeFruit, "limefruit");
        GameRegistry.registerItem(lemonFruit, "lemonfruit");
        GameRegistry.registerItem(orangeFruit, "orangefruit");

        //Tools
        GameRegistry.registerItem(hook, "hook");
        GameRegistry.registerItem(flintlock, "flintlock");

        //Boats
        GameRegistry.registerItem(reinforcedBoat, "reinforcedBoat");
    }
}

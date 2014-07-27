package com.moxretroero.sailcraft.init;

import com.moxretroero.sailcraft.block.*;
import com.moxretroero.sailcraft.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder (Reference.MOD_ID)
public class ModBlocks
{
    //Materials
    public static final BlockSC seasonedIronBlock = new BlockSeasonedIron();
    public static final BlockSC seasonedIronFrame = new BlockSeasonedIronFrame();
    public static final BlockLogSC seasonedLog = new BlockSeasonedLog();
    public static final BlockSC seasonedWoodPlanks = new BlockSeasonedPlanks();

    //Decorative
    public static final BlockLogSC lemonTreeLog = new BlockLemonTreeLog();
    public static final BlockSC lemonWoodPlanks = new BlockLemonWoodPlanks();
    public static final BlockLogSC limeTreeLog = new BlockLimeTreeLog();
    public static final BlockSC limeWoodPlanks = new BlockLimeWoodPlanks();
    public static final BlockLogSC orangeTreeLog = new BlockOrangeTreeLog();
    public static final BlockSC orangeWoodPlanks = new BlockOrangeWoodPlanks();

    //Crafting

    public static void init()
    {
        GameRegistry.registerBlock(seasonedIronBlock, "seasonedIronBlock");
        GameRegistry.registerBlock(seasonedLog, "seasonedLog");
        GameRegistry.registerBlock(seasonedWoodPlanks, "seasonedWoodPlanks");
        GameRegistry.registerBlock(seasonedIronFrame, "seasonedIronFrame");
        
        GameRegistry.registerBlock(lemonTreeLog, "lemonTreeLog");
        GameRegistry.registerBlock(lemonWoodPlanks, "lemonWoodPlanks");
        GameRegistry.registerBlock(limeTreeLog, "limeTreeLog");
        GameRegistry.registerBlock(limeWoodPlanks, "limeWoodPlanks");
        GameRegistry.registerBlock(orangeTreeLog, "orangeTreeLog");
        GameRegistry.registerBlock(orangeWoodPlanks, "orangeWoodPlanks");
    }
}

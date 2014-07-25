package com.moxretroero.sailcraft.init;

import com.moxretroero.sailcraft.block.BlockSC;
import com.moxretroero.sailcraft.block.BlockSeasonedIron;
import com.moxretroero.sailcraft.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder (Reference.MOD_ID)
public class ModBlocks
{
    //Materials
    public static final BlockSC seasonedIronBlock = new BlockSeasonedIron();

    //Crafting

    public static void init()
    {
        GameRegistry.registerBlock(seasonedIronBlock, "seasonedIronBlock");
    }
}

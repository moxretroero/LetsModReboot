package com.moxretroero.sailcraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockSeasonedPlanks extends BlockSC
{
    public BlockSeasonedPlanks ()
    {
        super(Material.wood);
        this.setBlockName("seasonedWoodPlanks");
        this.setBlockTextureName("seasonedWoodPlanks");
        this.setStepSound(Block.soundTypeWood);
        this.setHarvestLevel("axe", 1);
    }
}

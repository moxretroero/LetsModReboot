package com.moxretroero.sailcraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockLimeWoodPlanks extends BlockSC
{
    public BlockLimeWoodPlanks ()
    {
        super(Material.wood);
        this.setBlockName("limeWoodPlanks");
        this.setBlockTextureName("limeWoodPlanks");
        this.setStepSound(Block.soundTypeWood);
        this.setHarvestLevel("axe", 0);
    }
}

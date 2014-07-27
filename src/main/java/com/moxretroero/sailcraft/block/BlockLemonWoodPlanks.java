package com.moxretroero.sailcraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockLemonWoodPlanks extends BlockSC
{
    public BlockLemonWoodPlanks ()
    {
        super(Material.wood);
        this.setBlockName("lemonWoodPlanks");
        this.setBlockTextureName("lemonWoodPlanks");
        this.setStepSound(Block.soundTypeWood);
        this.setHarvestLevel("axe", 0);
    }
}

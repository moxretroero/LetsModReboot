package com.moxretroero.sailcraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockOrangeWoodPlanks extends BlockSC
{
    public BlockOrangeWoodPlanks ()
    {
        super(Material.wood);
        this.setBlockName("orangeWoodPlanks");
        this.setBlockTextureName("orangeWoodPlanks");
        this.setStepSound(Block.soundTypeWood);
        this.setHarvestLevel("axe", 0);
    }
}

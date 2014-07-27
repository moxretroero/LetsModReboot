package com.moxretroero.sailcraft.block;

import net.minecraft.block.Block;

public class BlockLimeTreeLog extends BlockLogSC
{
    public BlockLimeTreeLog ()
    {
        super();
        this.setBlockName("limeTreeLog");
        this.setStepSound(Block.soundTypeWood);
        this.setHarvestLevel("axe", 0);
    }
}

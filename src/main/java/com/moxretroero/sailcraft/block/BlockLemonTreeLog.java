package com.moxretroero.sailcraft.block;

import net.minecraft.block.Block;

public class BlockLemonTreeLog extends BlockLogSC
{
    public BlockLemonTreeLog ()
    {
        super();
        this.setBlockName("lemonTreeLog");
        this.setStepSound(Block.soundTypeWood);
        this.setHarvestLevel("axe", 0);
    }
}

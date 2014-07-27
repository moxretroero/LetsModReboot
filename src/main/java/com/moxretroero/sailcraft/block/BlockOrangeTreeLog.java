package com.moxretroero.sailcraft.block;

import net.minecraft.block.Block;

public class BlockOrangeTreeLog extends BlockLogSC
{
    public BlockOrangeTreeLog ()
    {
        super();
        this.setBlockName("orangeTreeLog");
        this.setStepSound(Block.soundTypeWood);
        this.setHarvestLevel("axe", 0);
    }
}

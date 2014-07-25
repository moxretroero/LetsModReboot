package com.moxretroero.sailcraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockSeasonedIron extends BlockSC
{
    public BlockSeasonedIron ()
    {
        super(Material.anvil);
        this.setBlockName("seasonedIronBlock");
        this.setBlockTextureName("seasonedIronBlock");
        this.setStepSound(Block.soundTypeMetal);
    }
}

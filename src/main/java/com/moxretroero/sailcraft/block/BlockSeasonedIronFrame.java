package com.moxretroero.sailcraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockSeasonedIronFrame extends BlockSC
{
    public BlockSeasonedIronFrame ()
    {
        super(Material.anvil);
        this.setBlockName("seasonedIronFrame");
        this.setBlockTextureName("seasonedIronFrame");
        this.setStepSound(Block.soundTypeMetal);
        this.setHarvestLevel("pickaxe", 1);
    }

    @Override
    public boolean isOpaqueCube()
    {
        return false;
    }
}

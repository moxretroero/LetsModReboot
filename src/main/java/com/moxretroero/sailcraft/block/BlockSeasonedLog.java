package com.moxretroero.sailcraft.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;

import javax.swing.*;


public class BlockSeasonedLog extends BlockLogSC
{
    public BlockSeasonedLog ()
    {
        super();
        this.setBlockName("seasonedLog");
        //this.setBlockTextureName("seasonedLog");
        this.setStepSound(Block.soundTypeWood);
        this.setHarvestLevel("axe", 1);
    }

    @Override
    public boolean canSustainLeaves(IBlockAccess world, int x, int y, int z)
    {
        return false;
    }
}

package com.moxretroero.sailcraft.block;

import com.moxretroero.sailcraft.creativetab.CreativeTabSC;
import com.moxretroero.sailcraft.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockLog;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class BlockLogSC extends BlockLog
{
    //standard constructor with specified material
    public BlockLogSC()
    {
        super();
        this.setCreativeTab(CreativeTabSC.SC_TAB);
    }

    @SideOnly (Side.CLIENT)
    protected IIcon topIcon;
    @SideOnly (Side.CLIENT)
    protected IIcon sideIcon;

    //Handles getting the name for an object
    @Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":",getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
        /*
            Name of the item.  eg. tile.sailcraft:seasonedIronBlock.name
         */
    }

    //Does icon registration, associating textures with their proper blocks
    //Client only
    @Override
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        sideIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())+"Side"));
        topIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())+"Top"));
    }

    @Override
    @SideOnly(Side.CLIENT)
    protected IIcon getSideIcon(int metadata)
    {
        return sideIcon;
    }

    @Override
    @SideOnly(Side.CLIENT)
    protected IIcon getTopIcon(int metadata)
    {
        return topIcon;
    }

    //Handles the parsing of an unlocalized name
    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}

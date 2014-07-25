package com.moxretroero.sailcraft.block;

import com.moxretroero.sailcraft.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class BlockSC extends Block
{
    //standard constructor with specified material
    public BlockSC(Material material)
    {
        super(material);
    }

    //Default constructor - goes to wood automatically
    public BlockSC()
    {
        this(Material.wood);
    }

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
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }

    //Handles the parsing of an unlocalized name
    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}

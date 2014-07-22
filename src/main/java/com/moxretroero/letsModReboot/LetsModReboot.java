package com.moxretroero.letsModReboot;

import com.moxretroero.letsModReboot.proxy.IProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import com.moxretroero.letsModReboot.reference.Reference;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)

public class LetsModReboot
{
    //"Safe" instance of the mod used for referencing.
    @Mod.Instance(Reference.MOD_ID)
    public static LetsModReboot instance;

    //Sets up the proxy, useful for distinguishing between client and server sided work
    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS,
            serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    //Used for Network Handling, Item and Block Registration, Mod Configuration, and the like.
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

    }

    //Used for GUI's, Tile Entities, Crafting Recepies and the like along with general event
    //handlers
    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    //Used for Wrap Up, cleanup, and compatability scripts
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}


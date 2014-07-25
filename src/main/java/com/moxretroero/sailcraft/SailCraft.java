package com.moxretroero.sailcraft;

import com.moxretroero.sailcraft.handler.ConfigurationHandler;
import com.moxretroero.sailcraft.init.ModBlocks;
import com.moxretroero.sailcraft.init.ModItems;
import com.moxretroero.sailcraft.proxy.IProxy;
import com.moxretroero.sailcraft.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import com.moxretroero.sailcraft.reference.Reference;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)

public class SailCraft
{
    //"Safe" instance of the mod used for referencing.
    @Mod.Instance(Reference.MOD_ID)
    public static SailCraft instance;

    //Sets up the proxy, useful for distinguishing between client and server sided work
    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS,
            serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    //Used for Network Handling, Item and Block Registration, Mod Configuration, and the like.
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        //reads and loads the config file
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        LogHelper.info("Pre-init complete.");

        //inits items
        ModItems.init();
        //inits blocks
        ModBlocks.init();
    }

    //Used for GUI's, Tile Entities, Crafting Recepies and the like along with general event
    //handlers
    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        LogHelper.info("Init complete.");
    }

    //Used for Wrap Up, cleanup, and compatability scripts
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Post-init complete.");
    }
}


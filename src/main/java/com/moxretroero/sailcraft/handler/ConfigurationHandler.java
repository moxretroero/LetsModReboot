package com.moxretroero.sailcraft.handler;

import com.moxretroero.sailcraft.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

//A class to handle configs according to the supplied File
public class ConfigurationHandler
{
    //static pointer to the configuration object
    public static Configuration configuration;
    public static boolean testValue = false;

    //creates/initializes the configuration file
    public static void init(File configFile)
    {
        //create the config object from the given config file
        if (configuration == null)
        {
            configuration = new Configuration(configFile);
            loadConfiguration();
        }
    }

    //Notified when a config changes, if it is the sailcraft congig, it reloads in order to sync.
    @SubscribeEvent
    public void onConfigurationChangedEvent (ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if (event.modID.equalsIgnoreCase(Reference.MOD_ID))
        {
            //Resync configs
            loadConfiguration();
        }
    }

    //Reloads the configuration when called to.
    private static void loadConfiguration()
    {
        testValue = configuration.getBoolean("configValue", Configuration.CATEGORY_GENERAL, true,
                "This is an example configuration value");

        //save the config file
        if (configuration.hasChanged())
        {
            configuration.save();
        }
    }
}

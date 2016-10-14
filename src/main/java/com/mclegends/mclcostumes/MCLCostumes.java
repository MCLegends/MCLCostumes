package com.mclegends.mclcostumes;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class MCLCostumes extends JavaPlugin {

    @Override
    public void onEnable() {
        // Check if dependency isn't loaded, and if it isn't disable the plugin..
        if(!Bukkit.getPluginManager().isPluginEnabled("LibsDisguises")) {
            this.getLogger().info("MCLCostumes is disabling to a dependency being disabled. Please install LibsDisguises and try again.");
            this.getPluginLoader().disablePlugin(this);
        }
    }
}

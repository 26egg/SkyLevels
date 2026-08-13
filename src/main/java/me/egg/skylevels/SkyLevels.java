package me.egg.skylevels;

import org.bukkit.plugin.java.JavaPlugin;

public final class SkyLevels extends JavaPlugin {

    private static SkyLevels instance;

    @Override
    public void onEnable() {
        instance = this;

        getLogger().info("SkyLevels has been enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("SkyLevels has been disabled!");
    }

    public static SkyLevels getInstance() {
        return instance;
    }
}
package net.rainbowfurry.minecraftLib.manager;

import net.rainbowfurry.minecraftLib.MinecraftLib;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.Plugin;

public class ConfigManager {

    private final FileConfiguration config;
    private final Plugin plugin = MinecraftLib.plugin;

    public ConfigManager() {

        // Erstellt config.yml, falls sie nicht existiert
        plugin.saveDefaultConfig();

        config = plugin.getConfig();

        // Testwerte setzen, falls sie fehlen
        createDefaults();

        config.options().copyDefaults(true);
        plugin.saveConfig();
    }

    private void createDefaults(){
        config.addDefault("chat.cooldown", 2);
        config.addDefault("chat.max-message-length", 256);
        config.addDefault("chat.block-duplicates", true);
    }

    public FileConfiguration getConfig() {
        return config;
    }

    public void reload() {
        plugin.reloadConfig();
    }

    public void save() {
        plugin.saveConfig();
    }

}

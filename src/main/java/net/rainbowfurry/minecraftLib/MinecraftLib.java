package net.rainbowfurry.minecraftLib;

import net.rainbowfurry.minecraftLib.builder.InventoryBuilder;
import net.rainbowfurry.minecraftLib.builder.ItemBuilder;
import net.rainbowfurry.minecraftLib.builder.Translation;
import net.rainbowfurry.minecraftLib.commands.TestCommand;
import net.rainbowfurry.minecraftLib.eventListener.ColoredSignsEvent;
import net.rainbowfurry.minecraftLib.manager.ConfigManager;
import net.rainbowfurry.minecraftLib.manager.LogManager;
import org.bukkit.Material;
import org.bukkit.plugin.java.JavaPlugin;

public final class MinecraftLib extends JavaPlugin {

    public static JavaPlugin plugin;
    public static LogManager logManager;
    public static ConfigManager configManager;
    public static Translation translation;
    public static ItemBuilder itemBuilder;
    public static InventoryBuilder inventoryBuilder;

    @Override
    public void onEnable() {

        plugin = this;
        logManager = new LogManager();
        configManager = new ConfigManager();
        translation = new Translation();
        // DB
        inventoryBuilder = new InventoryBuilder();
        itemBuilder = new ItemBuilder(Material.AIR);

        logManager.info("<green>The Plugin</green> <gradient:#FF416C:#FF4B2B:#FF8C00>MinecraftLibAPI</gradient> <green>is getting</green> <dark_green><b>started</b>!</dark_green>");
        //logManager.info("<aqua>Developer</aqua>: <gradient:#FF0000:#FF7F00:#FFFF00:#00FF00:#0000FF:#8B00FF><b>RainbowFurry</b></gradient>");
        logManager.info("<aqua>Developer</aqua>: <gradient:#4A00E0:#8E2DE2:#F000FF><b>RainbowFurry</b></gradient>");

        registerCommands();
        registerEvents();
    }

    @Override
    public void onDisable() {
        logManager.info( "<light_red>The Plugin</light_red> <yellow>MinecraftLibAPI</yellow> <light_red>is getting</light_red> <red><b>stopped</b>!</red>");
    }

    private void registerCommands(){
        getLogger().info( "Start register all Commands...");
        getCommand("test").setExecutor(new TestCommand());
        getLogger().info( "All Commands have been registered!");
    }

    private void registerEvents(){
        getLogger().info( "Start register all Events...");
        getServer().getPluginManager().registerEvents(new ColoredSignsEvent(), this);
        getLogger().info("All Events have been registered!");
    }

}

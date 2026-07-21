package net.rainbowfurry.minecraftLib.manager;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import net.rainbowfurry.boxSMP.BoxSMP;
import net.rainbowfurry.minecraftLib.MinecraftLib;
import org.bukkit.plugin.Plugin;

public class LogManager {

    private final Plugin plugin = MinecraftLib.plugin;

    public void info(String message) {
        Component debugMessage = MiniMessage.miniMessage().deserialize(
                "<blue>[INFO]</blue> <green>" + message + "</green>"
        );

        plugin.getComponentLogger().info(debugMessage);
    }

    public void debug(String message) {
        Component debugMessage = MiniMessage.miniMessage().deserialize(
                "<gray>[DEBUG]</gray> <green>" + message + "</green>"
        );

        plugin.getComponentLogger().info(debugMessage);
    }

    public void warning(String message) {
        Component debugMessage = MiniMessage.miniMessage().deserialize(
                "<yellow>[WARNING]</yellow> <green>" + message + "</green>"
        );

        plugin.getComponentLogger().info(debugMessage);
    }

    public void error(String message) {
        Component debugMessage = MiniMessage.miniMessage().deserialize(
                "<red>[ERROR]</red> <green>" + message + "</green>"
        );

        plugin.getComponentLogger().info(debugMessage);
    }

}

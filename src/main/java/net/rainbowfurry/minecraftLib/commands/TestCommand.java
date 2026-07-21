package net.rainbowfurry.minecraftLib.commands;

import net.rainbowfurry.minecraftLib.MinecraftLib;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

public class TestCommand implements CommandExecutor {

    private JavaPlugin plugin = MinecraftLib.plugin;
    private Translation translation = MinecraftLib.translation;

    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String @NotNull [] strings) {

        Player player = (Player) commandSender;

        player.sendMessage(translation.TranslateMessage("&4Hallo du da!"));

        return false;
    }

}

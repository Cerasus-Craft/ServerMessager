package fr.dams4k.servermessager;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class ServerMessager {
    private static JavaPlugin plugin;

    public static void init(JavaPlugin plugin) {
        ServerMessager.plugin = plugin;
    }

    public static String formatMessage(ChatColor levelColor, String levelName, String message) {
        return String.format("%s[%s]%s %s", levelColor, levelName, ChatColor.WHITE, message);
    }

    public static void sendMessage(CommandSender sender, ChatColor levelColor, String levelName, String message) {
        sender.sendMessage(formatMessage(levelColor, levelName, message));
    }

    public static void sendError(CommandSender sender, String message) {
        sendMessage(sender, ChatColor.RED, "ERROR", message);
    }
}

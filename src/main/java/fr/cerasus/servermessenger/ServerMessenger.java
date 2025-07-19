package fr.cerasus.servermessenger;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class ServerMessenger {
    private final JavaPlugin plugin;

    public ServerMessenger(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    public String formatMessage(ChatColor levelColor, String levelName, String message) {
        return String.format("%s[%s]%s %s", levelColor, levelName, ChatColor.WHITE, message);
    }


    public void sendPositiveMessage(CommandSender sender, String message) {
        sendMessage(sender, ChatColor.GREEN, plugin.getName(), message);
    }
    public void sendNegativeMessage(CommandSender sender, String message) {
        sendMessage(sender, ChatColor.RED, plugin.getName(), message);
    }

    public void sendNeutralMessage(CommandSender sender, String message) {
        sendMessage(sender, ChatColor.BLUE, plugin.getName(), message);
    }

    public void sendWarningMessage(CommandSender sender, String message) {
        sendMessage(sender, ChatColor.GOLD, plugin.getName(), message);
    }

    public void sendMessage(CommandSender sender, ChatColor levelColor, String levelName, String message) {
        sender.sendMessage(formatMessage(levelColor, levelName, message));
    }

    public void sendError(CommandSender sender, String message) {
        sendMessage(sender, ChatColor.RED, "ERROR", message);
    }
}

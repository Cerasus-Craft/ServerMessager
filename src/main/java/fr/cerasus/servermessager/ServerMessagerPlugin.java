package fr.cerasus.servermessager;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class ServerMessagerPlugin extends JavaPlugin {
    public static ServerMessager MESSENGER;

    @Override
    public void onEnable() {
        MESSENGER = new ServerMessager(this);
        MESSENGER.sendPositiveMessage(Bukkit.getConsoleSender(), "Plugin enabled");
    }

    @Override
    public void onDisable() {
        MESSENGER.sendNegativeMessage(Bukkit.getConsoleSender(), "Plugin disabled");
    }
}

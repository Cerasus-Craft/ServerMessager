package fr.cerasus.servermessager;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class ServerMessengerPlugin extends JavaPlugin {
    public static ServerMessenger MESSENGER;

    @Override
    public void onEnable() {
        MESSENGER = new ServerMessenger(this);
        MESSENGER.sendPositiveMessage(Bukkit.getConsoleSender(), "Plugin enabled");
    }

    @Override
    public void onDisable() {
        MESSENGER.sendNegativeMessage(Bukkit.getConsoleSender(), "Plugin disabled");
    }
}

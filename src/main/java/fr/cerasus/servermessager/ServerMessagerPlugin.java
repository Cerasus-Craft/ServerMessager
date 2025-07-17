package fr.cerasus.servermessager;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class ServerMessagerPlugin extends JavaPlugin {
    public static ServerMessager MESSAGER;

    @Override
    public void onEnable() {
        MESSAGER = new ServerMessager(this);
        MESSAGER.sendPositiveMessage(Bukkit.getConsoleSender(), "Plugin enabled");
    }
}

package me.hardmcore;

import org.bukkit.ChatColor;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class MainClass extends JavaPlugin {
	public void onEnable() {
		PluginManager manager = this.getServer().getPluginManager();
		
		manager.registerEvents(new ListenerItemDamage(), this);
		getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "NoItemDamage turned on");
	}
	public void onDisable() {
		getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "Wylaczono NoItemDamage turned off");
	}
}

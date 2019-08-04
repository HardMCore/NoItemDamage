package me.hardmcore;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class MainClass extends JavaPlugin implements CommandExecutor {
	static boolean noitemdmg = true;
	public void onEnable() {
		PluginManager manager = this.getServer().getPluginManager();
		manager.registerEvents(new ListenerItemDamage(), this);
		getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "Plugin NoItemDamage turned on");
	}
	public void onDisable() {
		getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "Plugin NoItemDamage turned off");
	}
    public boolean onCommand(CommandSender sender, Command cmd, String arg, String[] args){
        if(cmd.getName().equalsIgnoreCase("noitemdmg")){
            if(args.length == 0){
                sender.sendMessage(ChatColor.GRAY + "/noitemdmg on - Prevents items from taking damage");
                sender.sendMessage(ChatColor.GRAY + "/noitemdmg off - Items take damage");
                return true;
            }
            if(args[0].equalsIgnoreCase("on")) {
            	noitemdmg = true;
            	sender.sendMessage(ChatColor.GRAY + "Items don't take damage anymore");
            }
            if(args[0].equalsIgnoreCase("off")) {
            	noitemdmg = false;
            	sender.sendMessage(ChatColor.GRAY + "Items now take damage again");
            }
        }
        return false;
    }
}
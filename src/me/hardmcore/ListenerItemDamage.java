package me.hardmcore;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemDamageEvent;

public class ListenerItemDamage implements Listener {

	@EventHandler
	public void onPlayerItemDamageEvent(PlayerItemDamageEvent event) {
		Player player = event.getPlayer();
		if (MainClass.noitemdmg == true) {
			if(player.hasPermission("noitemdmg")) {
				event.setCancelled(true);
				return;
			}
			if(player.isOp()) {
				event.setCancelled(true);
			}
		}
	}
}

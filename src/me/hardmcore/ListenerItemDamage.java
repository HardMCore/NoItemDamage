package me.hardmcore;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemDamageEvent;

public class ListenerItemDamage implements Listener {
	@EventHandler
	public void onPlayerItemDamageEvent(PlayerItemDamageEvent event) {
		event.setCancelled(true);
	}
}

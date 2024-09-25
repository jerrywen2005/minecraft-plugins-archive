package me.Jerrry.Dream2.Listener;


import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerItemConsumeEvent;

import me.Jerrry.Dream2.Main;

public class Listener{
	

	private static Main plugin;
	public Listener (Main plugin) {
		this.plugin = plugin;
		
	}
	
	@EventHandler
	public void creatureSpawn(PlayerItemConsumeEvent e) {
		if (e.getItem().getType().name().toLowerCase().contains("potion")){
			return;
		}
		if (e.getItem().getType().name().contains("bucket")) {
			return;
		}
		e.getPlayer().setHealth(.5);
	}
}

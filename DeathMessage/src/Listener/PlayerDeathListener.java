package Listener;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

import me.Jerry.DeathMessage.Main;
import utils.utils;

public class PlayerDeathListener implements Listener {
	
	private static Main plugin;
	
	public PlayerDeathListener (Main plugin) {
		
		this.plugin = plugin;
		
		Bukkit.getPluginManager().registerEvents(this,  plugin);
		
	}
	
	@EventHandler
	public void onPlayerDeath(PlayerDeathEvent e) {
		if(e.getEntity().getKiller() instanceof Player) {
			Player killer = e.getEntity().getKiller();
			Player p = e.getEntity();
			
			killer.sendMessage(utils.chat("&8[&a*&8] &7You have killed &6" + p.getDisplayName()));
			p.sendMessage(utils.chat("&8[&c*&8] &7You have been killed by &c" + killer.getDisplayName()));
		
		}	
		if(!(e.getEntity().getKiller() instanceof Player)) {
			Player p = e.getEntity();
			p.sendMessage(utils.chat("You have been killed by a mob" ));
			
		}
		}
			
		
		
	}


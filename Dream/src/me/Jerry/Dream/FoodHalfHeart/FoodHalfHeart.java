package me.Jerry.Dream.FoodHalfHeart;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;

import me.Jerry.Dream.Main.Main;

public class FoodHalfHeart implements Listener, CommandExecutor {
	
	
	private Main plugin;
	public FoodHalfHeart (Main plugin) {
		this.plugin = plugin;
		plugin.getCommand("RunFoodhalfheart").setExecutor(this);
		plugin.getCommand("StopFoodhalfheart").setExecutor(this);
		Bukkit.getPluginManager().registerEvents(this, plugin);
		
		
	}
	
	
	boolean x = false;
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		// TODO Auto-generated method stub
		
		if (!(sender instanceof Player)) {
			sender.sendMessage("only players may execute this command");
			return true;
		}
		
		Player p =(Player) sender;
		if (cmd.getName().equalsIgnoreCase("RunFoodhalfheart")) {
			
			x = true;
			p.sendMessage("Food Half Heart has started running");
			
		
			return true;

	}
		if (cmd.getName().equalsIgnoreCase("StopFoodhalfheart")) {
			
			x = false;
			p.sendMessage("Food Half Heart has stopped running");
			
			return true;

	}


		return false;
	}

		
	
	@EventHandler
	public void creatureSpawn(PlayerItemConsumeEvent e) {
	
	if(x == true) {

		if (e.getItem().getType().name().toLowerCase().contains("potion")){
			return;
		}
		if (e.getItem().getType().name().contains("bucket")) {
			return;
		}
		e.getPlayer().setHealth(1);
	}
	
	}
	}






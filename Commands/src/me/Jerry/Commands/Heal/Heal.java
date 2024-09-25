package me.Jerry.Commands.Heal;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;

import me.Jerry.Commands.Main.Main;

public class Heal implements CommandExecutor {

	
	private Main plugin;
	public Heal (Main plugin) {
		this.plugin = plugin;
		plugin.getCommand("heal").setExecutor(this);
		plugin.getCommand("h").setExecutor(this);
	}
	
	@Override
	public boolean onCommand( CommandSender sender, Command cmd, String label, String[] args) {
		// TODO Auto-generated method stub
		
		if (!(sender instanceof Player)) {
			sender.sendMessage(ChatColor.RED + "Only players can execute this command");
			return true;
		}
		
		Player p = (Player) sender;
		if (cmd.getName().equalsIgnoreCase("heal")) {
		  p.getPlayer().setHealth(20);
		  p.getPlayer().setFoodLevel(20);
		  p.sendMessage("you have been healed");
		  
		  
			  for (PotionEffect effect : p.getActivePotionEffects()) {
	                p.removePotionEffect(effect.getType());
			  }
	            	return true;
			  }
		
			  else if (cmd.getName().equalsIgnoreCase("h")) {
				  p.setHealth(20);
				  p.setFoodLevel(20);
				  p.sendMessage("you have been healed");
				  for (PotionEffect effect : p.getActivePotionEffects()) {
		                p.removePotionEffect(effect.getType());
				  }
				  return true;
			  }
	
		
		
		else {
			p.sendMessage("You do not have permission to execute this command!");
		}
	
		return false;
	}

}

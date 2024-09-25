package me.Jerry.Commands.Give;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import me.Jerry.Commands.Main.Main;


public class Give implements CommandExecutor {

	
	
	private Main plugin;
	public Give (Main plugin) {
		this.plugin = plugin;
		plugin.getCommand("item").setExecutor(this);
	
	}
	
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		// TODO Auto-generated method stub
		if(!(sender instanceof Player)) {
			sender.sendMessage("You must be a player to execute this command");
			return true;
		}
		Player p = (Player) sender;
		int quantity = 0;
		ItemStack name = null;
		
		if(cmd.getName().equalsIgnoreCase("item" + name + quantity)) {
			
		for(int i = 0; i <=quantity; i++) {
			p.getPlayer().getInventory().addItem(name);
			
		}
		}
		return false;
	}

}

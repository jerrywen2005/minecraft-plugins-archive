package me.Jerry.Commands.Kill;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.Jerry.Commands.Main.Main;


public class Kill implements CommandExecutor {

	private Main plugin;

	public Kill (Main plugin) {
		this.plugin=plugin;
		plugin.getCommand("k").setExecutor(this);
		
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		// TODO Auto-generated method stub
		
		
	
	
		if(!(sender instanceof Player)) {
			sender.sendMessage(ChatColor.RED+"Only players can execute this command!");
			return true;
		}
		Player p = (Player) sender;
		

		if(cmd.getName().equalsIgnoreCase("k")) {
			
		

				
			p.setHealth(10);
			return true;
				}
		
			
		
		return false;
	}

}

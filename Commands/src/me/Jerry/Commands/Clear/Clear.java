package me.Jerry.Commands.Clear;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.Jerry.Commands.Main.Main;


public class Clear implements CommandExecutor{
	
	private Main plugin;
   public Clear (Main plugin) {
		this.plugin = plugin;
		plugin.getCommand("clear").setExecutor(this);
	}

	@Override
	public boolean onCommand(CommandSender sender,  Command cmd,  String label, String[] args) {
		// TODO Auto-generated method stub
		
		if (!(sender instanceof Player)) {
			sender.sendMessage("only players may execute this message");
			return true;
		}
		
		Player p = (Player) sender;
		
		if(cmd.getName().equalsIgnoreCase("clear")){
			p.getPlayer().getInventory().clear();
			p.sendMessage("your inventory has been cleared");
			return true;
		
		}
		else {
			p.sendMessage("You do not have permission to execute this command!");
		}
		
		return false;
	}
	
	

}

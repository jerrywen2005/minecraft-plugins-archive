package me.Jerry.Commands.Gamemode;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.Jerry.Commands.Main.Main;


public class Gamemode implements CommandExecutor{
	
	
	private Main plugin;
	public Gamemode(Main plugin) {
		this.plugin = plugin;
		plugin.getCommand("gm0").setExecutor(this);
		plugin.getCommand("gm1").setExecutor(this);
		plugin.getCommand("gm2").setExecutor(this);
		plugin.getCommand("gm3").setExecutor(this);
	}
	

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		// TODO Auto-generated method stub
		if (!(sender instanceof Player)) {
			sender.sendMessage(ChatColor.RED + "only players may execute this command!");
			return true;
		}
		Player p =(Player)sender;
		
		if(cmd.getName().equalsIgnoreCase("gm0")){
			if (p.getGameMode() == GameMode.SURVIVAL) {
				return true;
			}else {
				p.sendMessage("You are now in Survival Mode");
			}
			p.setGameMode(GameMode.SURVIVAL); 
			return true;
		}
		
		else if(cmd.getName().equalsIgnoreCase("gm1")){
			if (p.getGameMode() == GameMode.CREATIVE) {
				return true;
			}else {
				p.sendMessage("You are now in Creative Mode");
			}
			p.setGameMode(GameMode.CREATIVE);
			return true;
		}
		
		else if(cmd.getName().equalsIgnoreCase("gm2")){
			if (p.getGameMode() == GameMode.ADVENTURE) {
				return true;
			}else {
				p.sendMessage("You are now in Adventure Mode");
			}
			p.setGameMode(GameMode.ADVENTURE);
			return true;
		}
		
		else if(cmd.getName().equalsIgnoreCase("gm3")){
			if (p.getGameMode() == GameMode.SPECTATOR) {
				return true;
			}else {
				p.sendMessage("You are now in Spectator Mode");
			}
			p.setGameMode(GameMode.SPECTATOR);

			return true;
		}
		else {
			p.sendMessage("You do not have permission to execute this command!");
		}
		
		return false;
	}

}

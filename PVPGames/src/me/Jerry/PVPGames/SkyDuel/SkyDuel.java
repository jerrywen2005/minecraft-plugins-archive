package me.Jerry.PVPGames.SkyDuel;

import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

import me.Jerry.PVPGames.Main.Main;


public class SkyDuel implements Listener, CommandExecutor{

	
	
	private Main plugin;
	public SkyDuel (Main plugin) {
		this.plugin = plugin;
		Bukkit.getPluginManager().registerEvents(this, plugin);
		plugin.getCommand("RunSkyDuel").setExecutor(this);
		plugin .getCommand("StopSkyDuel").setExecutor(this);
	}
	 
	Boolean x = false;
	@Override
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if (!(sender instanceof Player)) {
			sender.sendMessage("Only players may execute this command");
		}
		
		Player p = (Player) sender;
		Player target = Bukkit.getPlayer(args[0]);
		
		
		if (cmd.getName().equalsIgnoreCase("RunSkyDuel")) {
			if (cmd.getName().equalsIgnoreCase("red" +target)) {
			p.getWorld().getBlockAt(0, 0, 0).setType(Material.CHISELED_STONE_BRICKS);
				
			}
				
		}
		if (cmd.getName().equalsIgnoreCase("StopSkyDuel")) {
			x = false;
		}
		// TODO Auto-generated method stub
		return false;
	}
	

}

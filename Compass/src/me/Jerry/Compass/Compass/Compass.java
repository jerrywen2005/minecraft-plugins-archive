package me.Jerry.Compass.Compass;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import me.Jerry.Compass.Main.Main;

public class Compass implements Listener, CommandExecutor{
	
	private Main plugin;
	public Compass (Main plugin) {
		this.plugin = plugin;
		
		
		plugin.getCommand("RunAllBlocksGravity").setExecutor(this);
		plugin.getCommand("StopAllBlocksGravity").setExecutor(this);
		Bukkit.getPluginManager().registerEvents(this, plugin);
	}

	
	Boolean x = false;
	Boolean y = false;
	Player hunter;
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		// TODO Auto-generated method stub
		
		if (!(sender instanceof Player)) {
			sender.sendMessage("Only players may execute this command");
		}
		
		Player p = (Player) sender;
		
		if (cmd.getName().equalsIgnoreCase("runner")) {
			x= true;
			p.sendMessage("you are now a runner");
		}
		else {
			x=false;
		}
		
		if (cmd.getName().equalsIgnoreCase("hunter")) {
			y=true;
			p.sendMessage("you are now a hunter");
			hunter = p.getPlayer();
		}
		else {
			y=false;
		}
		
		return false;
	}
	
	
	@SuppressWarnings("deprecation")
	@EventHandler
	
	
	public void onPlayerClicks(PlayerInteractEvent event) {
		
		if (y==true) {
	    Player player = event.getPlayer();
	    Action action = event.getAction();

	     if (action.equals(Action.RIGHT_CLICK_AIR) || action.equals(Action.RIGHT_CLICK_BLOCK)) {
	         if (player.getItemInHand().getType() == Material.COMPASS) {
	        	 player.setCompassTarget(hunter.getLocation());
	        	 
	        	 if(hunter.getWorld().getEnvironment() != hunter.getWorld().getEnvironment() ) {
	        		 player.sendMessage("No runners found");
	        	 }
	        	 
	         
	         }
	         } 
	     }

	}

}

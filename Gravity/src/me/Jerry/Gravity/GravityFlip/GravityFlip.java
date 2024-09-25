package me.Jerry.Gravity.GravityFlip;

import java.util.Collection;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;


import me.Jerry.Gravity.Main.Main;



@SuppressWarnings("deprecation")
public class GravityFlip implements CommandExecutor, Listener{
	
	private Main plugin;
	public GravityFlip (Main plugin) {
		this.plugin = plugin;
		plugin.getCommand("RunGravityFlip").setExecutor(this);
		plugin.getCommand("StopGravityFlip").setExecutor(this);
		
	}

	
	boolean x = false;
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		// TODO Auto-generated method stub
		if (!(sender instanceof Player)) {
			sender.sendMessage("only players may execute this command");
		}
		
		Player p = (Player) sender;
		if (cmd.getName().equalsIgnoreCase("RunGravityFlip")) {
			x = true;
			p.sendMessage("Gravity Flip is now running");
			p.sendMessage("World gravity will flip every 5 mins");
		}
		if (cmd.getName().equalsIgnoreCase("StopGravityFlip")) {
			x = false;
			p.sendMessage("gravity flip has stopped running");
		}
		
		return false;
	}
	public static boolean FiveMinutePass ( boolean fivemins) {
		 

		Collection<? extends Player> p = Bukkit.getServer().getOnlinePlayers();
		
		
		Long CurrTime = ((Entity) p).getWorld().getTime();
		if (CurrTime == ((Entity) p).getWorld().getTime() - 6000) {
			fivemins = true;
			CurrTime = ((Entity) p).getWorld().getTime();
		}
		
		return fivemins;
	}


	  Collection<? extends Player> p = Bukkit.getServer().getOnlinePlayers();
	  {
		if(x == true) {
			((CommandSender) p).sendMessage("World Gravity will flip every 5 mins");
			if(FiveMinutePass(false) == true) {
			
				((CommandSender) p).sendMessage("Gravity is now flipping");
	
		Bukkit.getScheduler().scheduleAsyncRepeatingTask(plugin, new Runnable() {
		     @Override
		     public void run() {
		    	 
		    	 ((LivingEntity) p).addPotionEffect((new PotionEffect(PotionEffectType.ABSORPTION, 200, 10)));
		    	 
		   
		     }
		     
		}, 0, 20L * 300);
			}
		
		}
		
	}
	
	
	
	
        
}

	
	
	
	
	
		
	
	

	


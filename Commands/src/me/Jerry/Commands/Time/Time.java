package me.Jerry.Commands.Time;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import me.Jerry.Commands.Main.Main;

public class Time implements CommandExecutor {
	
	private Main plugin;
	
	public Time (Main plugin) {
		this.plugin = plugin;
		plugin.getCommand("d").setExecutor(this);
		plugin.getCommand("n").setExecutor(this);
		plugin.getCommand("day").setExecutor(this);
		plugin.getCommand("night").setExecutor(this);
		plugin.getCommand("ts0").setExecutor(this);
		plugin.getCommand("ts1").setExecutor(this);
		plugin.getCommand("ts2").setExecutor(this);
		plugin.getCommand("ts3").setExecutor(this);
		plugin.getCommand("ts4").setExecutor(this);
		plugin.getCommand("ts5").setExecutor(this);
		plugin.getCommand("ts6").setExecutor(this);
		plugin.getCommand("ts7").setExecutor(this);
		plugin.getCommand("ts8").setExecutor(this);
		plugin.getCommand("ts9").setExecutor(this);
		plugin.getCommand("ts10").setExecutor(this);
		plugin.getCommand("ts11").setExecutor(this);
		plugin.getCommand("ts12").setExecutor(this);
		plugin.getCommand("ts13").setExecutor(this);
		plugin.getCommand("ts14").setExecutor(this);
		plugin.getCommand("ts15").setExecutor(this);
		plugin.getCommand("ts16").setExecutor(this);
		plugin.getCommand("ts17").setExecutor(this);
		plugin.getCommand("ts18").setExecutor(this);
		plugin.getCommand("ts19").setExecutor(this);
		plugin.getCommand("ts20").setExecutor(this);
		plugin.getCommand("ts21").setExecutor(this);
		plugin.getCommand("ts22").setExecutor(this);
		plugin.getCommand("ts23").setExecutor(this);
		
		
	}

	
	
	
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		// TODO Auto-generated method stub
		if (!(sender instanceof Player)) {
			sender.sendMessage(ChatColor.RED + "only players may execute this command!");
			return true;
		}
		Player p =(Player)sender;
		
		if(cmd.getName().equalsIgnoreCase("ts6")) {
			p.getWorld().setTime(0);
			return true;
		}
		
		else if(cmd.getName().equalsIgnoreCase("ts7")) {
			p.getWorld().setTime(1000);
			return true;
		}
		
		else if(cmd.getName().equalsIgnoreCase("ts8")) {
			p.getWorld().setTime(2000);
			return true;
		}
		
		else if(cmd.getName().equalsIgnoreCase("ts9")) {
			p.getWorld().setTime(3000);
			return true;
		}
		
		else if(cmd.getName().equalsIgnoreCase("ts10")) {
			p.getWorld().setTime(4000);
			return true;
		}
		
		else if(cmd.getName().equalsIgnoreCase("ts11")) {
			p.getWorld().setTime(5000);
			return true;
		}
		
		else if(cmd.getName().equalsIgnoreCase("ts12")) {
			p.getWorld().setTime(6000);
			return true;
		}
		
		else if(cmd.getName().equalsIgnoreCase("ts13")) {
			p.getWorld().setTime(7000);
			return true;
		}
		
		else if(cmd.getName().equalsIgnoreCase("ts14")) {
			p.getWorld().setTime(8000);
			return true;
		}
		
		else if(cmd.getName().equalsIgnoreCase("ts15")) {
			p.getWorld().setTime(9000);
			return true;
		}
		
		else if(cmd.getName().equalsIgnoreCase("ts16")) {
			p.getWorld().setTime(10000);
			return true;
		}
		
		else if(cmd.getName().equalsIgnoreCase("ts17")) {
			p.getWorld().setTime(11000);
			return true;
		}
		
		else if(cmd.getName().equalsIgnoreCase("ts18")) {
			p.getWorld().setTime(12000);
			
			return true;	
		}
		
		else if(cmd.getName().equalsIgnoreCase("ts19")) {
			p.getWorld().setTime(13000);
			
			return true;	
		}
		
		else if(cmd.getName().equalsIgnoreCase("ts20")) {
			p.getWorld().setTime(14000);
			
			return true;
		}
		
		else if(cmd.getName().equalsIgnoreCase("ts21")) {
			p.getWorld().setTime(15000);
			return true;
		}
		
		else if(cmd.getName().equalsIgnoreCase("ts22")) {
			p.getWorld().setTime(16000);
			return true;
		}
		
		else if(cmd.getName().equalsIgnoreCase("ts23")) {
			p.getWorld().setTime(17000);
			return true;
		}
		
		else if(cmd.getName().equalsIgnoreCase("ts0")) {
			p.getWorld().setTime(18000);
			return true;
		}
		
		else if(cmd.getName().equalsIgnoreCase("ts1")) {
			p.getWorld().setTime(19000);
			return true;
		}
		
		else if(cmd.getName().equalsIgnoreCase("ts2")) {
			p.getWorld().setTime(20000);
			return true;
		}
		
		else if(cmd.getName().equalsIgnoreCase("ts3")) {
			p.getWorld().setTime(21000);
			return true;
		}
		
		else if(cmd.getName().equalsIgnoreCase("ts4")) {
			p.getWorld().setTime(22000);
			return true;
		}
		
		else if(cmd.getName().equalsIgnoreCase("ts5")) {
				p.getWorld().setTime(23000);
				return true;
		}
		
		
		else if(cmd.getName().equalsIgnoreCase("d")) {
			p.getWorld().setTime(1000);
			return true;
		}
		
		else if(cmd.getName().equalsIgnoreCase("n")) {
			p.getWorld().setTime(14000);
			return true;
		}
		
		else if(cmd.getName().equalsIgnoreCase("day")) {
			p.getWorld().setTime(1000);
			return true;
		}
		
		else if(cmd.getName().equalsIgnoreCase("night")) {
			p.getWorld().setTime(1400);
			return true;
		}
		
		else {
			p.sendMessage("You do not have permission to execute this command!");
		}
		
		return false;
	}
	

	
	}



package me.Jerry.Raining.TNT;

import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.FallingBlock;
import org.bukkit.entity.Player;
import org.bukkit.entity.TNTPrimed;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityChangeBlockEvent;

import me.Jerry.Raining.Main.Main;


public class RainingTNT implements Listener, CommandExecutor {

	private static Main plugin;
	public RainingTNT(Main plugin) {
		RainingTNT.plugin = plugin;
			plugin.getCommand("RunRainingTNT").setExecutor(this);
			plugin.getCommand("StopRainingTNT").setExecutor(this);
			Bukkit.getPluginManager().registerEvents(this, plugin);
	}
	
	
	long time = 1200;
 
Boolean x = false;
@Override
public boolean onCommand(CommandSender sender, Command cmd, String label,	String[] args) {
	// TODO Auto-generated method stub
	
	if (!(sender instanceof Player)){
		sender.sendMessage("Only players may execute this command");
		return true;
		
				}
	Player p = (Player) sender;
	
	

	 
	 
	if (cmd.getName().equalsIgnoreCase("RunRainingTNT")) {
		x= true;
		if (x == true) {
		p.sendMessage("Raining TNT is now running");
		

	
		
		Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, new Runnable() {
		    @Override
		    public void run() {
		    	 
		 
		    	
		time  = time* 9 /10;
		 
		Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, new Runnable() {

	
		    @SuppressWarnings("deprecation")
			@Override
		    public void run() {
		    	 if(x == false) {
					  Bukkit.getScheduler().cancelTasks(plugin);
		    	 }
		    	 List<Player> players =  p.getWorld().getPlayers();

				  int randomX = ThreadLocalRandom.current().nextInt(-20, 20 + 1);
				  
				  
				  int randomZ = ThreadLocalRandom.current().nextInt(-20, 20 + 1);
				  
				  for(int i=0;i<players.size();i++){
					Location locationTNT = players.get(i).getLocation().add(0-players.get(i).getLocation().getX(), 100-players.get(i).getLocation().getY(), 0-players.get(i).getLocation().getZ());
					locationTNT.getBlock().setType(Material.TNT);
					Block TNT = locationTNT.getBlock();

					double X = Math.floor(players.get(i).getLocation().getX());
					double Y = Math.floor(players.get(i).getLocation().getY());
					double Z = Math.floor(players.get(i).getLocation().getZ());
					
					
					
					
					
					players.get(i).getLocation().setX(X);
					players.get(i).getLocation().setY(Y);
					players.get(i).getLocation().setZ(Z);
					
				  		players.get(i).getWorld().spawnFallingBlock(players.get(i).getLocation().add(randomX, 100-players.get(i).getLocation().getY(), randomZ-0.5), Material.TNT, TNT.getData());
				  		players.get(i).sendMessage("retard");
		     }

	 
}
		},0L, time);
		
		

		
	}
		} ,0L, 1200);
		
		
	}
		
		return true;
	
	
	}
	
	
	
	
	
	
	
	if (cmd.getName().equalsIgnoreCase("StopRainingTNT")) {
		
		x = false;
		p.sendMessage("Raining TNT has stopped running");
		
		return true;
	}
	return false;


}

public void onblockfall (EntityChangeBlockEvent e) {
	if(e.getEntity() instanceof FallingBlock && e.getBlock().getType() == Material.TNT){
		
		if (e.getBlock().getLocation().subtract(0, 1, 0).getBlock().getType() != Material.AIR) {
		e.getBlock().getWorld().spawn(e.getBlock().getLocation(), TNTPrimed.class);
		e.getBlock().setType(Material.AIR);
		}
	}
	
}

}

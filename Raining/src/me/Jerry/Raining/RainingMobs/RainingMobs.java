package me.Jerry.Raining.RainingMobs;

import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Monster;
import org.bukkit.entity.Player;
import org.bukkit.entity.Slime;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;

import me.Jerry.Raining.Main.Main;


public class RainingMobs implements CommandExecutor, Listener {
	
	public static EntityType Mob (int random) {
		EntityType e= EntityType.BLAZE;
		if(random == 0 ) {
			e = EntityType.BLAZE; 
		}
		if(random == 1 ) {
			e = EntityType.SPIDER; 
		}
		if(random == 2 ) {
			e = EntityType.DROWNED; 
		}
		if(random == 3 ) {
			e = EntityType.CREEPER; 
		}
		if(random == 4 ) {
			e = EntityType.EVOKER; 
		}
		if(random ==5 ) {
			e = EntityType.GHAST; 
		}
		if(random == 6 ) {
			e = EntityType.ZOMBIE; 
		}
		if(random == 7 ) {
			e = EntityType.HUSK; 
		}
		if(random == 8 ) {
			e = EntityType.MAGMA_CUBE; 
		}
		if(random == 9 ) {
			e = EntityType.PHANTOM; 
		}
		if(random == 10 ) {
			e = EntityType.PILLAGER; 
		}
		if(random == 11 ) {
			e = EntityType.RAVAGER; 
		}
		if(random == 12 ) {
			e = EntityType.ZOMBIE_VILLAGER; 
		}
		if(random == 13 ) {
			e = EntityType.SILVERFISH; 
		}
		if(random == 14 ) {
			e = EntityType.SKELETON;
					}
		if(random == 15 ) {
			e = EntityType.ZOMBIE; 
		}
		
		
		if(random == 16 ) {
			e = EntityType.ZOMBIE; 
		}
		
		if(random == 17 ) {
			e = EntityType.STRAY; 
		}
		if(random == 18 ) {
			e = EntityType.CREEPER; 
		}
		if(random == 19 ) {
			e = EntityType.VEX; 
		}
		if(random == 20 ) {
			e = EntityType.VINDICATOR; 
		}
		if(random == 21 ) {
			e = EntityType.WITHER_SKELETON; 
		}
		
		
		return e;
		
	
	
	
	}
	
	
	
	    	private static Main plugin;
	    	public RainingMobs(Main plugin) {
	    		RainingMobs.plugin = plugin;
	    			plugin.getCommand("RunRainingMobs").setExecutor(this);
	    			plugin.getCommand("StopRainingMobs").setExecutor(this);
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
			
			
		
			 
			 
			if (cmd.getName().equalsIgnoreCase("RunRainingMobs")) {
				x= true;
				if (x == true) {
				p.sendMessage("Raining Mobs is now running");
				

			
				
				Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, new Runnable() {
				    @Override
				    public void run() {
				    	 
				 
				    	
				time  = time* 9 /10;
				 
				Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, new Runnable() {
		
			
				    @Override
				    public void run() {
				    	 
				  List<Player> players =  p.getWorld().getPlayers();

				  int randomX = ThreadLocalRandom.current().nextInt(-20, 20 + 1);
				  
				  int randomZ = ThreadLocalRandom.current().nextInt(-20, 20 + 1);
				  
			        
					  if(x == false) {
					  Bukkit.getScheduler().cancelTasks(plugin);
					  }
				  
				  for(int i=0;i<players.size();i++){
					 EntityType e =  Mob(new Random().nextInt(22));
					
					    players.get(i).getWorld().spawnEntity(players.get(i).getLocation().add(randomX,  150 - players.get(i).getLocation().getY(), randomZ), e);
					} 
		}
			 
		} ,0L, time);
				
				
		
				}
			},0L, 1200);
				
				}
				
				
				return true;
			}
			
			
			
			
			
			
			
			
			
			if (cmd.getName().equalsIgnoreCase("StopRainingMobs")) {
				
				x = false;
				p.sendMessage("Raining Mobs has stopped running");
				
				return true;
			}
			return false;
		
		
		}
		
		  @EventHandler(priority = EventPriority.HIGH)
		    public void onFallDamage(EntityDamageEvent e){
			if(x==true) {
		        if(e.getEntity() instanceof Monster && e.getCause() == DamageCause.FALL){
		        	 e.setCancelled(true);
		        }
		        }
		    
		    }
		  
		 
		}


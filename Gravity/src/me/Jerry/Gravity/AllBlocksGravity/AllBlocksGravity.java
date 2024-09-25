package me.Jerry.Gravity.AllBlocksGravity;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World.Environment;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import me.Jerry.Gravity.Main.Main;


public class AllBlocksGravity implements Listener, CommandExecutor{
	
   
	
	private Main plugin;
	public  AllBlocksGravity (Main plugin){
		this.plugin = plugin;
		plugin.getCommand("RunAllBlocksGravity").setExecutor(this);
		plugin.getCommand("StopAllBlocksGravity").setExecutor(this);
		Bukkit.getPluginManager().registerEvents(this, plugin);
		
	}
	
	boolean x = false;
	
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		// TODO Auto-generated method stub
		
		if (!(sender instanceof Player)){
			sender.sendMessage("Only players may execute this command");
			return true;
			
					}
		Player p = (Player) sender;
		
		if (cmd.getName().equalsIgnoreCase("RunAllBlocksGravity")) {
			x= true;
			p.sendMessage("All Blocks Gravity is now running");
			
			return true;
	}
		
		
		if (cmd.getName().equalsIgnoreCase("StopAllBlocksGravity")) {
			
			x = false;
			p.sendMessage("All Blocks Gravity has stopped running");
			
			return true;
		}
		
		return false;
	}
	
	
	@SuppressWarnings("deprecation")
	@EventHandler
	public void BlockPlace (BlockPlaceEvent e) {
		
		if(x == true) {
			if (e.getBlock().getLocation().subtract(0, 1, 0).getBlock().getType() != Material.AIR || e.getBlock().getType() == Material.OBSIDIAN) {
				return;
			}
		
		e.getBlock().getWorld().spawnFallingBlock(e.getBlock().getLocation().add(.5, 0, .5) , e.getBlock().getType(),e.getBlock().getData());
		e.getBlock().setType(Material.AIR);
	}
	}
	
	
	
	
		@SuppressWarnings("deprecation")
		@EventHandler
		public void BlockBreak (BlockBreakEvent e) {
			
			if(x == true) {

					for (int y = 1; y < 255; y++) {
						
							
						Location location = e.getBlock().getLocation();
						Location LocBlocksAbove = location.add(0, y, 0);
							if (LocBlocksAbove.getBlock().getType() == Material.AIR ) {
					
									
									break;
								
							}
							
						
							else {
								e.getBlock().getWorld().spawnFallingBlock(LocBlocksAbove.add(.5, 0, .5) , LocBlocksAbove.getBlock().getType(),LocBlocksAbove.getBlock().getData());
								LocBlocksAbove.getBlock().setType(Material.AIR);	
						
						}
					}
				}
			}
		
		
			
	
	
	
			
	@SuppressWarnings("deprecation")
	@EventHandler
	public void PlayerMove (PlayerMoveEvent e) {
		Player p = e.getPlayer();
		
		if(x == true) {
			for (int x = -5; x <= 5; x++) {
				for (int y = -20; y <= 20; y++) {
					for (int z = -5; z <= 5; z++) {
					
						
						
						Location location = p.getLocation().add(x, y, z );
						
						Block block = location.getBlock();
						
						
						double X = Math.floor(location.getX());
						double Y = Math.floor(location.getY());
						double Z = Math.floor(location.getZ());
						
						
						
						
						
						location.setX(X);
						location.setY(Y);
						location.setZ(Z);
						
					
					
						
						if (block.getType() != Material.AIR &&  block.getLocation().subtract(0, 1, 0).getBlock().getType() == Material.AIR && 
								block.getType() != Material.BEDROCK && block.getType() != Material.OBSIDIAN 	
								&& block.getType() != Material.WATER && block.getType() != Material.LAVA  
								
								
						) {
							
							
								block.getWorld().spawnFallingBlock(location.add(0.5, 0, 0.5), block.getType(), block.getData());
								
								
								block.setType(Material.AIR);
						
							
							}
					

						
						
						}
						
					}
					
				}
				
				
			}
			

		}

		
	}


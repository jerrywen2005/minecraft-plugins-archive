package me.Jerry.ChunksDelete.ChunksDelete;

import org.bukkit.Bukkit;
import org.bukkit.Chunk;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitScheduler;
import org.bukkit.scheduler.BukkitTask;

import me.Jerry.ChunksDelete.Main.Main;



public class ChunksDelete implements Listener, CommandExecutor{
	
	private Main plugin;
	public ChunksDelete(Main plugin) {
		this.plugin = plugin;
		
		plugin.getCommand("RunChunksDelete").setExecutor(this);
		plugin.getCommand("StopChunksDelete").setExecutor(this);
		Bukkit.getPluginManager().registerEvents(this, plugin);
	}

	Boolean b = false;
	
	
	@Override
	public boolean onCommand( CommandSender sender, Command cmd, String label, String[] args) {
		// TODO Auto-generated method stub
		
		if(!(sender instanceof Player)) {
			sender.sendMessage("Only players may execute this command");
		return true;
		}
		Player p = (Player) sender;
		if(cmd.getName().equalsIgnoreCase("RunChunksDelete")) {
			b= true;
			p.sendMessage("Chunks Delete is now running");
			return true;
		}
		
		if(cmd.getName().equalsIgnoreCase("StopChunksDelete")) {
			b= false;
			p.sendMessage("Chunks Delete has stopped running");
			return true;
		}
		return false;
	}
	
	@SuppressWarnings("deprecation")
	@EventHandler
	public void EnterChunk (PlayerMoveEvent e) {
		if (b ==true) {
			Player p = e.getPlayer();
		
			
			
			if (e.getFrom().getChunk().equals(e.getTo().getChunk())) {
				
				
				    	 
				    	 
				    	 
			
						for(int x=0; x<16; x++) {
							for(int z=0; z<16; z++) {
								for(int y=1; y<=255; y++) {
									Block b = p.getLocation().getChunk().getBlock(x, y, z);
									
									if(b.getType() != Material.AIR) {
									Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
									    @Override
									    public void run() {
									       
											b.setType(Material.AIR);
											
											
										 }
								 
							}, 20L);
										 }
										
									
									}
								
								}
							}
						   
				    
						
			}
			
		}
			
		
	}}



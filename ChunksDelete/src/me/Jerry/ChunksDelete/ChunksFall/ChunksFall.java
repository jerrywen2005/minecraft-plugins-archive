package me.Jerry.ChunksDelete.ChunksFall;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

import me.Jerry.ChunksDelete.Main.Main;


public class ChunksFall implements Listener, CommandExecutor{

	private Main plugin;
	public ChunksFall (Main plugin) {
		this.plugin = plugin;
		plugin.getCommand("RunChunksFall").setExecutor(this);
		plugin.getCommand("StopChunksFall").setExecutor(this);
		Bukkit.getPluginManager().registerEvents(this, plugin);
	}
	
	Boolean x = false;
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if (!(sender instanceof Player)) {
			sender.sendMessage("Only players may execute this command");
		}
		
		Player p = (Player) sender;
		
		if (cmd.getName().equalsIgnoreCase("RunChunksFall")) {
			x= true;
			p.sendMessage("Chunks Fall is now running");
		}
		
		if (cmd.getName().equalsIgnoreCase("StopChunksFall")) {
			x= false;
			p.sendMessage("Chunks Fall has stopped running");
		}
		// TODO Auto-generated method stub
		return false;
	}
	
	@SuppressWarnings("deprecation")
	@EventHandler
	public void EnterChunk (PlayerMoveEvent e) {
		if (x ==true) {
			Player p = e.getPlayer();
		
			
		 
			if (e.getFrom().getChunk().equals(e.getTo().getChunk())) {
				// chunk are equal
				
			
						for(int x=0; x<16; x++) {
							for(int z=0; z<16; z++) {
								for(int y=0; y<=255; y++) {
									
									Block b = p.getLocation().getChunk().getBlock(x, y, z);
									Location location = b.getLocation();
									double X = Math.floor(location.getX());
									double Y = Math.floor(location.getY());
									double Z = Math.floor(location.getZ());
									
									
									
									
									
									location.setX(X);
									location.setY(Y);
									location.setZ(Z);
									

									Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
									    @Override
									    public void run() {
									if(b.getType() != Material.AIR) {
											p.getWorld().spawnFallingBlock(location.add(0.5, 0, 0.5), b.getType(), b.getData());
											b.setType(Material.AIR);
											return;
											     }
									    }
									}, 20L);
										}
									}
								
								}
						
			}}
		}
	}



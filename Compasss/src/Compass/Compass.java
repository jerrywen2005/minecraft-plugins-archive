

package Compass;

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
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.inventory.ItemStack;

import me.Jerry.Compass.Main.Main;

public class Compass implements Listener, CommandExecutor{
	
	private Main plugin;
	public Compass (Main plugin) {
		this.plugin = plugin;
		
		
		plugin.getCommand("runner").setExecutor(this);
		plugin.getCommand("hunter").setExecutor(this);
		Bukkit.getPluginManager().registerEvents(this, plugin);
	
	
}	
	
	
	
Boolean x = false;
Player runner;
@SuppressWarnings("deprecation")
@Override
public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
	// TODO Auto-generated method stub
	
	if (!(sender instanceof Player)) {
		sender.sendMessage("Only players may execute this command");
	}
	
	Player p = (Player) sender;
	
	if (cmd.getName().equalsIgnoreCase("runner")) {
		
		p.sendMessage("you are now a runner");
		runner = p.getPlayer();
		x = false;
	}
	
	if (cmd.getName().equalsIgnoreCase("hunter")) {
		x=true;
		p.sendMessage("you are now a hunter");
		p.setItemInHand(new ItemStack(Material.COMPASS));
	}
	
	
	return false;
}


@SuppressWarnings("deprecation")
@EventHandler


public void onPlayerClicks(PlayerInteractEvent event) {
	
	if (x==true) {
    Player player = event.getPlayer();
    Action action = event.getAction();

     if (action.equals(Action.RIGHT_CLICK_AIR) || action.equals(Action.RIGHT_CLICK_BLOCK)) {
         if (player.getItemInHand().getType() == Material.COMPASS) {
        	 player.setCompassTarget(runner.getLocation());
        	 
        	 if(player.getWorld().getEnvironment() != runner.getWorld().getEnvironment() ) {
        		 player.sendMessage("No runners found");
        	 }
        	 
         
         }
         } 
     }

}
@SuppressWarnings("deprecation")
@EventHandler
public void respawn(PlayerRespawnEvent e) {
	if (x==true) {
		e.getPlayer().setItemInHand(new ItemStack(Material.COMPASS));
	}
}
} 

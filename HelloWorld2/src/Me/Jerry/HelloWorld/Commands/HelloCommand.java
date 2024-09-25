package Me.Jerry.HelloWorld.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.craftbukkit.v1_15_R1.Overridden;
import org.bukkit.entity.Player;

import Me.Jerry.HelloWorld.Main;

public class HelloCommand implements CommandExecutor {
	private Main plugin;
	public void HelloCommand(Main plugin) {
		this.plugin = plugin;
	}
@Overridden
public boolean onCommand(CommandSender sender,  Command cmd,  String label,
		 String[] args) {
	if (!(sender instanceof Player)) {
	sender.sendMessage("Only players may execute this command");
	return true;
}
	Player p = (Player)sender;
	
	if (p.hasPermission("hello.use")) {
		p.sendMessage("hi!");
		return true;
	} else {
		p.sendMessage("You do not have permission to execute this command!");
	}
		
	return false;
}
}

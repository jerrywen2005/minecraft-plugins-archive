package me.Jerry.Gravity.Main;

import org.bukkit.plugin.java.JavaPlugin;
import me.Jerry.Gravity.AllBlocksGravity.AllBlocksGravity;
import me.Jerry.Gravity.GravityFlip.GravityFlip;

public class Main extends JavaPlugin{
	
	
	@Override
	public void onEnable() {
		new AllBlocksGravity(this);
		new GravityFlip(this);
		
		
	}

}

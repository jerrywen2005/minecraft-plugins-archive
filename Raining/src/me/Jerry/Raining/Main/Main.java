package me.Jerry.Raining.Main;

import org.bukkit.plugin.java.JavaPlugin;

import me.Jerry.Raining.RainingMobs.RainingMobs;
import me.Jerry.Raining.TNT.RainingTNT;

public class Main extends JavaPlugin{
	
	@Override
	public void onEnable() {
		new RainingMobs (this);
		new RainingTNT (this);
	}

}

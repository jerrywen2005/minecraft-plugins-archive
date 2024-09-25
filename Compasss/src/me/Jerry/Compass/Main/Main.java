package me.Jerry.Compass.Main;

import org.bukkit.plugin.java.JavaPlugin;

import Compass.Compass;

public class Main extends JavaPlugin {	
	
	@Override
	public void onEnable() {
		saveDefaultConfig();
		
		new Compass(this);
	}

}
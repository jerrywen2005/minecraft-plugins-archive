package me.Jerry.Listeners;

import org.bukkit.plugin.java.JavaPlugin;

import me.Jerry.Listeners.Join.JoinListener;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		saveDefaultConfig();
		
		new JoinListener(this);
	}

}

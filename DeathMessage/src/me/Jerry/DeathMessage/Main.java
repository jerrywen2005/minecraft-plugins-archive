package me.Jerry.DeathMessage;

import org.bukkit.plugin.java.JavaPlugin;

import Listener.PlayerDeathListener;



public class Main extends JavaPlugin{
	
	@Override
	public void onEnable () {
		new PlayerDeathListener(this);
	}

}

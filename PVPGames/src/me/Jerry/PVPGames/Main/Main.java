package me.Jerry.PVPGames.Main;

import org.bukkit.plugin.java.JavaPlugin;

import me.Jerry.PVPGames.SkyDuel.SkyDuel;

public class Main extends JavaPlugin{
	
	@Override
	public void onEnable() {
		new SkyDuel (this);
	}

}

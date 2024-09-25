package me.Jerry.HelloWorld;

import org.bukkit.plugin.java.JavaPlugin;

import me.Jerry.HelloWorld.Command.HelloCommand;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		new HelloCommand(this);
		
	}

}

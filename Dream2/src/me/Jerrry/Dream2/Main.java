package me.Jerrry.Dream2;

import org.bukkit.plugin.java.JavaPlugin;
import me.Jerrry.Dream2.Listener.Listener;




public class Main extends JavaPlugin{
	
	@Override
	public void onEnable(){
		new Listener(this);
	}

}

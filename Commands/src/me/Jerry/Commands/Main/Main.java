package me.Jerry.Commands.Main;

import org.bukkit.plugin.java.JavaPlugin;

import me.Jerry.Commands.Clear.Clear;
import me.Jerry.Commands.Gamemode.Gamemode;
import me.Jerry.Commands.Give.Give;
import me.Jerry.Commands.Heal.Heal;
import me.Jerry.Commands.Kill.Kill;
import me.Jerry.Commands.Time.Time;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable(){
		new Gamemode(this);
		new Time(this);
		new Kill(this);
		new Give(this);
		new Heal (this);
		new Clear (this);
		
	}

}

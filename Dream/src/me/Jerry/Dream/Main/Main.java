package me.Jerry.Dream.Main;

import org.bukkit.plugin.java.JavaPlugin;

import me.Jerry.Dream.DiamondArmor.DiamondArmor;
import me.Jerry.Dream.FoodHalfHeart.FoodHalfHeart;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable(){
		new DiamondArmor (this);
		new FoodHalfHeart (this);
	}

}

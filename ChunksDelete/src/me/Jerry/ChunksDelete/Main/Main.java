package me.Jerry.ChunksDelete.Main;

import org.bukkit.plugin.java.JavaPlugin;

import me.Jerry.ChunksDelete.ChunksDelete.ChunksDelete;
import me.Jerry.ChunksDelete.ChunksFall.ChunksFall;

public class Main extends JavaPlugin{
	
	@Override
	public void onEnable() {
		new ChunksDelete(this);
		new ChunksFall(this);
	}

}

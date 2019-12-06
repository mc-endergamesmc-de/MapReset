package de.mapreset.main;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import de.mapreset.commands.LoadCommand;
import de.mapreset.commands.SaveCommand;

public class WorldReset extends JavaPlugin {
	
	public static Plugin plugin;
	
	@Override
	public void onDisable() {
		plugin = null;
		
	}
	
	@Override
	public void onEnable() {
		
		plugin = this;
		
		getCommand("save").setExecutor(new SaveCommand());
		getCommand("load").setExecutor(new LoadCommand());
		
		
	}

}

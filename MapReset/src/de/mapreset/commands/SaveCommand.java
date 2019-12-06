package de.mapreset.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.mapreset.util.MapReset;

public class SaveCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String list, String[] args) {
		
		Player player = (Player) sender;
		if(player.hasPermission("map.save")) {
			if(args.length == 0) {
				
				MapReset.saveWorld(Bukkit.getWorld("ende"));
				MapReset.saveWorld(Bukkit.getWorld("farm"));
				MapReset.saveWorld(Bukkit.getWorld("plots_nether"));
				player.sendMessage("Du hast folgende Welten gesved Farmwelt, Nether und Ende");
				
			}
		}
		return false;
	}

}

package de.mapreset.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.mapreset.util.MapReset;

public class LoadCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String list, String[] args) {
		
		Player player = (Player) sender;
		if(player.hasPermission("map.load")) {
			if(args.length == 0) {
				
				MapReset.resetWorld(Bukkit.getWorld("ende"));
				MapReset.resetWorld(Bukkit.getWorld("farm"));
				MapReset.resetWorld(Bukkit.getWorld("plots_nether"));
				player.sendMessage("Du hast folgende Welten geladen Farm, Nether und Ende");
				
			}
		}
		return false;
	}

}
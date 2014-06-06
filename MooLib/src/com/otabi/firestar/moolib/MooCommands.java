package com.otabi.firestar.moolib;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public class MooCommands implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {
		Player p = null;
		ConsoleCommandSender c = null;
		if(sender instanceof Player){
			p = (Player) sender;
		} else if(sender instanceof ConsoleCommandSender){
			c = (ConsoleCommandSender) sender;
		} else{
			return false;
		}
		if(cmd.getName().equalsIgnoreCase("reloadplugin")){
			if(args == null || args.length < 0){
				return false;
			}
			Bukkit.getPluginManager().disablePlugin(Bukkit.getPluginManager().getPlugin(args[0]));
			Bukkit.getPluginManager().enablePlugin(Bukkit.getPluginManager().getPlugin(args[0]));
			return true;
		}
		return false;
	}

}

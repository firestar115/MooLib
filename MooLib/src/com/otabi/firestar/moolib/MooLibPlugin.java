package com.otabi.firestar.moolib;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * The class you extend for method implementation (If you want)
 * 
 * @author moo_we_all_do
 * 
 */
public class MooLibPlugin extends JavaPlugin {

	public void onEnable() {
		infoLog("MooLibPlugin " + this.getName() + " enabled!");
	}

	/**
	 * Logs as MooLib with your message.
	 * 
	 * @param message
	 *            The message
	 */
	public static void infoLog(String message) {
		Bukkit.getLogger().info(
				TextUtils.chatToConsole(ChatColor.GRAY + "[" + ChatColor.WHITE
						+ "M" + ChatColor.GRAY + "o" + ChatColor.WHITE + "o"
						+ ChatColor.RED + "Lib" + ChatColor.GRAY + "] "
						+ ChatColor.YELLOW + message + ChatColor.WHITE));
	}

	public static void playerMessage(Player player, String message) {
		player.sendMessage(ChatColor.GRAY + "[" + ChatColor.WHITE + "M"
				+ ChatColor.GRAY + "o" + ChatColor.WHITE + "o" + ChatColor.RED
				+ "Lib" + ChatColor.GRAY + "] " + ChatColor.YELLOW + message
				+ ChatColor.WHITE);
	}

	public static void broadcast(String message) {
		for (Player p : Bukkit.getOnlinePlayers()) {
			p.sendMessage(ChatColor.GRAY + "[" + ChatColor.WHITE + "M"
					+ ChatColor.GRAY + "o" + ChatColor.WHITE + "o"
					+ ChatColor.RED + "Lib" + ChatColor.GRAY + "] "
					+ ChatColor.YELLOW + message + ChatColor.WHITE);
		}
	}

}

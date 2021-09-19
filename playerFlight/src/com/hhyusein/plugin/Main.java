package com.hhyusein.plugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;


public class Main extends JavaPlugin{
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_RESET = "\u001B[0m";
	
	@Override
	public void onEnable() {
		System.out.println(ANSI_GREEN + "FREE FLIGHT PLUGIN ENABLED!" + ANSI_RESET);
	}
	
	@Override
	public void onDisable() {
		System.out.println(ANSI_RED + "FREE FLIGHT PLUGIN DISABLED!" + ANSI_RESET);
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player = (Player) sender;
		if (cmd.getName().equals("pfly")) {
			if (sender instanceof Player) {
				if(args.length == 1) {
					if(args.length != 1) {
						player.sendMessage(ChatColor.RED + "Too many arguments!");
					} else {
						if (player.isFlying() == true) {
							player.setAllowFlight(false);
							player.setFlying(false);
							player.sendMessage(ChatColor.GRAY + "Flight disabled for " + ChatColor.GREEN + player.getName());
						} else {
							player.setAllowFlight(true);
							player.setFlying(true);
                            player.sendMessage(ChatColor.GRAY + "Flight enabled for " + ChatColor.GREEN + player.getName());
						}
					}
				} else {
					if (player.isFlying() == true) {
						player.setAllowFlight(false);
						player.setFlying(false);
						player.sendMessage(ChatColor.GRAY + "Flight disabled for " + ChatColor.GREEN + player.getName());
					} else {
						player.setAllowFlight(true);
						player.setFlying(true);
						player.sendMessage(ChatColor.GRAY + "Flight enabled for " + ChatColor.GREEN + player.getName());
					}
				}
			} else {
				System.out.println(ChatColor.RED + "Players only command.");
			}
		}
		
		return false;
		
	}

}

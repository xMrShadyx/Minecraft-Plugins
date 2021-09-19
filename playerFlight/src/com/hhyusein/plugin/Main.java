package com.hhyusein.plugin;

import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin{
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_RESET = "\u001B[0m";
	
	@Override
	public void onEnable() {
		System.out.println(ANSI_GREEN + "PlayerFlight ENABLED!" + ANSI_RESET);
		getCommand("pfly").setExecutor(new freeFly());
	}

	
	@Override
	public void onDisable() {
		System.out.println(ANSI_RED + "PlayerFlight DISABLED!" + ANSI_RESET);
	}


}

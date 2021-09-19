package com.hhyusein.plugin;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class freeFly implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player player = (Player) sender;
        if (cmd.getName().equals("pfly")) {
            if (sender != null) {
                if(args.length == 1) {
                    playerFly(player);
                } else {
                    playerFly(player);
                }
            } else {
                System.out.println(ChatColor.RED + "Players only command.");
            }
        }

        return false;

    }

    private void playerFly(Player player) {
        if (player.isFlying()) {
            player.setAllowFlight(false);
            player.setFlying(false);
            player.sendMessage(ChatColor.GRAY + "Flight disabled for " + ChatColor.GREEN + player.getName());
        } else {
            player.setAllowFlight(true);
            player.setFlying(true);
            player.sendMessage(ChatColor.GRAY + "Flight enabled for " + ChatColor.GREEN + player.getName());
        }
    }
}

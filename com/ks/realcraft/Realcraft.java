package com.ks.realcraft;

import com.ks.realcraft.craft.Craft;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Realcraft extends JavaPlugin {

    //private static Realcraft plugin;

    @Override
    public void onEnable() {
        getServer().getConsoleSender().sendMessage(ChatColor.LIGHT_PURPLE+"Adding Recipes");
        Craft.init();
        getServer().getConsoleSender().sendMessage(ChatColor.LIGHT_PURPLE+"DONE Adding Recipes");
        getServer().getConsoleSender().sendMessage(ChatColor.LIGHT_PURPLE + "[RealCraft] Real Craft is enabled.");
        getServer().getConsoleSender().sendMessage(ChatColor.LIGHT_PURPLE + "[RealCraft]-----------------------");
        getServer().getConsoleSender().sendMessage(ChatColor.LIGHT_PURPLE+"[RealCraft] |▔▔▔▔| |▔▔▔▔▔");
        getServer().getConsoleSender().sendMessage(ChatColor.LIGHT_PURPLE+"[RealCraft] |    | |");
        getServer().getConsoleSender().sendMessage(ChatColor.LIGHT_PURPLE+"[RealCraft] |____| |");
        getServer().getConsoleSender().sendMessage(ChatColor.LIGHT_PURPLE+"[RealCraft] |\\     |");
        getServer().getConsoleSender().sendMessage(ChatColor.LIGHT_PURPLE+"[RealCraft] |  \\   |_____");
        getServer().getConsoleSender().sendMessage(ChatColor.LIGHT_PURPLE + "[RealCraft]-----------------------");

    }


    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[RealCraft] Real Craft is disabled.");
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[RealCraft]-----------------------");
        getServer().getConsoleSender().sendMessage(ChatColor.RED+"[RealCraft] |▔▔▔▔| |▔▔▔▔▔");
        getServer().getConsoleSender().sendMessage(ChatColor.RED+"[RealCraft] |    | |");
        getServer().getConsoleSender().sendMessage(ChatColor.RED+"[RealCraft] |____| |");
        getServer().getConsoleSender().sendMessage(ChatColor.RED+"[RealCraft] |\\     |");
        getServer().getConsoleSender().sendMessage(ChatColor.RED+"[RealCraft] |  \\   |_____");
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[RealCraft]-----------------------");

    }

    //public static Realcraft getPlugin() {
    //    return plugin;
    //}
}

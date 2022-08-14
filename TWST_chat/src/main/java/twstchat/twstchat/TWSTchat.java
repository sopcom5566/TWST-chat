package twstchat.twstchat;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class TWSTchat extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getLogger().info(ChatColor.GREEN + "Enabled " + this.getName());
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        Bukkit.getLogger().info(ChatColor.RED + "Disable" + this.getName());
        // Plugin shutdown logic
    }
}

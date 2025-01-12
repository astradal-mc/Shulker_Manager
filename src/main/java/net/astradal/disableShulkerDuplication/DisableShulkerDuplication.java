package net.astradal.disableShulkerDuplication;

import net.astradal.disableShulkerDuplication.listeners.ShulkerDuplicationListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class DisableShulkerDuplication extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new ShulkerDuplicationListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

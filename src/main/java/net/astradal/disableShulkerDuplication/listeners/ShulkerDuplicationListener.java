package net.astradal.disableShulkerDuplication.listeners;

import io.papermc.paper.event.entity.ShulkerDuplicateEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ShulkerDuplicationListener implements Listener{
    private static final Logger LOGGER = LoggerFactory.getLogger("DisableShulkerDuplication");

    @EventHandler
    public void onShulkerDuplicationEvent(ShulkerDuplicateEvent event)
    {
        event.setCancelled(true);
        LOGGER.info("Shulker Duplication Event Cancelled");
    }
}

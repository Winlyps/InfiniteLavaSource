package winlyps.infiniteLavaSource

import org.bukkit.plugin.java.JavaPlugin

class InfiniteLavaSource : JavaPlugin() {

    override fun onEnable() {
        // Plugin startup logic
        server.worlds.forEach { world ->
            world.setGameRuleValue("lavaSourceConversion", "true")
        }
        logger.info("InfiniteLavaSource plugin has been enabled.")
    }

    override fun onDisable() {
        // Plugin shutdown logic
        server.worlds.forEach { world ->
            world.setGameRuleValue("lavaSourceConversion", "false")
            logger.info("InfiniteLavaSource plugin has been disabled.")
        }
    }
}
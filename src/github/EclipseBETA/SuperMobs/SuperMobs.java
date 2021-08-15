package github.EclipseBETA.SuperMobs;

import org.bukkit.plugin.java.JavaPlugin;

import github.EclipseBETA.SuperMobs.listeners.Listeners;

public class SuperMobs extends JavaPlugin{
	private static SuperMobs instance;
	
	public static SuperMobs getInstance() {
		return instance;
	}
	
	@Override
	public void onEnable() {
		instance = this;
		getServer().getPluginManager().registerEvents(new Listeners(), this);
	}
	
	@Override
	public void onDisable() { instance = null; }
}

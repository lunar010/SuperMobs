 package github.EclipseBETA.SuperMobs.listeners;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.inventory.ItemStack;

public class Listeners implements Listener {
	
	@EventHandler
	public void creatureSpawn(CreatureSpawnEvent e) {
		if(e.getEntityType() == EntityType.CREEPER) {
			Creeper creeper = (Creeper) e.getEntity();
			creeper.setPowered(true);
		} else if (e.getEntityType() == EntityType.ZOMBIE || e.getEntityType() == EntityType.SKELETON || e.getEntityType() == EntityType.HUSK) {
			if(e.getEntityType() == EntityType.SKELETON) {
				ItemStack punchBow = new ItemStack(Material.BOW);
				punchBow.addEnchantment(Enchantment.ARROW_KNOCKBACK, 5);
			} else {
				e.getEntity().getEquipment().setItemInMainHand(new ItemStack(Material.DIAMOND_SWORD)); 
			}
			
			e.getEntity().getEquipment().setHelmet(new ItemStack(Material.DIAMOND_HELMET));
			e.getEntity().getEquipment().setLeggings(new ItemStack(Material.DIAMOND_LEGGINGS));
			e.getEntity().getEquipment().setBoots(new ItemStack(Material.DIAMOND_BOOTS));
			e.getEntity().getEquipment().setChestplate(new ItemStack(Material.DIAMOND_CHESTPLATE));
		}
	}

}

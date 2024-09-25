package me.Jerry.Dream.DiamondArmor;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.inventory.ItemStack;

import me.Jerry.Dream.Main.Main;

public class DiamondArmor implements Listener {
	
	private Main plugin;
	public DiamondArmor (Main plugin) {
	this.plugin = plugin;
	Bukkit.getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
	public void creatureSpawn(CreatureSpawnEvent event) {	
		if (event.getEntityType() == EntityType.CREEPER) {
			
			Creeper creeper = (Creeper) event.getEntity();
			creeper.setPowered(true);
		}
	
	
	if (event.getEntityType() == EntityType.ZOMBIE) {
	Zombie zombie = (Zombie) event.getEntity();
	zombie.getEquipment().setBoots(new ItemStack(Material.DIAMOND_HELMET));
	zombie.getEquipment().setChestplate(new ItemStack(Material.DIAMOND_CHESTPLATE));
	zombie.getEquipment().setLeggings(new ItemStack(Material.DIAMOND_LEGGINGS));
	zombie.getEquipment().setHelmet(new ItemStack(Material.DIAMOND_HELMET));
	}
	
	if (event.getEntityType() == EntityType.SKELETON) {
	Skeleton skeleton = (Skeleton) event.getEntity();
	skeleton.getEquipment().setHelmet(new ItemStack(Material.DIAMOND_HELMET));
	skeleton.getEquipment().setChestplate(new ItemStack(Material.DIAMOND_CHESTPLATE));
	skeleton.getEquipment().setLeggings(new ItemStack(Material.DIAMOND_LEGGINGS));
	skeleton.getEquipment().setBoots(new ItemStack(Material.DIAMOND_BOOTS));
	
	
	ItemStack fireBow = new ItemStack(Material.BOW);
	fireBow.addEnchantment(Enchantment.ARROW_FIRE, 2);
	 skeleton.getEquipment().setItemInMainHand(fireBow);
	}
	
	}

}

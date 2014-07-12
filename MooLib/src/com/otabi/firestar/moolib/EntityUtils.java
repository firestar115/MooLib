package com.otabi.firestar.moolib;

import java.util.List;

import org.bukkit.FireworkEffect;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Firework;
import org.bukkit.entity.LivingEntity;
import org.bukkit.inventory.meta.FireworkMeta;

public class EntityUtils {

	public static List<Entity> getAllEntities(Entity from, double range) {
		return from.getNearbyEntities(range, range, range);
	}

	public static void playFirework(Location loc, FireworkEffect e) {
		Firework f = loc.getWorld().spawn(loc, Firework.class);
		FireworkMeta m = f.getFireworkMeta();
		m.addEffect(e);
		m.setPower(0);
		f.setFireworkMeta(m);
		f.detonate();
	}

	/**
	 * 
	 * @param e
	 *            The entity to kill
	 * @return a boolean indicating whether the entity was killed or not
	 */
	public static boolean kill(LivingEntity e) {
		e.setHealth(0.0D);
		if (e.isDead()) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 
	 * @param loc
	 *            Location
	 * @param type
	 *            Entity Type
	 * @param maxHealth
	 *            Maximum Health
	 * @param health
	 *            Current Health
	 */
	public static Entity spawnEntity(Location loc, EntityType type,
			int maxHealth, int health) {
		Entity e = loc.getWorld().spawnEntity(loc, type);
		if (e instanceof LivingEntity) {
			LivingEntity le = (LivingEntity) e;
			le.setMaxHealth(new Double(maxHealth));
			le.setHealth(new Double(health));
			return le;
		}
		return e;
	}

	public static void playFirework(Location location,
			List<FireworkEffect> effects) {
		Firework f = location.getWorld().spawn(location, Firework.class);
		FireworkMeta m = f.getFireworkMeta();
		for (FireworkEffect e : effects) {
			m.addEffect(e);
		}
		m.setPower(0);
		f.setFireworkMeta(m);
		f.detonate();
	}

}

package com.otabi.firestar.moolib;

import java.util.List;

import org.bukkit.FireworkEffect;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Firework;
import org.bukkit.inventory.meta.FireworkMeta;

public class EntityUtils {
	
	public static List<Entity> getAllEntities(Entity from, double range){
		return from.getNearbyEntities(range, range, range);
	}
	
	public static void playFirework(Location loc, FireworkEffect e){
		Firework f = loc.getWorld().spawn(loc, Firework.class);
		FireworkMeta m = f.getFireworkMeta();
		m.addEffect(e);
		m.setPower(0);
		f.setFireworkMeta(m);
		f.detonate();
	}
	
}

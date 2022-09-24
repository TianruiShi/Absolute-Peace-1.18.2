package net.mcreator.absolutepeace.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.ExperienceOrb;


public class StringodSpiderBoxEventProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		while (true) {
			// defind jump flag
			boolean jumpFlag = true;

			// spawn 
			if (world instanceof Level _level && !_level.isClientSide() && jumpFlag == true) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.STRING));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);

				// set flag false
				jumpFlag = false;
			}

			// exp
			if (world instanceof Level _level && !_level.isClientSide())
				_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 10));

			// spawn spider eye
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.SPIDER_EYE));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
				// jump
				break;
			}
		}
	}
}

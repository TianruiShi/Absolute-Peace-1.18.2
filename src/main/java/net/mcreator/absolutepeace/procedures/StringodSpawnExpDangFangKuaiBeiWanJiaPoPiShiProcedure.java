package net.mcreator.absolutepeace.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.ExperienceOrb;

public class StringodSpawnExpDangFangKuaiBeiWanJiaPoPiShiProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof Level _level && !_level.isClientSide())
			_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 1236));
	}
}

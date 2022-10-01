package net.mcreator.absolutepeace.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerPlayer;

import java.util.function.Supplier;
import java.util.Random;
import java.util.Map;

public class StringodPrintRebootGUIDangZheGeJieMianDaKaiQiJianMeiKeFaShengProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double num = 0;
		if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
			ItemStack _setstack = (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
					&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY);
			_setstack.setCount(Mth.nextInt(new Random(), 1, 64));
			((Slot) _slots.get(1)).set(_setstack);
			_player.containerMenu.broadcastChanges();
		}
	}
}

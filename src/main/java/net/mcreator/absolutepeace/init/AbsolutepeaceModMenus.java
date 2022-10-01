
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.absolutepeace.init;

import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.AbstractContainerMenu;

import net.mcreator.absolutepeace.world.inventory.StringodRecoveryBlockGUIMenu;
import net.mcreator.absolutepeace.world.inventory.StringodPrintRebootGUIMenu;
import net.mcreator.absolutepeace.world.inventory.StringodCraftTableGUIMenu;
import net.mcreator.absolutepeace.world.inventory.PinkCeatGUIMenu;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AbsolutepeaceModMenus {
	private static final List<MenuType<?>> REGISTRY = new ArrayList<>();
	public static final MenuType<StringodPrintRebootGUIMenu> STRINGOD_PRINT_REBOOT_GUI = register("stringod_print_reboot_gui",
			(id, inv, extraData) -> new StringodPrintRebootGUIMenu(id, inv, extraData));
	public static final MenuType<StringodCraftTableGUIMenu> STRINGOD_CRAFT_TABLE_GUI = register("stringod_craft_table_gui",
			(id, inv, extraData) -> new StringodCraftTableGUIMenu(id, inv, extraData));
	public static final MenuType<PinkCeatGUIMenu> PINK_CEAT_GUI = register("pink_ceat_gui",
			(id, inv, extraData) -> new PinkCeatGUIMenu(id, inv, extraData));
	public static final MenuType<StringodRecoveryBlockGUIMenu> STRINGOD_RECOVERY_BLOCK_GUI = register("stringod_recovery_block_gui",
			(id, inv, extraData) -> new StringodRecoveryBlockGUIMenu(id, inv, extraData));

	private static <T extends AbstractContainerMenu> MenuType<T> register(String registryname, IContainerFactory<T> containerFactory) {
		MenuType<T> menuType = new MenuType<T>(containerFactory);
		menuType.setRegistryName(registryname);
		REGISTRY.add(menuType);
		return menuType;
	}

	@SubscribeEvent
	public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MenuType[0]));
	}
}


/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.absolutepeace.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.absolutepeace.client.gui.StringodPrintRebootGUIScreen;
import net.mcreator.absolutepeace.client.gui.StringodCraftTableGUIScreen;
import net.mcreator.absolutepeace.client.gui.PinkCeatGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class AbsolutepeaceModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(AbsolutepeaceModMenus.STRINGOD_PRINT_REBOOT_GUI, StringodPrintRebootGUIScreen::new);
			MenuScreens.register(AbsolutepeaceModMenus.STRINGOD_CRAFT_TABLE_GUI, StringodCraftTableGUIScreen::new);
			MenuScreens.register(AbsolutepeaceModMenus.PINK_CEAT_GUI, PinkCeatGUIScreen::new);
		});
	}
}

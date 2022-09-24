
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.absolutepeace.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.entity.decoration.Motive;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AbsolutepeaceModPaintings {
	@SubscribeEvent
	public static void registerMotives(RegistryEvent.Register<Motive> event) {
		event.getRegistry().register(new Motive(64, 90).setRegistryName("stringod_draw_head_pic"));
		event.getRegistry().register(new Motive(32, 32).setRegistryName("stringod_draw_old_head_pic"));
		event.getRegistry().register(new Motive(128, 71).setRegistryName("stringod_draw_bg_pic"));
		event.getRegistry().register(new Motive(64, 128).setRegistryName("stringod_draw_pixel"));
		event.getRegistry().register(new Motive(100, 70).setRegistryName("stringod_draw_we_chat_screen_pic"));
	}
}

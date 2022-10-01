
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.absolutepeace.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.absolutepeace.block.StringodZombifiedBoxBlock;
import net.mcreator.absolutepeace.block.StringodZombieBoxBlock;
import net.mcreator.absolutepeace.block.StringodZipOreOreBlock;
import net.mcreator.absolutepeace.block.StringodSuperJumpBlock;
import net.mcreator.absolutepeace.block.StringodSpiderBoxBlock;
import net.mcreator.absolutepeace.block.StringodSpawnExpBlock;
import net.mcreator.absolutepeace.block.StringodSlimeBoxBlock;
import net.mcreator.absolutepeace.block.StringodSkeletonBoxBlock;
import net.mcreator.absolutepeace.block.StringodRecoveryBlockBlock;
import net.mcreator.absolutepeace.block.StringodQuartzWorldPortalBlock;
import net.mcreator.absolutepeace.block.StringodPrintRebootBlock;
import net.mcreator.absolutepeace.block.StringodPinkBigCheatBlock;
import net.mcreator.absolutepeace.block.StringodPillagerBoxBlock;
import net.mcreator.absolutepeace.block.StringodNetheriteBoxBlock;
import net.mcreator.absolutepeace.block.StringodMagmaBoxBlock;
import net.mcreator.absolutepeace.block.StringodIronWorldPortalBlock;
import net.mcreator.absolutepeace.block.StringodIronBoxBlock;
import net.mcreator.absolutepeace.block.StringodGoldWorldPortalBlock;
import net.mcreator.absolutepeace.block.StringodGoldBoxBlock;
import net.mcreator.absolutepeace.block.StringodEvokerBoxBlock;
import net.mcreator.absolutepeace.block.StringodEndermanBoxBlock;
import net.mcreator.absolutepeace.block.StringodEmeraldWorldPortalBlock;
import net.mcreator.absolutepeace.block.StringodEmeraldBoxBlock;
import net.mcreator.absolutepeace.block.StringodDrownedBoxBlock;
import net.mcreator.absolutepeace.block.StringodDiamondWorldPortalBlock;
import net.mcreator.absolutepeace.block.StringodDiamondBoxBlock;
import net.mcreator.absolutepeace.block.StringodCreeperBoxBlock;
import net.mcreator.absolutepeace.block.StringodCraftTableBlock;
import net.mcreator.absolutepeace.block.StringodCopperBoxBlock;
import net.mcreator.absolutepeace.block.StringodCoalWorldPortalBlock;
import net.mcreator.absolutepeace.block.StringodCoalBoxBlock;
import net.mcreator.absolutepeace.block.StringodBlazeBoxBlock;
import net.mcreator.absolutepeace.block.StringODCharcoalBoxBlock;
import net.mcreator.absolutepeace.block.AutomaticBlock;
import net.mcreator.absolutepeace.AbsolutepeaceMod;

public class AbsolutepeaceModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, AbsolutepeaceMod.MODID);
	public static final RegistryObject<Block> STRINGOD_CRAFT_TABLE = REGISTRY.register("stringod_craft_table", () -> new StringodCraftTableBlock());
	public static final RegistryObject<Block> STRINGOD_IRON_WORLD_PORTAL = REGISTRY.register("stringod_iron_world_portal",
			() -> new StringodIronWorldPortalBlock());
	public static final RegistryObject<Block> STRINGOD_GOLD_WORLD_PORTAL = REGISTRY.register("stringod_gold_world_portal",
			() -> new StringodGoldWorldPortalBlock());
	public static final RegistryObject<Block> STRINGOD_DIAMOND_WORLD_PORTAL = REGISTRY.register("stringod_diamond_world_portal",
			() -> new StringodDiamondWorldPortalBlock());
	public static final RegistryObject<Block> STRINGOD_EMERALD_WORLD_PORTAL = REGISTRY.register("stringod_emerald_world_portal",
			() -> new StringodEmeraldWorldPortalBlock());
	public static final RegistryObject<Block> STRINGOD_COAL_WORLD_PORTAL = REGISTRY.register("stringod_coal_world_portal",
			() -> new StringodCoalWorldPortalBlock());
	public static final RegistryObject<Block> STRINGOD_PRINT_REBOOT = REGISTRY.register("stringod_print_reboot",
			() -> new StringodPrintRebootBlock());
	public static final RegistryObject<Block> STRINGOD_QUARTZ_WORLD_PORTAL = REGISTRY.register("stringod_quartz_world_portal",
			() -> new StringodQuartzWorldPortalBlock());
	public static final RegistryObject<Block> STRINGOD_SPIDER_BOX = REGISTRY.register("stringod_spider_box", () -> new StringodSpiderBoxBlock());
	public static final RegistryObject<Block> STRINGOD_BLAZE_BOX = REGISTRY.register("stringod_blaze_box", () -> new StringodBlazeBoxBlock());
	public static final RegistryObject<Block> AUTOMATIC = REGISTRY.register("automatic", () -> new AutomaticBlock());
	public static final RegistryObject<Block> STRINGOD_SKELETON_BOX = REGISTRY.register("stringod_skeleton_box",
			() -> new StringodSkeletonBoxBlock());
	public static final RegistryObject<Block> STRINGOD_CREEPER_BOX = REGISTRY.register("stringod_creeper_box", () -> new StringodCreeperBoxBlock());
	public static final RegistryObject<Block> STRINGOD_SLIME_BOX = REGISTRY.register("stringod_slime_box", () -> new StringodSlimeBoxBlock());
	public static final RegistryObject<Block> STRINGOD_MAGMA_BOX = REGISTRY.register("stringod_magma_box", () -> new StringodMagmaBoxBlock());
	public static final RegistryObject<Block> STRINGOD_ENDERMAN_BOX = REGISTRY.register("stringod_enderman_box",
			() -> new StringodEndermanBoxBlock());
	public static final RegistryObject<Block> STRINGOD_ZOMBIE_BOX = REGISTRY.register("stringod_zombie_box", () -> new StringodZombieBoxBlock());
	public static final RegistryObject<Block> STRINGOD_DROWNED_BOX = REGISTRY.register("stringod_drowned_box", () -> new StringodDrownedBoxBlock());
	public static final RegistryObject<Block> STRINGOD_ZOMBIFIED_BOX = REGISTRY.register("stringod_zombified_box",
			() -> new StringodZombifiedBoxBlock());
	public static final RegistryObject<Block> STRINGOD_EVOKER_BOX = REGISTRY.register("stringod_evoker_box", () -> new StringodEvokerBoxBlock());
	public static final RegistryObject<Block> STRINGOD_PILLAGER_BOX = REGISTRY.register("stringod_pillager_box",
			() -> new StringodPillagerBoxBlock());
	public static final RegistryObject<Block> STRINGOD_SPAWN_EXP = REGISTRY.register("stringod_spawn_exp", () -> new StringodSpawnExpBlock());
	public static final RegistryObject<Block> STRING_OD_CHARCOAL_BOX = REGISTRY.register("string_od_charcoal_box",
			() -> new StringODCharcoalBoxBlock());
	public static final RegistryObject<Block> STRINGOD_COAL_BOX = REGISTRY.register("stringod_coal_box", () -> new StringodCoalBoxBlock());
	public static final RegistryObject<Block> STRINGOD_COPPER_BOX = REGISTRY.register("stringod_copper_box", () -> new StringodCopperBoxBlock());
	public static final RegistryObject<Block> STRINGOD_DIAMOND_BOX = REGISTRY.register("stringod_diamond_box", () -> new StringodDiamondBoxBlock());
	public static final RegistryObject<Block> STRINGOD_EMERALD_BOX = REGISTRY.register("stringod_emerald_box", () -> new StringodEmeraldBoxBlock());
	public static final RegistryObject<Block> STRINGOD_GOLD_BOX = REGISTRY.register("stringod_gold_box", () -> new StringodGoldBoxBlock());
	public static final RegistryObject<Block> STRINGOD_IRON_BOX = REGISTRY.register("stringod_iron_box", () -> new StringodIronBoxBlock());
	public static final RegistryObject<Block> STRINGOD_NETHERITE_BOX = REGISTRY.register("stringod_netherite_box",
			() -> new StringodNetheriteBoxBlock());
	public static final RegistryObject<Block> STRINGOD_PINK_BIG_CHEAT = REGISTRY.register("stringod_pink_big_cheat",
			() -> new StringodPinkBigCheatBlock());
	public static final RegistryObject<Block> STRINGOD_SUPER_JUMP = REGISTRY.register("stringod_super_jump", () -> new StringodSuperJumpBlock());
	public static final RegistryObject<Block> STRINGOD_ZIP_ORE_ORE = REGISTRY.register("stringod_zip_ore_ore", () -> new StringodZipOreOreBlock());
	public static final RegistryObject<Block> STRINGOD_RECOVERY_BLOCK = REGISTRY.register("stringod_recovery_block",
			() -> new StringodRecoveryBlockBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			StringodCraftTableBlock.registerRenderLayer();
			StringodSpiderBoxBlock.registerRenderLayer();
			StringodBlazeBoxBlock.registerRenderLayer();
			StringodSkeletonBoxBlock.registerRenderLayer();
			StringodCreeperBoxBlock.registerRenderLayer();
			StringodSlimeBoxBlock.registerRenderLayer();
			StringodMagmaBoxBlock.registerRenderLayer();
			StringodEndermanBoxBlock.registerRenderLayer();
			StringodZombieBoxBlock.registerRenderLayer();
			StringodDrownedBoxBlock.registerRenderLayer();
			StringodZombifiedBoxBlock.registerRenderLayer();
			StringodEvokerBoxBlock.registerRenderLayer();
			StringodPillagerBoxBlock.registerRenderLayer();
			StringodSpawnExpBlock.registerRenderLayer();
			StringODCharcoalBoxBlock.registerRenderLayer();
			StringodCoalBoxBlock.registerRenderLayer();
			StringodCopperBoxBlock.registerRenderLayer();
			StringodDiamondBoxBlock.registerRenderLayer();
			StringodEmeraldBoxBlock.registerRenderLayer();
			StringodGoldBoxBlock.registerRenderLayer();
			StringodIronBoxBlock.registerRenderLayer();
			StringodNetheriteBoxBlock.registerRenderLayer();
			StringodZipOreOreBlock.registerRenderLayer();
		}
	}
}

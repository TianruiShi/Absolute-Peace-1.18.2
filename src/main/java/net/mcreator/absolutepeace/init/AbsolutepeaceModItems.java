
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.absolutepeace.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.absolutepeace.item.StringodQuartzWorldItem;
import net.mcreator.absolutepeace.item.StringodItemShiXiongItem;
import net.mcreator.absolutepeace.item.StringodItemShiGeItem;
import net.mcreator.absolutepeace.item.StringodItemRuiGeItem;
import net.mcreator.absolutepeace.item.StringodItemGeGeItem;
import net.mcreator.absolutepeace.item.StringodIronWorldItem;
import net.mcreator.absolutepeace.item.StringodGoldWorldItem;
import net.mcreator.absolutepeace.item.StringodEmeraldWorldItem;
import net.mcreator.absolutepeace.item.StringodDiamondWorldItem;
import net.mcreator.absolutepeace.item.StringodCoalWorldItem;
import net.mcreator.absolutepeace.item.StringodArmorItem;
import net.mcreator.absolutepeace.item.StringodArmorArmorItem;
import net.mcreator.absolutepeace.AbsolutepeaceMod;

public class AbsolutepeaceModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, AbsolutepeaceMod.MODID);
	public static final RegistryObject<Item> STRINGOD_CRAFT_TABLE = block(AbsolutepeaceModBlocks.STRINGOD_CRAFT_TABLE,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> STRINGOD_IRON_WORLD = REGISTRY.register("stringod_iron_world", () -> new StringodIronWorldItem());
	public static final RegistryObject<Item> STRINGOD_GOLD_WORLD = REGISTRY.register("stringod_gold_world", () -> new StringodGoldWorldItem());
	public static final RegistryObject<Item> STRINGOD_DIAMOND_WORLD = REGISTRY.register("stringod_diamond_world",
			() -> new StringodDiamondWorldItem());
	public static final RegistryObject<Item> STRINGOD_EMERALD_WORLD = REGISTRY.register("stringod_emerald_world",
			() -> new StringodEmeraldWorldItem());
	public static final RegistryObject<Item> STRINGOD_COAL_WORLD = REGISTRY.register("stringod_coal_world", () -> new StringodCoalWorldItem());
	public static final RegistryObject<Item> STRINGOD_PRINT_REBOOT = block(AbsolutepeaceModBlocks.STRINGOD_PRINT_REBOOT,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> STRINGOD_QUARTZ_WORLD = REGISTRY.register("stringod_quartz_world", () -> new StringodQuartzWorldItem());
	public static final RegistryObject<Item> STRINGOD_SPIDER_BOX = block(AbsolutepeaceModBlocks.STRINGOD_SPIDER_BOX,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> STRINGOD_BLAZE_BOX = block(AbsolutepeaceModBlocks.STRINGOD_BLAZE_BOX,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> AUTOMATIC = block(AbsolutepeaceModBlocks.AUTOMATIC, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> STRINGOD_SKELETON_BOX = block(AbsolutepeaceModBlocks.STRINGOD_SKELETON_BOX,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> STRINGOD_CREEPER_BOX = block(AbsolutepeaceModBlocks.STRINGOD_CREEPER_BOX,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> STRINGOD_SLIME_BOX = block(AbsolutepeaceModBlocks.STRINGOD_SLIME_BOX,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> STRINGOD_MAGMA_BOX = block(AbsolutepeaceModBlocks.STRINGOD_MAGMA_BOX,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> STRINGOD_ENDERMAN_BOX = block(AbsolutepeaceModBlocks.STRINGOD_ENDERMAN_BOX,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> STRINGOD_ZOMBIE_BOX = block(AbsolutepeaceModBlocks.STRINGOD_ZOMBIE_BOX,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> STRINGOD_DROWNED_BOX = block(AbsolutepeaceModBlocks.STRINGOD_DROWNED_BOX,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> STRINGOD_ZOMBIFIED_BOX = block(AbsolutepeaceModBlocks.STRINGOD_ZOMBIFIED_BOX,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> STRINGOD_EVOKER_BOX = block(AbsolutepeaceModBlocks.STRINGOD_EVOKER_BOX,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> STRINGOD_PILLAGER_BOX = block(AbsolutepeaceModBlocks.STRINGOD_PILLAGER_BOX,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> STRINGOD_SPAWN_EXP = block(AbsolutepeaceModBlocks.STRINGOD_SPAWN_EXP,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> STRINGOD_ITEM_SHI_GE = REGISTRY.register("stringod_item_shi_ge", () -> new StringodItemShiGeItem());
	public static final RegistryObject<Item> STRING_OD_CHARCOAL_BOX = block(AbsolutepeaceModBlocks.STRING_OD_CHARCOAL_BOX,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> STRINGOD_COAL_BOX = block(AbsolutepeaceModBlocks.STRINGOD_COAL_BOX, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> STRINGOD_COPPER_BOX = block(AbsolutepeaceModBlocks.STRINGOD_COPPER_BOX,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> STRINGOD_DIAMOND_BOX = block(AbsolutepeaceModBlocks.STRINGOD_DIAMOND_BOX,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> STRINGOD_EMERALD_BOX = block(AbsolutepeaceModBlocks.STRINGOD_EMERALD_BOX,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> STRINGOD_GOLD_BOX = block(AbsolutepeaceModBlocks.STRINGOD_GOLD_BOX, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> STRINGOD_IRON_BOX = block(AbsolutepeaceModBlocks.STRINGOD_IRON_BOX, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> STRINGOD_NETHERITE_BOX = block(AbsolutepeaceModBlocks.STRINGOD_NETHERITE_BOX,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> STRINGOD_ITEM_RUI_GE = REGISTRY.register("stringod_item_rui_ge", () -> new StringodItemRuiGeItem());
	public static final RegistryObject<Item> STRINGOD_ITEM_GE_GE = REGISTRY.register("stringod_item_ge_ge", () -> new StringodItemGeGeItem());
	public static final RegistryObject<Item> STRINGOD_ITEM_SHI_XIONG = REGISTRY.register("stringod_item_shi_xiong",
			() -> new StringodItemShiXiongItem());
	public static final RegistryObject<Item> STRINGOD_PINK_BIG_CHEAT = block(AbsolutepeaceModBlocks.STRINGOD_PINK_BIG_CHEAT,
			CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> STRINGOD_SUPER_JUMP = block(AbsolutepeaceModBlocks.STRINGOD_SUPER_JUMP, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> STRINGOD_ARMOR_HELMET = REGISTRY.register("stringod_armor_helmet", () -> new StringodArmorItem.Helmet());
	public static final RegistryObject<Item> STRINGOD_ARMOR_CHESTPLATE = REGISTRY.register("stringod_armor_chestplate",
			() -> new StringodArmorItem.Chestplate());
	public static final RegistryObject<Item> STRINGOD_ARMOR_LEGGINGS = REGISTRY.register("stringod_armor_leggings",
			() -> new StringodArmorItem.Leggings());
	public static final RegistryObject<Item> STRINGOD_ARMOR_BOOTS = REGISTRY.register("stringod_armor_boots", () -> new StringodArmorItem.Boots());
	public static final RegistryObject<Item> STRINGOD_ARMOR_ARMOR_HELMET = REGISTRY.register("stringod_armor_armor_helmet",
			() -> new StringodArmorArmorItem.Helmet());
	public static final RegistryObject<Item> STRINGOD_ARMOR_ARMOR_CHESTPLATE = REGISTRY.register("stringod_armor_armor_chestplate",
			() -> new StringodArmorArmorItem.Chestplate());
	public static final RegistryObject<Item> STRINGOD_ARMOR_ARMOR_LEGGINGS = REGISTRY.register("stringod_armor_armor_leggings",
			() -> new StringodArmorArmorItem.Leggings());
	public static final RegistryObject<Item> STRINGOD_ARMOR_ARMOR_BOOTS = REGISTRY.register("stringod_armor_armor_boots",
			() -> new StringodArmorArmorItem.Boots());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}


/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.absolutepeace.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.absolutepeace.block.entity.StringodPinkBigCheatBlockEntity;
import net.mcreator.absolutepeace.AbsolutepeaceMod;

public class AbsolutepeaceModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES,
			AbsolutepeaceMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> STRINGOD_PINK_BIG_CHEAT = register("stringod_pink_big_cheat",
			AbsolutepeaceModBlocks.STRINGOD_PINK_BIG_CHEAT, StringodPinkBigCheatBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}

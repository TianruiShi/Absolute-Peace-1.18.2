
package net.mcreator.absolutepeace.world.features.ores;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTestType;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.OreFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.core.Registry;
import net.minecraft.core.Holder;

import net.mcreator.absolutepeace.init.AbsolutepeaceModBlocks;

import java.util.Set;
import java.util.Random;
import java.util.List;

public class StringodSpawnExpFeature extends OreFeature {
	public static StringodSpawnExpFeature FEATURE = null;
	public static Holder<ConfiguredFeature<OreConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new StringodSpawnExpFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("absolutepeace:stringod_spawn_exp", FEATURE, new OreConfiguration(
				StringodSpawnExpFeatureRuleTest.INSTANCE, AbsolutepeaceModBlocks.STRINGOD_SPAWN_EXP.get().defaultBlockState(), 10));
		PLACED_FEATURE = PlacementUtils.register("absolutepeace:stringod_spawn_exp", CONFIGURED_FEATURE,
				List.of(CountPlacement.of(10), InSquarePlacement.spread(),
						HeightRangePlacement.uniform(VerticalAnchor.absolute(10), VerticalAnchor.absolute(64)), BiomeFilter.biome()));
		return FEATURE;
	}

	public static Holder<PlacedFeature> placedFeature() {
		return PLACED_FEATURE;
	}

	public static final Set<ResourceLocation> GENERATE_BIOMES = null;
	private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD,
			ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("absolutepeace:stringod_iron_world")),
			ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("absolutepeace:stringod_gold_world")),
			ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("absolutepeace:stringod_diamond_world")),
			ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("absolutepeace:stringod_emerald_world")),
			ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("absolutepeace:stringod_coal_world")),
			ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("absolutepeace:stringod_quartz_world")));

	public StringodSpawnExpFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generate_dimensions.contains(world.getLevel().dimension()))
			return false;
		return super.place(context);
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	private static class StringodSpawnExpFeatureRuleTest extends RuleTest {
		static final StringodSpawnExpFeatureRuleTest INSTANCE = new StringodSpawnExpFeatureRuleTest();
		private static final com.mojang.serialization.Codec<StringodSpawnExpFeatureRuleTest> CODEC = com.mojang.serialization.Codec
				.unit(() -> INSTANCE);
		private static final RuleTestType<StringodSpawnExpFeatureRuleTest> CUSTOM_MATCH = () -> CODEC;

		@SubscribeEvent
		public static void init(FMLCommonSetupEvent event) {
			Registry.register(Registry.RULE_TEST, new ResourceLocation("absolutepeace:stringod_spawn_exp_match"), CUSTOM_MATCH);
		}

		private List<Block> base_blocks = null;

		public boolean test(BlockState blockAt, Random random) {
			if (base_blocks == null) {
				base_blocks = List.of(Blocks.STONE);
			}
			return base_blocks.contains(blockAt.getBlock());
		}

		protected RuleTestType<?> getType() {
			return CUSTOM_MATCH;
		}
	}
}

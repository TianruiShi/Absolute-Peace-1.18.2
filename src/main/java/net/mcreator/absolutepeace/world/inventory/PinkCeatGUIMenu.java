
package net.mcreator.absolutepeace.world.inventory;

import net.minecraftforge.items.SlotItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.absolutepeace.procedures.PinkCeatGUIDangZheGeJieMianDaKaiQiJianMeiKeFaShengProcedure;
import net.mcreator.absolutepeace.init.AbsolutepeaceModMenus;

import java.util.function.Supplier;
import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber
public class PinkCeatGUIMenu extends AbstractContainerMenu implements Supplier<Map<Integer, Slot>> {
	public final static HashMap<String, Object> guistate = new HashMap<>();
	public final Level world;
	public final Player entity;
	public int x, y, z;
	private IItemHandler internal;
	private final Map<Integer, Slot> customSlots = new HashMap<>();
	private boolean bound = false;

	public PinkCeatGUIMenu(int id, Inventory inv, FriendlyByteBuf extraData) {
		super(AbsolutepeaceModMenus.PINK_CEAT_GUI, id);
		this.entity = inv.player;
		this.world = inv.player.level;
		this.internal = new ItemStackHandler(181);
		BlockPos pos = null;
		if (extraData != null) {
			pos = extraData.readBlockPos();
			this.x = pos.getX();
			this.y = pos.getY();
			this.z = pos.getZ();
		}
		if (pos != null) {
			if (extraData.readableBytes() == 1) { // bound to item
				byte hand = extraData.readByte();
				ItemStack itemstack;
				if (hand == 0)
					itemstack = this.entity.getMainHandItem();
				else
					itemstack = this.entity.getOffhandItem();
				itemstack.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					this.internal = capability;
					this.bound = true;
				});
			} else if (extraData.readableBytes() > 1) {
				extraData.readByte(); // drop padding
				Entity entity = world.getEntity(extraData.readVarInt());
				if (entity != null)
					entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						this.internal = capability;
						this.bound = true;
					});
			} else { // might be bound to block
				BlockEntity ent = inv.player != null ? inv.player.level.getBlockEntity(pos) : null;
				if (ent != null) {
					ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						this.internal = capability;
						this.bound = true;
					});
				}
			}
		}
		this.customSlots.put(1, this.addSlot(new SlotItemHandler(internal, 1, 11, 8) {
		}));
		this.customSlots.put(2, this.addSlot(new SlotItemHandler(internal, 2, 29, 8) {
		}));
		this.customSlots.put(3, this.addSlot(new SlotItemHandler(internal, 3, 47, 8) {
		}));
		this.customSlots.put(4, this.addSlot(new SlotItemHandler(internal, 4, 65, 8) {
		}));
		this.customSlots.put(5, this.addSlot(new SlotItemHandler(internal, 5, 83, 8) {
		}));
		this.customSlots.put(6, this.addSlot(new SlotItemHandler(internal, 6, 101, 8) {
		}));
		this.customSlots.put(7, this.addSlot(new SlotItemHandler(internal, 7, 119, 8) {
		}));
		this.customSlots.put(8, this.addSlot(new SlotItemHandler(internal, 8, 137, 8) {
		}));
		this.customSlots.put(9, this.addSlot(new SlotItemHandler(internal, 9, 155, 8) {
		}));
		this.customSlots.put(10, this.addSlot(new SlotItemHandler(internal, 10, 173, 8) {
		}));
		this.customSlots.put(11, this.addSlot(new SlotItemHandler(internal, 11, 191, 8) {
		}));
		this.customSlots.put(12, this.addSlot(new SlotItemHandler(internal, 12, 209, 8) {
		}));
		this.customSlots.put(13, this.addSlot(new SlotItemHandler(internal, 13, 227, 8) {
		}));
		this.customSlots.put(14, this.addSlot(new SlotItemHandler(internal, 14, 245, 8) {
		}));
		this.customSlots.put(15, this.addSlot(new SlotItemHandler(internal, 15, 263, 8) {
		}));
		this.customSlots.put(16, this.addSlot(new SlotItemHandler(internal, 16, 281, 8) {
		}));
		this.customSlots.put(17, this.addSlot(new SlotItemHandler(internal, 17, 299, 8) {
		}));
		this.customSlots.put(18, this.addSlot(new SlotItemHandler(internal, 18, 317, 8) {
		}));
		this.customSlots.put(19, this.addSlot(new SlotItemHandler(internal, 19, 335, 8) {
		}));
		this.customSlots.put(20, this.addSlot(new SlotItemHandler(internal, 20, 353, 8) {
		}));
		this.customSlots.put(21, this.addSlot(new SlotItemHandler(internal, 21, 371, 8) {
		}));
		this.customSlots.put(22, this.addSlot(new SlotItemHandler(internal, 22, 11, 26) {
		}));
		this.customSlots.put(23, this.addSlot(new SlotItemHandler(internal, 23, 29, 26) {
		}));
		this.customSlots.put(24, this.addSlot(new SlotItemHandler(internal, 24, 47, 26) {
		}));
		this.customSlots.put(25, this.addSlot(new SlotItemHandler(internal, 25, 65, 26) {
		}));
		this.customSlots.put(26, this.addSlot(new SlotItemHandler(internal, 26, 83, 26) {
		}));
		this.customSlots.put(27, this.addSlot(new SlotItemHandler(internal, 27, 101, 26) {
		}));
		this.customSlots.put(28, this.addSlot(new SlotItemHandler(internal, 28, 119, 26) {
		}));
		this.customSlots.put(29, this.addSlot(new SlotItemHandler(internal, 29, 137, 26) {
		}));
		this.customSlots.put(30, this.addSlot(new SlotItemHandler(internal, 30, 155, 26) {
		}));
		this.customSlots.put(31, this.addSlot(new SlotItemHandler(internal, 31, 173, 26) {
		}));
		this.customSlots.put(32, this.addSlot(new SlotItemHandler(internal, 32, 191, 26) {
		}));
		this.customSlots.put(33, this.addSlot(new SlotItemHandler(internal, 33, 209, 26) {
		}));
		this.customSlots.put(34, this.addSlot(new SlotItemHandler(internal, 34, 227, 26) {
		}));
		this.customSlots.put(35, this.addSlot(new SlotItemHandler(internal, 35, 245, 26) {
		}));
		this.customSlots.put(36, this.addSlot(new SlotItemHandler(internal, 36, 263, 26) {
		}));
		this.customSlots.put(37, this.addSlot(new SlotItemHandler(internal, 37, 281, 26) {
		}));
		this.customSlots.put(38, this.addSlot(new SlotItemHandler(internal, 38, 299, 26) {
		}));
		this.customSlots.put(39, this.addSlot(new SlotItemHandler(internal, 39, 317, 26) {
		}));
		this.customSlots.put(40, this.addSlot(new SlotItemHandler(internal, 40, 335, 26) {
		}));
		this.customSlots.put(41, this.addSlot(new SlotItemHandler(internal, 41, 353, 26) {
		}));
		this.customSlots.put(42, this.addSlot(new SlotItemHandler(internal, 42, 371, 26) {
		}));
		this.customSlots.put(43, this.addSlot(new SlotItemHandler(internal, 43, 11, 44) {
		}));
		this.customSlots.put(44, this.addSlot(new SlotItemHandler(internal, 44, 29, 44) {
		}));
		this.customSlots.put(45, this.addSlot(new SlotItemHandler(internal, 45, 47, 44) {
		}));
		this.customSlots.put(46, this.addSlot(new SlotItemHandler(internal, 46, 65, 44) {
		}));
		this.customSlots.put(47, this.addSlot(new SlotItemHandler(internal, 47, 83, 44) {
		}));
		this.customSlots.put(48, this.addSlot(new SlotItemHandler(internal, 48, 101, 44) {
		}));
		this.customSlots.put(49, this.addSlot(new SlotItemHandler(internal, 49, 119, 44) {
		}));
		this.customSlots.put(50, this.addSlot(new SlotItemHandler(internal, 50, 137, 44) {
		}));
		this.customSlots.put(51, this.addSlot(new SlotItemHandler(internal, 51, 155, 44) {
		}));
		this.customSlots.put(52, this.addSlot(new SlotItemHandler(internal, 52, 173, 44) {
		}));
		this.customSlots.put(53, this.addSlot(new SlotItemHandler(internal, 53, 191, 44) {
		}));
		this.customSlots.put(54, this.addSlot(new SlotItemHandler(internal, 54, 209, 44) {
		}));
		this.customSlots.put(55, this.addSlot(new SlotItemHandler(internal, 55, 227, 44) {
		}));
		this.customSlots.put(56, this.addSlot(new SlotItemHandler(internal, 56, 245, 44) {
		}));
		this.customSlots.put(57, this.addSlot(new SlotItemHandler(internal, 57, 263, 44) {
		}));
		this.customSlots.put(58, this.addSlot(new SlotItemHandler(internal, 58, 281, 44) {
		}));
		this.customSlots.put(59, this.addSlot(new SlotItemHandler(internal, 59, 299, 44) {
		}));
		this.customSlots.put(60, this.addSlot(new SlotItemHandler(internal, 60, 317, 44) {
		}));
		this.customSlots.put(61, this.addSlot(new SlotItemHandler(internal, 61, 335, 44) {
		}));
		this.customSlots.put(62, this.addSlot(new SlotItemHandler(internal, 62, 353, 44) {
		}));
		this.customSlots.put(63, this.addSlot(new SlotItemHandler(internal, 63, 371, 44) {
		}));
		this.customSlots.put(64, this.addSlot(new SlotItemHandler(internal, 64, 11, 62) {
		}));
		this.customSlots.put(65, this.addSlot(new SlotItemHandler(internal, 65, 29, 62) {
		}));
		this.customSlots.put(66, this.addSlot(new SlotItemHandler(internal, 66, 47, 62) {
		}));
		this.customSlots.put(67, this.addSlot(new SlotItemHandler(internal, 67, 65, 62) {
		}));
		this.customSlots.put(68, this.addSlot(new SlotItemHandler(internal, 68, 83, 62) {
		}));
		this.customSlots.put(69, this.addSlot(new SlotItemHandler(internal, 69, 101, 62) {
		}));
		this.customSlots.put(70, this.addSlot(new SlotItemHandler(internal, 70, 119, 62) {
		}));
		this.customSlots.put(71, this.addSlot(new SlotItemHandler(internal, 71, 137, 62) {
		}));
		this.customSlots.put(72, this.addSlot(new SlotItemHandler(internal, 72, 155, 62) {
		}));
		this.customSlots.put(73, this.addSlot(new SlotItemHandler(internal, 73, 173, 62) {
		}));
		this.customSlots.put(74, this.addSlot(new SlotItemHandler(internal, 74, 191, 62) {
		}));
		this.customSlots.put(75, this.addSlot(new SlotItemHandler(internal, 75, 209, 62) {
		}));
		this.customSlots.put(76, this.addSlot(new SlotItemHandler(internal, 76, 227, 62) {
		}));
		this.customSlots.put(77, this.addSlot(new SlotItemHandler(internal, 77, 245, 62) {
		}));
		this.customSlots.put(78, this.addSlot(new SlotItemHandler(internal, 78, 263, 62) {
		}));
		this.customSlots.put(79, this.addSlot(new SlotItemHandler(internal, 79, 281, 62) {
		}));
		this.customSlots.put(80, this.addSlot(new SlotItemHandler(internal, 80, 299, 62) {
		}));
		this.customSlots.put(81, this.addSlot(new SlotItemHandler(internal, 81, 317, 62) {
		}));
		this.customSlots.put(82, this.addSlot(new SlotItemHandler(internal, 82, 335, 62) {
		}));
		this.customSlots.put(83, this.addSlot(new SlotItemHandler(internal, 83, 353, 62) {
		}));
		this.customSlots.put(84, this.addSlot(new SlotItemHandler(internal, 84, 371, 62) {
		}));
		this.customSlots.put(85, this.addSlot(new SlotItemHandler(internal, 85, 11, 80) {
		}));
		this.customSlots.put(86, this.addSlot(new SlotItemHandler(internal, 86, 29, 80) {
		}));
		this.customSlots.put(87, this.addSlot(new SlotItemHandler(internal, 87, 47, 80) {
		}));
		this.customSlots.put(88, this.addSlot(new SlotItemHandler(internal, 88, 65, 80) {
		}));
		this.customSlots.put(89, this.addSlot(new SlotItemHandler(internal, 89, 83, 80) {
		}));
		this.customSlots.put(90, this.addSlot(new SlotItemHandler(internal, 90, 101, 80) {
		}));
		this.customSlots.put(91, this.addSlot(new SlotItemHandler(internal, 91, 119, 80) {
		}));
		this.customSlots.put(92, this.addSlot(new SlotItemHandler(internal, 92, 137, 80) {
		}));
		this.customSlots.put(93, this.addSlot(new SlotItemHandler(internal, 93, 155, 80) {
		}));
		this.customSlots.put(94, this.addSlot(new SlotItemHandler(internal, 94, 173, 80) {
		}));
		this.customSlots.put(95, this.addSlot(new SlotItemHandler(internal, 95, 191, 80) {
		}));
		this.customSlots.put(96, this.addSlot(new SlotItemHandler(internal, 96, 209, 80) {
		}));
		this.customSlots.put(97, this.addSlot(new SlotItemHandler(internal, 97, 227, 80) {
		}));
		this.customSlots.put(98, this.addSlot(new SlotItemHandler(internal, 98, 245, 80) {
		}));
		this.customSlots.put(99, this.addSlot(new SlotItemHandler(internal, 99, 263, 80) {
		}));
		this.customSlots.put(100, this.addSlot(new SlotItemHandler(internal, 100, 281, 80) {
		}));
		this.customSlots.put(101, this.addSlot(new SlotItemHandler(internal, 101, 299, 80) {
		}));
		this.customSlots.put(102, this.addSlot(new SlotItemHandler(internal, 102, 317, 80) {
		}));
		this.customSlots.put(103, this.addSlot(new SlotItemHandler(internal, 103, 335, 80) {
		}));
		this.customSlots.put(104, this.addSlot(new SlotItemHandler(internal, 104, 353, 80) {
		}));
		this.customSlots.put(105, this.addSlot(new SlotItemHandler(internal, 105, 371, 80) {
		}));
		this.customSlots.put(106, this.addSlot(new SlotItemHandler(internal, 106, 11, 98) {
		}));
		this.customSlots.put(107, this.addSlot(new SlotItemHandler(internal, 107, 29, 98) {
		}));
		this.customSlots.put(108, this.addSlot(new SlotItemHandler(internal, 108, 47, 98) {
		}));
		this.customSlots.put(109, this.addSlot(new SlotItemHandler(internal, 109, 65, 98) {
		}));
		this.customSlots.put(110, this.addSlot(new SlotItemHandler(internal, 110, 83, 98) {
		}));
		this.customSlots.put(111, this.addSlot(new SlotItemHandler(internal, 111, 101, 98) {
		}));
		this.customSlots.put(112, this.addSlot(new SlotItemHandler(internal, 112, 119, 98) {
		}));
		this.customSlots.put(113, this.addSlot(new SlotItemHandler(internal, 113, 137, 98) {
		}));
		this.customSlots.put(114, this.addSlot(new SlotItemHandler(internal, 114, 155, 98) {
		}));
		this.customSlots.put(115, this.addSlot(new SlotItemHandler(internal, 115, 173, 98) {
		}));
		this.customSlots.put(116, this.addSlot(new SlotItemHandler(internal, 116, 191, 98) {
		}));
		this.customSlots.put(117, this.addSlot(new SlotItemHandler(internal, 117, 209, 98) {
		}));
		this.customSlots.put(118, this.addSlot(new SlotItemHandler(internal, 118, 227, 98) {
		}));
		this.customSlots.put(119, this.addSlot(new SlotItemHandler(internal, 119, 245, 98) {
		}));
		this.customSlots.put(120, this.addSlot(new SlotItemHandler(internal, 120, 263, 98) {
		}));
		this.customSlots.put(121, this.addSlot(new SlotItemHandler(internal, 121, 281, 98) {
		}));
		this.customSlots.put(122, this.addSlot(new SlotItemHandler(internal, 122, 299, 98) {
		}));
		this.customSlots.put(123, this.addSlot(new SlotItemHandler(internal, 123, 317, 98) {
		}));
		this.customSlots.put(124, this.addSlot(new SlotItemHandler(internal, 124, 335, 98) {
		}));
		this.customSlots.put(125, this.addSlot(new SlotItemHandler(internal, 125, 353, 98) {
		}));
		this.customSlots.put(126, this.addSlot(new SlotItemHandler(internal, 126, 371, 98) {
		}));
		this.customSlots.put(127, this.addSlot(new SlotItemHandler(internal, 127, 191, 116) {
		}));
		this.customSlots.put(128, this.addSlot(new SlotItemHandler(internal, 128, 209, 116) {
		}));
		this.customSlots.put(129, this.addSlot(new SlotItemHandler(internal, 129, 227, 116) {
		}));
		this.customSlots.put(130, this.addSlot(new SlotItemHandler(internal, 130, 245, 116) {
		}));
		this.customSlots.put(131, this.addSlot(new SlotItemHandler(internal, 131, 263, 116) {
		}));
		this.customSlots.put(132, this.addSlot(new SlotItemHandler(internal, 132, 281, 116) {
		}));
		this.customSlots.put(133, this.addSlot(new SlotItemHandler(internal, 133, 299, 116) {
		}));
		this.customSlots.put(134, this.addSlot(new SlotItemHandler(internal, 134, 317, 116) {
		}));
		this.customSlots.put(135, this.addSlot(new SlotItemHandler(internal, 135, 335, 116) {
		}));
		this.customSlots.put(136, this.addSlot(new SlotItemHandler(internal, 136, 353, 116) {
		}));
		this.customSlots.put(137, this.addSlot(new SlotItemHandler(internal, 137, 371, 116) {
		}));
		this.customSlots.put(138, this.addSlot(new SlotItemHandler(internal, 138, 191, 134) {
		}));
		this.customSlots.put(139, this.addSlot(new SlotItemHandler(internal, 139, 209, 134) {
		}));
		this.customSlots.put(140, this.addSlot(new SlotItemHandler(internal, 140, 227, 134) {
		}));
		this.customSlots.put(141, this.addSlot(new SlotItemHandler(internal, 141, 245, 134) {
		}));
		this.customSlots.put(142, this.addSlot(new SlotItemHandler(internal, 142, 263, 134) {
		}));
		this.customSlots.put(143, this.addSlot(new SlotItemHandler(internal, 143, 281, 134) {
		}));
		this.customSlots.put(144, this.addSlot(new SlotItemHandler(internal, 144, 299, 134) {
		}));
		this.customSlots.put(145, this.addSlot(new SlotItemHandler(internal, 145, 317, 134) {
		}));
		this.customSlots.put(146, this.addSlot(new SlotItemHandler(internal, 146, 335, 134) {
		}));
		this.customSlots.put(147, this.addSlot(new SlotItemHandler(internal, 147, 353, 134) {
		}));
		this.customSlots.put(148, this.addSlot(new SlotItemHandler(internal, 148, 371, 134) {
		}));
		this.customSlots.put(149, this.addSlot(new SlotItemHandler(internal, 149, 191, 152) {
		}));
		this.customSlots.put(150, this.addSlot(new SlotItemHandler(internal, 150, 209, 152) {
		}));
		this.customSlots.put(151, this.addSlot(new SlotItemHandler(internal, 151, 227, 152) {
		}));
		this.customSlots.put(152, this.addSlot(new SlotItemHandler(internal, 152, 245, 152) {
		}));
		this.customSlots.put(153, this.addSlot(new SlotItemHandler(internal, 153, 263, 152) {
		}));
		this.customSlots.put(154, this.addSlot(new SlotItemHandler(internal, 154, 281, 152) {
		}));
		this.customSlots.put(155, this.addSlot(new SlotItemHandler(internal, 155, 299, 152) {
		}));
		this.customSlots.put(156, this.addSlot(new SlotItemHandler(internal, 156, 317, 152) {
		}));
		this.customSlots.put(157, this.addSlot(new SlotItemHandler(internal, 157, 335, 152) {
		}));
		this.customSlots.put(158, this.addSlot(new SlotItemHandler(internal, 158, 353, 152) {
		}));
		this.customSlots.put(159, this.addSlot(new SlotItemHandler(internal, 159, 371, 152) {
		}));
		this.customSlots.put(160, this.addSlot(new SlotItemHandler(internal, 160, 191, 170) {
		}));
		this.customSlots.put(161, this.addSlot(new SlotItemHandler(internal, 161, 209, 170) {
		}));
		this.customSlots.put(162, this.addSlot(new SlotItemHandler(internal, 162, 227, 170) {
		}));
		this.customSlots.put(163, this.addSlot(new SlotItemHandler(internal, 163, 245, 170) {
		}));
		this.customSlots.put(164, this.addSlot(new SlotItemHandler(internal, 164, 263, 170) {
		}));
		this.customSlots.put(165, this.addSlot(new SlotItemHandler(internal, 165, 281, 170) {
		}));
		this.customSlots.put(166, this.addSlot(new SlotItemHandler(internal, 166, 299, 170) {
		}));
		this.customSlots.put(167, this.addSlot(new SlotItemHandler(internal, 167, 317, 170) {
		}));
		this.customSlots.put(168, this.addSlot(new SlotItemHandler(internal, 168, 335, 170) {
		}));
		this.customSlots.put(169, this.addSlot(new SlotItemHandler(internal, 169, 353, 170) {
		}));
		this.customSlots.put(170, this.addSlot(new SlotItemHandler(internal, 170, 371, 170) {
		}));
		this.customSlots.put(171, this.addSlot(new SlotItemHandler(internal, 171, 191, 188) {
		}));
		this.customSlots.put(172, this.addSlot(new SlotItemHandler(internal, 172, 209, 188) {
		}));
		this.customSlots.put(173, this.addSlot(new SlotItemHandler(internal, 173, 227, 188) {
		}));
		this.customSlots.put(174, this.addSlot(new SlotItemHandler(internal, 174, 245, 188) {
		}));
		this.customSlots.put(175, this.addSlot(new SlotItemHandler(internal, 175, 263, 188) {
		}));
		this.customSlots.put(176, this.addSlot(new SlotItemHandler(internal, 176, 281, 188) {
		}));
		this.customSlots.put(177, this.addSlot(new SlotItemHandler(internal, 177, 299, 188) {
		}));
		this.customSlots.put(178, this.addSlot(new SlotItemHandler(internal, 178, 317, 188) {
		}));
		this.customSlots.put(179, this.addSlot(new SlotItemHandler(internal, 179, 335, 188) {
		}));
		this.customSlots.put(180, this.addSlot(new SlotItemHandler(internal, 180, 353, 188) {
		}));
		for (int si = 0; si < 3; ++si)
			for (int sj = 0; sj < 9; ++sj)
				this.addSlot(new Slot(inv, sj + (si + 1) * 9, 2 + 8 + sj * 18, 52 + 84 + si * 18));
		for (int si = 0; si < 9; ++si)
			this.addSlot(new Slot(inv, si, 2 + 8 + si * 18, 52 + 142));
	}

	@Override
	public boolean stillValid(Player player) {
		return true;
	}

	@Override
	public ItemStack quickMoveStack(Player playerIn, int index) {
		ItemStack itemstack = ItemStack.EMPTY;
		Slot slot = (Slot) this.slots.get(index);
		if (slot != null && slot.hasItem()) {
			ItemStack itemstack1 = slot.getItem();
			itemstack = itemstack1.copy();
			if (index < 180) {
				if (!this.moveItemStackTo(itemstack1, 180, this.slots.size(), true)) {
					return ItemStack.EMPTY;
				}
				slot.onQuickCraft(itemstack1, itemstack);
			} else if (!this.moveItemStackTo(itemstack1, 0, 180, false)) {
				if (index < 180 + 27) {
					if (!this.moveItemStackTo(itemstack1, 180 + 27, this.slots.size(), true)) {
						return ItemStack.EMPTY;
					}
				} else {
					if (!this.moveItemStackTo(itemstack1, 180, 180 + 27, false)) {
						return ItemStack.EMPTY;
					}
				}
				return ItemStack.EMPTY;
			}
			if (itemstack1.getCount() == 0) {
				slot.set(ItemStack.EMPTY);
			} else {
				slot.setChanged();
			}
			if (itemstack1.getCount() == itemstack.getCount()) {
				return ItemStack.EMPTY;
			}
			slot.onTake(playerIn, itemstack1);
		}
		return itemstack;
	}

	@Override
	protected boolean moveItemStackTo(ItemStack p_38904_, int p_38905_, int p_38906_, boolean p_38907_) {
		boolean flag = false;
		int i = p_38905_;
		if (p_38907_) {
			i = p_38906_ - 1;
		}
		if (p_38904_.isStackable()) {
			while (!p_38904_.isEmpty()) {
				if (p_38907_) {
					if (i < p_38905_) {
						break;
					}
				} else if (i >= p_38906_) {
					break;
				}
				Slot slot = this.slots.get(i);
				ItemStack itemstack = slot.getItem();
				if (slot.mayPlace(itemstack) && !itemstack.isEmpty() && ItemStack.isSameItemSameTags(p_38904_, itemstack)) {
					int j = itemstack.getCount() + p_38904_.getCount();
					int maxSize = Math.min(slot.getMaxStackSize(), p_38904_.getMaxStackSize());
					if (j <= maxSize) {
						p_38904_.setCount(0);
						itemstack.setCount(j);
						slot.set(itemstack);
						flag = true;
					} else if (itemstack.getCount() < maxSize) {
						p_38904_.shrink(maxSize - itemstack.getCount());
						itemstack.setCount(maxSize);
						slot.set(itemstack);
						flag = true;
					}
				}
				if (p_38907_) {
					--i;
				} else {
					++i;
				}
			}
		}
		if (!p_38904_.isEmpty()) {
			if (p_38907_) {
				i = p_38906_ - 1;
			} else {
				i = p_38905_;
			}
			while (true) {
				if (p_38907_) {
					if (i < p_38905_) {
						break;
					}
				} else if (i >= p_38906_) {
					break;
				}
				Slot slot1 = this.slots.get(i);
				ItemStack itemstack1 = slot1.getItem();
				if (itemstack1.isEmpty() && slot1.mayPlace(p_38904_)) {
					if (p_38904_.getCount() > slot1.getMaxStackSize()) {
						slot1.set(p_38904_.split(slot1.getMaxStackSize()));
					} else {
						slot1.set(p_38904_.split(p_38904_.getCount()));
					}
					slot1.setChanged();
					flag = true;
					break;
				}
				if (p_38907_) {
					--i;
				} else {
					++i;
				}
			}
		}
		return flag;
	}

	@Override
	public void removed(Player playerIn) {
		super.removed(playerIn);
		if (!bound && playerIn instanceof ServerPlayer serverPlayer) {
			if (!serverPlayer.isAlive() || serverPlayer.hasDisconnected()) {
				for (int j = 0; j < internal.getSlots(); ++j) {
					playerIn.drop(internal.extractItem(j, internal.getStackInSlot(j).getCount(), false), false);
				}
			} else {
				for (int i = 0; i < internal.getSlots(); ++i) {
					playerIn.getInventory().placeItemBackInInventory(internal.extractItem(i, internal.getStackInSlot(i).getCount(), false));
				}
			}
		}
	}

	public Map<Integer, Slot> get() {
		return customSlots;
	}

	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		Player entity = event.player;
		if (event.phase == TickEvent.Phase.END && entity.containerMenu instanceof PinkCeatGUIMenu) {
			Level world = entity.level;
			double x = entity.getX();
			double y = entity.getY();
			double z = entity.getZ();

			PinkCeatGUIDangZheGeJieMianDaKaiQiJianMeiKeFaShengProcedure.execute(entity);
		}
	}
}

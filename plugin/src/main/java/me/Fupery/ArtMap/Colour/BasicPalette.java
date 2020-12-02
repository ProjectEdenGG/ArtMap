package me.Fupery.ArtMap.Colour;

import me.Fupery.ArtMap.Config.Lang;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.awt.*;
import java.util.Arrays;

import static me.Fupery.ArtMap.Config.Lang.*;

public class BasicPalette implements Palette {
	public final ArtDye

			VOID = new BasicDye(DYE_VOID.get(), "VOID", 0, ChatColor.DARK_GREEN, Material.ENDER_EYE),
			GRASS = new BasicDye(DYE_GRASS.get(), "GRASS", 1, ChatColor.of(new Color(127, 178, 56)), Material.GRASS),
			CREAM = new BasicDye(DYE_CREAM.get(), "CREAM", 2, ChatColor.of(new Color(247, 233, 163)), Material.PUMPKIN_SEEDS),
			LIGHT_GRAY = new BasicDye(Lang.DYE_LIGHT_GRAY.get(), "LIGHT_GRAY", 3, ChatColor.of(new Color(199, 199, 199)), Material.COBWEB),
			RED = new BasicDye(DYE_RED.get(), "RED", 4, ChatColor.of(new Color(255, 0, 0)), Material.RED_DYE),
			ICE = new BasicDye(Lang.DYE_ICE.get(), "ICE", 5, ChatColor.of(new Color(160, 160, 255)), Material.ICE),
			SILVER = new BasicDye(DYE_SILVER.get(), "SILVER", 6, ChatColor.of(new Color(167, 167, 167)), Material.LIGHT_GRAY_DYE),
			LEAVES = new BasicDye(Lang.DYE_LEAVES.get(), "LEAVES", 7, ChatColor.of(new Color(0, 124, 0)), Material.OAK_LEAVES),
			SNOW = new BasicDye(Lang.DYE_SNOW.get(), "SNOW", 8, ChatColor.of(new Color(255, 255, 255)), Material.SNOW),
			GRAY = new BasicDye(DYE_GRAY.get(), "GRAY", 9, ChatColor.of(new Color(164, 168, 184)), Material.GRAY_DYE),
			COFFEE = new BasicDye(DYE_COFFEE.get(), "COFFEE", 10, ChatColor.of(new Color(151, 109, 77)), Material.MELON_SEEDS),
			STONE = new BasicDye(Lang.DYE_STONE.get(), "STONE", 11, ChatColor.of(new Color(112, 112, 112)), Material.GHAST_TEAR),
			WATER = new BasicDye(Lang.DYE_WATER.get(), "WATER", 12, ChatColor.of(new Color(64, 64, 255)), Material.LAPIS_BLOCK),
			DARK_WOOD = new BasicDye(Lang.DYE_DARK_WOOD.get(), "DARK_WOOD", 13, ChatColor.of(new Color(143, 119, 72)), Material.DARK_OAK_LOG),
			WHITE = new BasicDye(DYE_WHITE.get(), "WHITE", 14, ChatColor.of(new Color(255, 252, 245)), Material.WHITE_DYE),
			ORANGE = new BasicDye(DYE_ORANGE.get(), "ORANGE", 15, ChatColor.of(new Color(216, 127, 51)), Material.ORANGE_DYE),
			MAGENTA = new BasicDye(DYE_MAGENTA.get(), "MAGENTA", 16, ChatColor.of(new Color(178, 76, 216)), Material.MAGENTA_DYE),
			LIGHT_BLUE = new BasicDye(DYE_LIGHT_BLUE.get(), "LIGHT_BLUE", 17, ChatColor.of(new Color(102, 153, 216)), Material.LIGHT_BLUE_DYE),
			YELLOW = new BasicDye(DYE_YELLOW.get(), "YELLOW", 18, ChatColor.of(new Color(229, 229, 51)), Material.YELLOW_DYE),
			LIME = new BasicDye(DYE_LIME.get(), "LIME", 19, ChatColor.of(new Color(127, 204, 25)), Material.LIME_DYE),
			PINK = new BasicDye(DYE_PINK.get(), "PINK", 20, ChatColor.of(new Color(242, 127, 165)), Material.PINK_DYE),
			GRAPHITE = new BasicDye(DYE_GRAPHITE.get(), "GRAPHITE", 21, ChatColor.of(new Color(76, 76, 76)), Material.FLINT),
			GUNPOWDER = new BasicDye(DYE_GUNPOWDER.get(), "GUNPOWDER", 22, ChatColor.of(new Color(153, 153, 153)), Material.GUNPOWDER),
			CYAN = new BasicDye(DYE_CYAN.get(), "CYAN", 23, ChatColor.of(new Color(76, 127, 153)), Material.CYAN_DYE),
			PURPLE = new BasicDye(DYE_PURPLE.get(), "PURPLE", 24, ChatColor.of(new Color(127, 63, 178)), Material.PURPLE_DYE),
			BLUE = new BasicDye(DYE_BLUE.get(), "BLUE", 25, ChatColor.of(new Color(51, 76, 178)), Material.BLUE_DYE),
			BROWN = new BasicDye(DYE_BROWN.get(), "BROWN", 26, ChatColor.of(new Color(102, 76, 51)), Material.BROWN_DYE),
			GREEN = new BasicDye(DYE_GREEN.get(), "GREEN", 27, ChatColor.of(new Color(102, 127, 51)), Material.GREEN_DYE),
			BRICK = new BasicDye(Lang.DYE_BRICK.get(), "BRICK", 28, ChatColor.of(new Color(153, 51, 51)), Material.BRICK),
			BLACK = new BasicDye(DYE_BLACK.get(), "BLACK", 29, ChatColor.of(new Color(45, 45, 45)), Material.BLACK_DYE),
			GOLD = new BasicDye(DYE_GOLD.get(), "GOLD", 30, ChatColor.of(new Color(250, 238, 77)), Material.GOLD_NUGGET),
			AQUA = new BasicDye(DYE_AQUA.get(), "AQUA", 31, ChatColor.of(new Color(92, 219, 213)), Material.PRISMARINE_CRYSTALS),
			LAPIS = new BasicDye(Lang.DYE_LAPIS.get(), "LAPIS", 32, ChatColor.of(new Color(74, 128, 255)), Material.LAPIS_ORE),
			EMERALD = new BasicDye(Lang.DYE_EMERALD.get(), "EMERALD", 33, ChatColor.of(new Color(0, 217, 58)), Material.EMERALD),
			LIGHT_WOOD = new BasicDye(Lang.DYE_LIGHT_WOOD.get(), "LIGHT_WOOD", 34, ChatColor.of(new Color(129, 86, 49)), Material.BIRCH_WOOD),
			MAROON = new BasicDye(DYE_MAROON.get(), "MAROON", 35, ChatColor.of(new Color(112, 2, 0)), Material.NETHER_WART),
			WHITE_TERRACOTTA = new BasicDye(Lang.DYE_WHITE_TERRACOTTA.get(), "WHITE_TERRACOTTA", 36, ChatColor.of(new Color(209, 177, 161)), Material.EGG),
			ORANGE_TERRACOTTA = new BasicDye(Lang.DYE_ORANGE_TERRACOTTA.get(), "ORANGE_TERRACOTTA", 37, ChatColor.of(new Color(159, 82, 36)), Material.MAGMA_CREAM),
			MAGENTA_TERRACOTTA = new BasicDye(Lang.DYE_MAGENTA_TERRACOTTA.get(), "MAGENTA_TERRACOTTA", 38, ChatColor.of(new Color(149, 87, 108)), Material.BEETROOT),
			LIGHT_BLUE_TERRACOTTA = new BasicDye(Lang.DYE_LIGHT_BLUE_TERRACOTTA.get(), "LIGHT_BLUE_TERRACOTTA", 39, ChatColor.of(new Color(112, 108, 138)), Material.MYCELIUM),
			YELLOW_TERRACOTTA = new BasicDye(Lang.DYE_YELLOW_TERRACOTTA.get(), "YELLOW_TERRACOTTA", 40, ChatColor.of(new Color(186, 133, 36)), Material.GLOWSTONE_DUST),
			LIME_TERRACOTTA = new BasicDye(Lang.DYE_LIME_TERRACOTTA.get(), "LIME_TERRACOTTA", 41, ChatColor.of(new Color(103, 117, 53)), Material.SLIME_BALL),
			PINK_TERRACOTTA = new BasicDye(Lang.DYE_PINK_TERRACOTTA.get(), "PINK_TERRACOTTA", 42, ChatColor.of(new Color(160, 77, 78)), Material.SPIDER_EYE),
			GRAY_TERRACOTTA = new BasicDye(Lang.DYE_GRAY_TERRACOTTA.get(), "GRAY_TERRACOTTA", 43, ChatColor.of(new Color(57, 41, 35)), Material.SOUL_SAND),
			LIGHT_GRAY_TERRACOTTA = new BasicDye(Lang.DYE_LIGHT_GRAY_TERRACOTTA.get(), "LIGHT_GRAY_TERRACOTTA", 44, ChatColor.of(new Color(135, 107, 98)), Material.BROWN_MUSHROOM),
			CYAN_TERRACOTTA = new BasicDye(Lang.DYE_CYAN_TERRACOTTA.get(), "CYAN_TERRACOTTA", 45, ChatColor.of(new Color(87, 92, 92)), Material.IRON_NUGGET),
			PURPLE_TERRACOTTA = new BasicDye(Lang.DYE_PURPLE_TERRACOTTA.get(), "PURPLE_TERRACOTTA", 46, ChatColor.of(new Color(122, 73, 88)), Material.CHORUS_FRUIT),
			BLUE_TERRACOTTA = new BasicDye(Lang.DYE_BLUE_TERRACOTTA.get(), "BLUE_TERRACOTTA", 47, ChatColor.of(new Color(76, 62, 92)), Material.PURPUR_BLOCK),
			BROWN_TERRACOTTA = new BasicDye(Lang.DYE_BROWN_TERRACOTTA.get(), "BROWN_TERRACOTTA", 48, ChatColor.of(new Color(76, 50, 35)), Material.PODZOL),
			GREEN_TERRACOTTA = new BasicDye(Lang.DYE_GREEN_TERRACOTTA.get(), "GREEN_TERRACOTTA", 49, ChatColor.of(new Color(76, 82, 42)), Material.POISONOUS_POTATO),
			RED_TERRACOTTA = new BasicDye(Lang.DYE_RED_TERRACOTTA.get(), "RED_TERRACOTTA", 50, ChatColor.of(new Color(142, 60, 46)), Material.APPLE),
			BLACK_TERRACOTTA = new BasicDye(Lang.DYE_BLACK_TERRACOTTA.get(), "BLACK_TERRACOTTA", 51, ChatColor.of(new Color(37, 22, 16)), Material.CHARCOAL),
			CRIMSON_NYLIUM = new BasicDye(Lang.DYE_CRIMSON_NYLIUM.get(), "CRIMSON_NYLIUM", 52, ChatColor.of(new Color(189, 48, 49)), Material.CRIMSON_NYLIUM),
			CRIMSON_STEM = new BasicDye(Lang.DYE_CRIMSON_STEM.get(), "CRIMSON_STEM", 53, ChatColor.of(new Color(148, 63, 97)), Material.CRIMSON_STEM),
			CRIMSON_HYPHAE = new BasicDye(Lang.DYE_CRIMSON_HYPHAE.get(), "CRIMSON_HYPHAE", 54, ChatColor.of(new Color(92, 25, 29)), Material.CRIMSON_HYPHAE),
			WARPED_NYLIUM = new BasicDye(Lang.DYE_WARPED_NYLIUM.get(), "WARPED_NYLIUM", 55, ChatColor.of(new Color(22, 126, 134)), Material.WARPED_NYLIUM),
			WARPED_STEM = new BasicDye(Lang.DYE_WARPED_STEM.get(), "WARPED_STEM", 56, ChatColor.of(new Color(58, 142, 140)), Material.WARPED_STEM),
			WARPED_HYPHAE = new BasicDye(Lang.DYE_WARPED_HYPHAE.get(), "WARPED_HYPHAE", 57, ChatColor.of(new Color(86, 44, 62)), Material.WARPED_HYPHAE),
			WARPED_WART_BLOCK = new BasicDye(Lang.DYE_WARPED_WART_BLOCK.get(), "WARPED_WART_BLOCK", 58, ChatColor.of(new Color(20, 180, 133)), Material.WARPED_WART_BLOCK),

	// Shading Dyes
	COAL = new ShadingDye(DYE_COAL.get(), "COAL", true, ChatColor.DARK_GRAY, Material.COAL),
			FEATHER = new ShadingDye(DYE_FEATHER.get(), "FEATHER", false, ChatColor.WHITE, Material.FEATHER);

	private final ArtDye[] dyes = new ArtDye[]{
			BLACK, RED, GREEN, BROWN, BLUE, PURPLE, CYAN, SILVER, GRAY, PINK, LIME, YELLOW, LIGHT_BLUE,
			MAGENTA, ORANGE, WHITE, CREAM, COFFEE, GRAPHITE, GUNPOWDER, MAROON, AQUA, GRASS, GOLD, VOID,
			LIGHT_GRAY, ICE, LEAVES, SNOW, STONE, WATER, DARK_WOOD, BRICK, LAPIS, EMERALD, LIGHT_WOOD,
			WHITE_TERRACOTTA, ORANGE_TERRACOTTA, MAGENTA_TERRACOTTA, LIGHT_BLUE_TERRACOTTA, YELLOW_TERRACOTTA,
			LIME_TERRACOTTA, PINK_TERRACOTTA, GRAY_TERRACOTTA, LIGHT_GRAY_TERRACOTTA, CYAN_TERRACOTTA,
			PURPLE_TERRACOTTA, BLUE_TERRACOTTA, BROWN_TERRACOTTA, GREEN_TERRACOTTA, RED_TERRACOTTA, BLACK_TERRACOTTA,
			CRIMSON_NYLIUM, CRIMSON_STEM, CRIMSON_HYPHAE, WARPED_NYLIUM, WARPED_STEM, WARPED_HYPHAE, WARPED_WART_BLOCK
	};

	private final ArtDye[] tools = new ArtDye[]{COAL, FEATHER};

	@Override
	public ArtDye getDye(ItemStack item) {
		for (ArtDye[] dyeList : new ArtDye[][]{dyes, tools}) {
			for (ArtDye dye : dyeList) {
				if (item.getType() == dye.getMaterial()) {
					return dye;
				}
			}
		}
		return null;
	}

	@Override
	public ArtDye[] getDyes(DyeType dyeType) {
		if (dyeType == DyeType.DYE)
			return Arrays.copyOf(dyes, dyes.length);
		else if (dyeType == DyeType.TOOL)
			return Arrays.copyOf(tools, tools.length);
		else if (dyeType == DyeType.ALL)
			return concatenate(dyes, tools);
		else
			return null;
	}

	public ArtDye getDye(byte colour) {
		for (ArtDye dye : dyes) {
			byte base = ((BasicDye) dye).getColour();
			if (colour >= (base - 1) && colour <= (base + 2)) {
				return dye;
			}
		}
		return getDefaultColour();
	}

	public ArtDye[] concatenate(ArtDye[] a, ArtDye[] b) {
		int aLength = a.length;
		int bLength = b.length;
		ArtDye[] c = new ArtDye[aLength + bLength];
		System.arraycopy(a, 0, c, 0, aLength);
		System.arraycopy(b, 0, c, aLength, bLength);
		return c;
	}

	@Override
	public BasicDye getDefaultColour() {
		return ((BasicDye) WHITE);
	}

}

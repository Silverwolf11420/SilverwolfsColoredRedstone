package com.silverwolfs.silverwolfscoloredredstone.init;

import com.silverwolfs.silverwolfscoloredredstone.SilverwolfsColoredRedstone;
import net.minecraft.block.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, SilverwolfsColoredRedstone.MOD_ID);

    //Blocks
    public static final RegistryObject<Block> BLACK_ACTIVATOR_RAIL = BLOCKS.register("black_activator_rail", () -> new PoweredRailBlock(AbstractBlock.Properties.from(Blocks.ACTIVATOR_RAIL)));
    public static final RegistryObject<Block> BLUE_ACTIVATOR_RAIL = BLOCKS.register("blue_activator_rail", () -> new PoweredRailBlock(AbstractBlock.Properties.from(Blocks.ACTIVATOR_RAIL)));
    public static final RegistryObject<Block> BROWN_ACTIVATOR_RAIL = BLOCKS.register("brown_activator_rail", () -> new PoweredRailBlock(AbstractBlock.Properties.from(Blocks.ACTIVATOR_RAIL)));
    public static final RegistryObject<Block> CYAN_ACTIVATOR_RAIL = BLOCKS.register("cyan_activator_rail", () -> new PoweredRailBlock(AbstractBlock.Properties.from(Blocks.ACTIVATOR_RAIL)));
    public static final RegistryObject<Block> GRAY_ACTIVATOR_RAIL = BLOCKS.register("gray_activator_rail", () -> new PoweredRailBlock(AbstractBlock.Properties.from(Blocks.ACTIVATOR_RAIL)));
    public static final RegistryObject<Block> GREEN_ACTIVATOR_RAIL = BLOCKS.register("green_activator_rail", () -> new PoweredRailBlock(AbstractBlock.Properties.from(Blocks.ACTIVATOR_RAIL)));
    public static final RegistryObject<Block> LIGHT_BLUE_ACTIVATOR_RAIL = BLOCKS.register("light_blue_activator_rail", () -> new PoweredRailBlock(AbstractBlock.Properties.from(Blocks.ACTIVATOR_RAIL)));
    public static final RegistryObject<Block> LIGHT_GRAY_ACTIVATOR_RAIL = BLOCKS.register("light_gray_activator_rail", () -> new PoweredRailBlock(AbstractBlock.Properties.from(Blocks.ACTIVATOR_RAIL)));
    public static final RegistryObject<Block> LIME_ACTIVATOR_RAIL = BLOCKS.register("lime_activator_rail", () -> new PoweredRailBlock(AbstractBlock.Properties.from(Blocks.ACTIVATOR_RAIL)));
    public static final RegistryObject<Block> MAGENTA_ACTIVATOR_RAIL = BLOCKS.register("magenta_activator_rail", () -> new PoweredRailBlock(AbstractBlock.Properties.from(Blocks.ACTIVATOR_RAIL)));
    public static final RegistryObject<Block> ORANGE_ACTIVATOR_RAIL = BLOCKS.register("orange_activator_rail", () -> new PoweredRailBlock(AbstractBlock.Properties.from(Blocks.ACTIVATOR_RAIL)));
    public static final RegistryObject<Block> PINK_ACTIVATOR_RAIL = BLOCKS.register("pink_activator_rail", () -> new PoweredRailBlock(AbstractBlock.Properties.from(Blocks.ACTIVATOR_RAIL)));
    public static final RegistryObject<Block> PURPLE_ACTIVATOR_RAIL = BLOCKS.register("purple_activator_rail", () -> new PoweredRailBlock(AbstractBlock.Properties.from(Blocks.ACTIVATOR_RAIL)));
    public static final RegistryObject<Block> WHITE_ACTIVATOR_RAIL = BLOCKS.register("white_activator_rail", () -> new PoweredRailBlock(AbstractBlock.Properties.from(Blocks.ACTIVATOR_RAIL)));
    public static final RegistryObject<Block> YELLOW_ACTIVATOR_RAIL = BLOCKS.register("yellow_activator_rail", () -> new PoweredRailBlock(AbstractBlock.Properties.from(Blocks.ACTIVATOR_RAIL)));

    public static final RegistryObject<Block> BLACK_DETECTOR_RAIL = BLOCKS.register("black_detector_rail", () -> new DetectorRailBlock(AbstractBlock.Properties.from(Blocks.DETECTOR_RAIL)));
    public static final RegistryObject<Block> BLUE_DETECTOR_RAIL = BLOCKS.register("blue_detector_rail", () -> new DetectorRailBlock(AbstractBlock.Properties.from(Blocks.DETECTOR_RAIL)));
    public static final RegistryObject<Block> BROWN_DETECTOR_RAIL = BLOCKS.register("brown_detector_rail", () -> new DetectorRailBlock(AbstractBlock.Properties.from(Blocks.DETECTOR_RAIL)));
    public static final RegistryObject<Block> CYAN_DETECTOR_RAIL = BLOCKS.register("cyan_detector_rail", () -> new DetectorRailBlock(AbstractBlock.Properties.from(Blocks.DETECTOR_RAIL)));
    public static final RegistryObject<Block> GRAY_DETECTOR_RAIL = BLOCKS.register("gray_detector_rail", () -> new DetectorRailBlock(AbstractBlock.Properties.from(Blocks.DETECTOR_RAIL)));
    public static final RegistryObject<Block> GREEN_DETECTOR_RAIL = BLOCKS.register("green_detector_rail", () -> new DetectorRailBlock(AbstractBlock.Properties.from(Blocks.DETECTOR_RAIL)));
    public static final RegistryObject<Block> LIGHT_BLUE_DETECTOR_RAIL = BLOCKS.register("light_blue_detector_rail", () -> new DetectorRailBlock(AbstractBlock.Properties.from(Blocks.DETECTOR_RAIL)));
    public static final RegistryObject<Block> LIGHT_GRAY_DETECTOR_RAIL = BLOCKS.register("light_gray_detector_rail", () -> new DetectorRailBlock(AbstractBlock.Properties.from(Blocks.DETECTOR_RAIL)));
    public static final RegistryObject<Block> LIME_DETECTOR_RAIL = BLOCKS.register("lime_detector_rail", () -> new DetectorRailBlock(AbstractBlock.Properties.from(Blocks.DETECTOR_RAIL)));
    public static final RegistryObject<Block> MAGENTA_DETECTOR_RAIL = BLOCKS.register("magenta_detector_rail", () -> new DetectorRailBlock(AbstractBlock.Properties.from(Blocks.DETECTOR_RAIL)));
    public static final RegistryObject<Block> ORANGE_DETECTOR_RAIL = BLOCKS.register("orange_detector_rail", () -> new DetectorRailBlock(AbstractBlock.Properties.from(Blocks.DETECTOR_RAIL)));
    public static final RegistryObject<Block> PINK_DETECTOR_RAIL = BLOCKS.register("pink_detector_rail", () -> new DetectorRailBlock(AbstractBlock.Properties.from(Blocks.DETECTOR_RAIL)));
    public static final RegistryObject<Block> PURPLE_DETECTOR_RAIL = BLOCKS.register("purple_detector_rail", () -> new DetectorRailBlock(AbstractBlock.Properties.from(Blocks.DETECTOR_RAIL)));
    public static final RegistryObject<Block> WHITE_DETECTOR_RAIL = BLOCKS.register("white_detector_rail", () -> new DetectorRailBlock(AbstractBlock.Properties.from(Blocks.DETECTOR_RAIL)));
    public static final RegistryObject<Block> YELLOW_DETECTOR_RAIL = BLOCKS.register("yellow_detector_rail", () -> new DetectorRailBlock(AbstractBlock.Properties.from(Blocks.DETECTOR_RAIL)));

    public static final RegistryObject<Block> BLACK_POWERED_RAIL = BLOCKS.register("black_powered_rail", () -> new PoweredRailBlock(AbstractBlock.Properties.from(Blocks.POWERED_RAIL)));
    public static final RegistryObject<Block> BLUE_POWERED_RAIL = BLOCKS.register("blue_powered_rail", () -> new PoweredRailBlock(AbstractBlock.Properties.from(Blocks.POWERED_RAIL)));
    public static final RegistryObject<Block> BROWN_POWERED_RAIL = BLOCKS.register("brown_powered_rail", () -> new PoweredRailBlock(AbstractBlock.Properties.from(Blocks.POWERED_RAIL)));
    public static final RegistryObject<Block> CYAN_POWERED_RAIL = BLOCKS.register("cyan_powered_rail", () -> new PoweredRailBlock(AbstractBlock.Properties.from(Blocks.POWERED_RAIL)));
    public static final RegistryObject<Block> GRAY_POWERED_RAIL = BLOCKS.register("gray_powered_rail", () -> new PoweredRailBlock(AbstractBlock.Properties.from(Blocks.POWERED_RAIL)));
    public static final RegistryObject<Block> GREEN_POWERED_RAIL = BLOCKS.register("green_powered_rail", () -> new PoweredRailBlock(AbstractBlock.Properties.from(Blocks.POWERED_RAIL)));
    public static final RegistryObject<Block> LIGHT_BLUE_POWERED_RAIL = BLOCKS.register("light_blue_powered_rail", () -> new PoweredRailBlock(AbstractBlock.Properties.from(Blocks.POWERED_RAIL)));
    public static final RegistryObject<Block> LIGHT_GRAY_POWERED_RAIL = BLOCKS.register("light_gray_powered_rail", () -> new PoweredRailBlock(AbstractBlock.Properties.from(Blocks.POWERED_RAIL)));
    public static final RegistryObject<Block> LIME_POWERED_RAIL = BLOCKS.register("lime_powered_rail", () -> new PoweredRailBlock(AbstractBlock.Properties.from(Blocks.POWERED_RAIL)));
    public static final RegistryObject<Block> MAGENTA_POWERED_RAIL = BLOCKS.register("magenta_powered_rail", () -> new PoweredRailBlock(AbstractBlock.Properties.from(Blocks.POWERED_RAIL)));
    public static final RegistryObject<Block> ORANGE_POWERED_RAIL = BLOCKS.register("orange_powered_rail", () -> new PoweredRailBlock(AbstractBlock.Properties.from(Blocks.POWERED_RAIL)));
    public static final RegistryObject<Block> PINK_POWERED_RAIL = BLOCKS.register("pink_powered_rail", () -> new PoweredRailBlock(AbstractBlock.Properties.from(Blocks.POWERED_RAIL)));
    public static final RegistryObject<Block> PURPLE_POWERED_RAIL = BLOCKS.register("purple_powered_rail", () -> new PoweredRailBlock(AbstractBlock.Properties.from(Blocks.POWERED_RAIL)));
    public static final RegistryObject<Block> WHITE_POWERED_RAIL = BLOCKS.register("white_powered_rail", () -> new PoweredRailBlock(AbstractBlock.Properties.from(Blocks.POWERED_RAIL)));
    public static final RegistryObject<Block> YELLOW_POWERED_RAIL = BLOCKS.register("yellow_powered_rail", () -> new PoweredRailBlock(AbstractBlock.Properties.from(Blocks.POWERED_RAIL)));

    public static final RegistryObject<Block> BLACK_REDSTONE_BLOCK = BLOCKS.register("black_redstone_block", () -> new RedstoneBlock(AbstractBlock.Properties.from(Blocks.REDSTONE_BLOCK)));
    public static final RegistryObject<Block> BLUE_REDSTONE_BLOCK = BLOCKS.register("blue_redstone_block", () -> new RedstoneBlock(AbstractBlock.Properties.from(Blocks.REDSTONE_BLOCK)));
    public static final RegistryObject<Block> BROWN_REDSTONE_BLOCK = BLOCKS.register("brown_redstone_block", () -> new RedstoneBlock(AbstractBlock.Properties.from(Blocks.REDSTONE_BLOCK)));
    public static final RegistryObject<Block> CYAN_REDSTONE_BLOCK = BLOCKS.register("cyan_redstone_block", () -> new RedstoneBlock(AbstractBlock.Properties.from(Blocks.REDSTONE_BLOCK)));
    public static final RegistryObject<Block> GRAY_REDSTONE_BLOCK = BLOCKS.register("gray_redstone_block", () -> new RedstoneBlock(AbstractBlock.Properties.from(Blocks.REDSTONE_BLOCK)));
    public static final RegistryObject<Block> GREEN_REDSTONE_BLOCK = BLOCKS.register("green_redstone_block", () -> new RedstoneBlock(AbstractBlock.Properties.from(Blocks.REDSTONE_BLOCK)));
    public static final RegistryObject<Block> LIGHT_BLUE_REDSTONE_BLOCK = BLOCKS.register("light_blue_redstone_block", () -> new RedstoneBlock(AbstractBlock.Properties.from(Blocks.REDSTONE_BLOCK)));
    public static final RegistryObject<Block> LIGHT_GRAY_REDSTONE_BLOCK = BLOCKS.register("light_gray_redstone_block", () -> new RedstoneBlock(AbstractBlock.Properties.from(Blocks.REDSTONE_BLOCK)));
    public static final RegistryObject<Block> LIME_REDSTONE_BLOCK = BLOCKS.register("lime_redstone_block", () -> new RedstoneBlock(AbstractBlock.Properties.from(Blocks.REDSTONE_BLOCK)));
    public static final RegistryObject<Block> MAGENTA_REDSTONE_BLOCK = BLOCKS.register("magenta_redstone_block", () -> new RedstoneBlock(AbstractBlock.Properties.from(Blocks.REDSTONE_BLOCK)));
    public static final RegistryObject<Block> ORANGE_REDSTONE_BLOCK = BLOCKS.register("orange_redstone_block", () -> new RedstoneBlock(AbstractBlock.Properties.from(Blocks.REDSTONE_BLOCK)));
    public static final RegistryObject<Block> PINK_REDSTONE_BLOCK = BLOCKS.register("pink_redstone_block", () -> new RedstoneBlock(AbstractBlock.Properties.from(Blocks.REDSTONE_BLOCK)));
    public static final RegistryObject<Block> PURPLE_REDSTONE_BLOCK = BLOCKS.register("purple_redstone_block", () -> new RedstoneBlock(AbstractBlock.Properties.from(Blocks.REDSTONE_BLOCK)));
    public static final RegistryObject<Block> WHITE_REDSTONE_BLOCK = BLOCKS.register("white_redstone_block", () -> new RedstoneBlock(AbstractBlock.Properties.from(Blocks.REDSTONE_BLOCK)));
    public static final RegistryObject<Block> YELLOW_REDSTONE_BLOCK = BLOCKS.register("yellow_redstone_block", () -> new RedstoneBlock(AbstractBlock.Properties.from(Blocks.REDSTONE_BLOCK)));

    //public static final Block REDSTONE_WIRE = register("redstone_wire", new RedstoneWireBlock(AbstractBlock.Properties.create(Material.MISCELLANEOUS).doesNotBlockMovement().zeroHardnessAndResistance()));
    //public static final Block REDSTONE_TORCH = register("redstone_torch", new RedstoneTorchBlock(AbstractBlock.Properties.create(Material.MISCELLANEOUS).doesNotBlockMovement().zeroHardnessAndResistance().setLightLevel(getLightValueLit(7)).sound(SoundType.WOOD)));
    //public static final Block REDSTONE_WALL_TORCH = register("redstone_wall_torch", new RedstoneWallTorchBlock(AbstractBlock.Properties.create(Material.MISCELLANEOUS).doesNotBlockMovement().zeroHardnessAndResistance().setLightLevel(getLightValueLit(7)).sound(SoundType.WOOD).lootFrom(REDSTONE_TORCH)));
    //public static final Block COMPARATOR = register("comparator", new ComparatorBlock(AbstractBlock.Properties.create(Material.MISCELLANEOUS).zeroHardnessAndResistance().sound(SoundType.WOOD)));
    //public static final Block REPEATER = register("repeater", new RepeaterBlock(AbstractBlock.Properties.create(Material.MISCELLANEOUS).zeroHardnessAndResistance().sound(SoundType.WOOD)));

    /*//Block Items
    public static final RegistryObject<BlockItem> BLACK_ACTIVATOR_RAIL_ITEM = ItemInit.ITEMS.register("black_activator_rail", () -> new BlockItem(BLACK_ACTIVATOR_RAIL.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> BLUE_ACTIVATOR_RAIL_ITEM = ItemInit.ITEMS.register("blue_activator_rail", () -> new BlockItem(BLUE_ACTIVATOR_RAIL.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> BROWN_ACTIVATOR_RAIL_ITEM = ItemInit.ITEMS.register("brown_activator_rail", () -> new BlockItem(BROWN_ACTIVATOR_RAIL.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> CYAN_ACTIVATOR_RAIL_ITEM = ItemInit.ITEMS.register("cyan_activator_rail", () -> new BlockItem(CYAN_ACTIVATOR_RAIL.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> GRAY_ACTIVATOR_RAIL_ITEM = ItemInit.ITEMS.register("gray_activator_rail", () -> new BlockItem(GRAY_ACTIVATOR_RAIL.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> GREEN_ACTIVATOR_RAIL_ITEM = ItemInit.ITEMS.register("green_activator_rail", () -> new BlockItem(GREEN_ACTIVATOR_RAIL.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> LIGHT_BLUE_ACTIVATOR_RAIL_ITEM = ItemInit.ITEMS.register("light_blue_activator_rail", () -> new BlockItem(LIGHT_BLUE_ACTIVATOR_RAIL.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> LIGHT_GRAY_ACTIVATOR_RAIL_ITEM = ItemInit.ITEMS.register("light_gray_activator_rail", () -> new BlockItem(LIGHT_GRAY_ACTIVATOR_RAIL.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> LIME_ACTIVATOR_RAIL_ITEM = ItemInit.ITEMS.register("lime_activator_rail", () -> new BlockItem(LIME_ACTIVATOR_RAIL.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> MAGENTA_ACTIVATOR_RAIL_ITEM = ItemInit.ITEMS.register("magenta_activator_rail", () -> new BlockItem(MAGENTA_ACTIVATOR_RAIL.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> ORANGE_ACTIVATOR_RAIL_ITEM = ItemInit.ITEMS.register("orange_activator_rail", () -> new BlockItem(ORANGE_ACTIVATOR_RAIL.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> PINK_ACTIVATOR_RAIL_ITEM = ItemInit.ITEMS.register("pink_activator_rail", () -> new BlockItem(PINK_ACTIVATOR_RAIL.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> PURPLE_ACTIVATOR_RAIL_ITEM = ItemInit.ITEMS.register("purple_activator_rail", () -> new BlockItem(PURPLE_ACTIVATOR_RAIL.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> WHITE_ACTIVATOR_RAIL_ITEM = ItemInit.ITEMS.register("white_activator_rail", () -> new BlockItem(WHITE_ACTIVATOR_RAIL.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> YELLOW_ACTIVATOR_RAIL_ITEM = ItemInit.ITEMS.register("yellow_activator_rail", () -> new BlockItem(YELLOW_ACTIVATOR_RAIL.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));

    public static final RegistryObject<BlockItem> BLACK_DETECTOR_RAIL_ITEM = ItemInit.ITEMS.register("black_detector_rail", () -> new BlockItem(BLACK_DETECTOR_RAIL.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> BLUE_DETECTOR_RAIL_ITEM = ItemInit.ITEMS.register("blue_detector_rail", () -> new BlockItem(BLUE_DETECTOR_RAIL.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> BROWN_DETECTOR_RAIL_ITEM = ItemInit.ITEMS.register("brown_detector_rail", () -> new BlockItem(BROWN_DETECTOR_RAIL.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> CYAN_DETECTOR_RAIL_ITEM = ItemInit.ITEMS.register("cyan_detector_rail", () -> new BlockItem(CYAN_DETECTOR_RAIL.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> GRAY_DETECTOR_RAIL_ITEM = ItemInit.ITEMS.register("gray_detector_rail", () -> new BlockItem(GRAY_DETECTOR_RAIL.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> GREEN_DETECTOR_RAIL_ITEM = ItemInit.ITEMS.register("green_detector_rail", () -> new BlockItem(GREEN_DETECTOR_RAIL.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> LIGHT_BLUE_DETECTOR_RAIL_ITEM = ItemInit.ITEMS.register("light_blue_detector_rail", () -> new BlockItem(LIGHT_BLUE_DETECTOR_RAIL.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> LIGHT_GRAY_DETECTOR_RAIL_ITEM = ItemInit.ITEMS.register("light_gray_detector_rail", () -> new BlockItem(LIGHT_GRAY_DETECTOR_RAIL.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> LIME_DETECTOR_RAIL_ITEM = ItemInit.ITEMS.register("lime_detector_rail", () -> new BlockItem(LIME_DETECTOR_RAIL.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> MAGENTA_DETECTOR_RAIL_ITEM = ItemInit.ITEMS.register("magenta_detector_rail", () -> new BlockItem(MAGENTA_DETECTOR_RAIL.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> ORANGE_DETECTOR_RAIL_ITEM = ItemInit.ITEMS.register("orange_detector_rail", () -> new BlockItem(ORANGE_DETECTOR_RAIL.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> PINK_DETECTOR_RAIL_ITEM = ItemInit.ITEMS.register("pink_detector_rail", () -> new BlockItem(PINK_DETECTOR_RAIL.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> PURPLE_DETECTOR_RAIL_ITEM = ItemInit.ITEMS.register("purple_detector_rail", () -> new BlockItem(PURPLE_DETECTOR_RAIL.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> WHITE_DETECTOR_RAIL_ITEM = ItemInit.ITEMS.register("white_detector_rail", () -> new BlockItem(WHITE_DETECTOR_RAIL.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> YELLOW_DETECTOR_RAIL_ITEM = ItemInit.ITEMS.register("yellow_detector_rail", () -> new BlockItem(YELLOW_DETECTOR_RAIL.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));

    public static final RegistryObject<BlockItem> BLACK_POWERED_RAIL_ITEM = ItemInit.ITEMS.register("black_powered_rail", () -> new BlockItem(BLACK_POWERED_RAIL.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> BLUE_POWERED_RAIL_ITEM = ItemInit.ITEMS.register("blue_powered_rail", () -> new BlockItem(BLUE_POWERED_RAIL.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> BROWN_POWERED_RAIL_ITEM = ItemInit.ITEMS.register("brown_powered_rail", () -> new BlockItem(BROWN_POWERED_RAIL.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> CYAN_POWERED_RAIL_ITEM = ItemInit.ITEMS.register("cyan_powered_rail", () -> new BlockItem(CYAN_POWERED_RAIL.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> GRAY_POWERED_RAIL_ITEM = ItemInit.ITEMS.register("gray_powered_rail", () -> new BlockItem(GRAY_POWERED_RAIL.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> GREEN_POWERED_RAIL_ITEM = ItemInit.ITEMS.register("green_powered_rail", () -> new BlockItem(GREEN_POWERED_RAIL.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> LIGHT_BLUE_POWERED_RAIL_ITEM = ItemInit.ITEMS.register("light_blue_powered_rail", () -> new BlockItem(LIGHT_BLUE_POWERED_RAIL.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> LIGHT_GRAY_POWERED_RAIL_ITEM = ItemInit.ITEMS.register("light_gray_powered_rail", () -> new BlockItem(LIGHT_GRAY_POWERED_RAIL.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> LIME_POWERED_RAIL_ITEM = ItemInit.ITEMS.register("lime_powered_rail", () -> new BlockItem(LIME_POWERED_RAIL.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> MAGENTA_POWERED_RAIL_ITEM = ItemInit.ITEMS.register("magenta_powered_rail", () -> new BlockItem(MAGENTA_POWERED_RAIL.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> ORANGE_POWERED_RAIL_ITEM = ItemInit.ITEMS.register("orange_powered_rail", () -> new BlockItem(ORANGE_POWERED_RAIL.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> PINK_POWERED_RAIL_ITEM = ItemInit.ITEMS.register("pink_powered_rail", () -> new BlockItem(PINK_POWERED_RAIL.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> PURPLE_POWERED_RAIL_ITEM = ItemInit.ITEMS.register("purple_powered_rail", () -> new BlockItem(PURPLE_POWERED_RAIL.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> WHITE_POWERED_RAIL_ITEM = ItemInit.ITEMS.register("white_powered_rail", () -> new BlockItem(WHITE_POWERED_RAIL.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> YELLOW_POWERED_RAIL_ITEM = ItemInit.ITEMS.register("yellow_powered_rail", () -> new BlockItem(YELLOW_POWERED_RAIL.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
*/
}

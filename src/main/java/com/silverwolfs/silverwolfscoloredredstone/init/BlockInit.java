package com.silverwolfs.silverwolfscoloredredstone.init;

import com.silverwolfs.silverwolfscoloredredstone.SilverwolfsColoredRedstone;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Function;
import java.util.function.Supplier;

public class BlockInit {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, SilverwolfsColoredRedstone.MOD_ID);

    public static void init(IEventBus modBus) {
        BLOCKS.register(modBus);

    }
    private static <T extends Block> RegistryObject<T> register(String name, Supplier<? extends T> sup) {
        return register(name, sup, BlockInit::itemDefault);
    }

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<? extends T> sup, Function<RegistryObject<T>, Supplier<? extends Item>> itemCreator) {
        RegistryObject<T> ret = registerNoItem(name, sup);
        ItemInit.ITEMS.register(name, itemCreator.apply(ret));
        return ret;
    }

    private static <T extends Block> RegistryObject<T> registerNoItem(String name, Supplier<? extends T> sup) {
        return BLOCKS.register(name, sup);
    }

    private static Supplier<BlockItem> itemDefault(final RegistryObject<? extends Block> block) {
        return item(block, SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance);
    }

    private static Supplier<BlockItem> item(final RegistryObject<? extends Block> block, final ItemGroup itemGroup) {
        return () -> new BlockItem(block.get(), new Item.Properties().group(itemGroup));
    }

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

    //Block Items
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

}

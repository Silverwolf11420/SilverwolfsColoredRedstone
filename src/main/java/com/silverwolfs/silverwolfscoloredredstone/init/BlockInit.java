package com.silverwolfs.silverwolfscoloredredstone.init;

import com.silverwolfs.silverwolfscoloredredstone.SilverwolfsColoredRedstone;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.WallOrFloorItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
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

    public static final RegistryObject<RedstoneTorchBlock> BLACK_REDSTONE_TORCH = BLOCKS.register("black_redstone_torch", () -> new RedstoneTorchBlock(AbstractBlock.Properties.create(Material.MISCELLANEOUS).sound(SoundType.WOOD).doesNotBlockMovement().zeroHardnessAndResistance().setLightLevel((state) -> 7)));
    public static final RegistryObject<RedstoneTorchBlock> BLUE_REDSTONE_TORCH = BLOCKS.register("blue_redstone_torch", () -> new RedstoneTorchBlock(AbstractBlock.Properties.create(Material.MISCELLANEOUS).sound(SoundType.WOOD).doesNotBlockMovement().zeroHardnessAndResistance().setLightLevel((state) -> 7)));
    public static final RegistryObject<RedstoneTorchBlock> BROWN_REDSTONE_TORCH = BLOCKS.register("brown_redstone_torch", () -> new RedstoneTorchBlock(AbstractBlock.Properties.create(Material.MISCELLANEOUS).sound(SoundType.WOOD).doesNotBlockMovement().zeroHardnessAndResistance().setLightLevel((state) -> 7)));
    public static final RegistryObject<RedstoneTorchBlock> CYAN_REDSTONE_TORCH = BLOCKS.register("cyan_redstone_torch", () -> new RedstoneTorchBlock(AbstractBlock.Properties.create(Material.MISCELLANEOUS).sound(SoundType.WOOD).doesNotBlockMovement().zeroHardnessAndResistance().setLightLevel((state) -> 7)));
    public static final RegistryObject<RedstoneTorchBlock> GRAY_REDSTONE_TORCH = BLOCKS.register("gray_redstone_torch", () -> new RedstoneTorchBlock(AbstractBlock.Properties.create(Material.MISCELLANEOUS).sound(SoundType.WOOD).doesNotBlockMovement().zeroHardnessAndResistance().setLightLevel((state) -> 7)));
    public static final RegistryObject<RedstoneTorchBlock> GREEN_REDSTONE_TORCH = BLOCKS.register("green_redstone_torch", () -> new RedstoneTorchBlock(AbstractBlock.Properties.create(Material.MISCELLANEOUS).sound(SoundType.WOOD).doesNotBlockMovement().zeroHardnessAndResistance().setLightLevel((state) -> 7)));
    public static final RegistryObject<RedstoneTorchBlock> LIGHT_BLUE_REDSTONE_TORCH = BLOCKS.register("light_blue_redstone_torch", () -> new RedstoneTorchBlock(AbstractBlock.Properties.create(Material.MISCELLANEOUS).sound(SoundType.WOOD).doesNotBlockMovement().zeroHardnessAndResistance().setLightLevel((state) -> 7)));
    public static final RegistryObject<RedstoneTorchBlock> LIGHT_GRAY_REDSTONE_TORCH = BLOCKS.register("light_gray_redstone_torch", () -> new RedstoneTorchBlock(AbstractBlock.Properties.create(Material.MISCELLANEOUS).sound(SoundType.WOOD).doesNotBlockMovement().zeroHardnessAndResistance().setLightLevel((state) -> 7)));
    public static final RegistryObject<RedstoneTorchBlock> LIME_REDSTONE_TORCH = BLOCKS.register("lime_redstone_torch", () -> new RedstoneTorchBlock(AbstractBlock.Properties.create(Material.MISCELLANEOUS).sound(SoundType.WOOD).doesNotBlockMovement().zeroHardnessAndResistance().setLightLevel((state) -> 7)));
    public static final RegistryObject<RedstoneTorchBlock> MAGENTA_REDSTONE_TORCH = BLOCKS.register("magenta_redstone_torch", () -> new RedstoneTorchBlock(AbstractBlock.Properties.create(Material.MISCELLANEOUS).sound(SoundType.WOOD).doesNotBlockMovement().zeroHardnessAndResistance().setLightLevel((state) -> 7)));
    public static final RegistryObject<RedstoneTorchBlock> ORANGE_REDSTONE_TORCH = BLOCKS.register("orange_redstone_torch", () -> new RedstoneTorchBlock(AbstractBlock.Properties.create(Material.MISCELLANEOUS).sound(SoundType.WOOD).doesNotBlockMovement().zeroHardnessAndResistance().setLightLevel((state) -> 7)));
    public static final RegistryObject<RedstoneTorchBlock> PINK_REDSTONE_TORCH = BLOCKS.register("pink_redstone_torch", () -> new RedstoneTorchBlock(AbstractBlock.Properties.create(Material.MISCELLANEOUS).sound(SoundType.WOOD).doesNotBlockMovement().zeroHardnessAndResistance().setLightLevel((state) -> 7)));
    public static final RegistryObject<RedstoneTorchBlock> PURPLE_REDSTONE_TORCH = BLOCKS.register("purple_redstone_torch", () -> new RedstoneTorchBlock(AbstractBlock.Properties.create(Material.MISCELLANEOUS).sound(SoundType.WOOD).doesNotBlockMovement().zeroHardnessAndResistance().setLightLevel((state) -> 7)));
    public static final RegistryObject<RedstoneTorchBlock> WHITE_REDSTONE_TORCH = BLOCKS.register("white_redstone_torch", () -> new RedstoneTorchBlock(AbstractBlock.Properties.create(Material.MISCELLANEOUS).sound(SoundType.WOOD).doesNotBlockMovement().zeroHardnessAndResistance().setLightLevel((state) -> 7)));
    public static final RegistryObject<RedstoneTorchBlock> YELLOW_REDSTONE_TORCH = BLOCKS.register("yellow_redstone_torch", () -> new RedstoneTorchBlock(AbstractBlock.Properties.create(Material.MISCELLANEOUS).sound(SoundType.WOOD).doesNotBlockMovement().zeroHardnessAndResistance().setLightLevel((state) -> 7)));

    public static final RegistryObject<RedstoneWallTorchBlock> BLACK_REDSTONE_WALL_TORCH = BLOCKS.register("black_redstone_wall_torch", () -> new RedstoneWallTorchBlock(AbstractBlock.Properties.create(Material.MISCELLANEOUS).sound(SoundType.WOOD).doesNotBlockMovement().zeroHardnessAndResistance().lootFrom(BLACK_REDSTONE_TORCH.get()).setLightLevel((state) -> 7)));
    public static final RegistryObject<RedstoneWallTorchBlock> BLUE_REDSTONE_WALL_TORCH = BLOCKS.register("blue_redstone_wall_torch", () -> new RedstoneWallTorchBlock(AbstractBlock.Properties.create(Material.MISCELLANEOUS).sound(SoundType.WOOD).doesNotBlockMovement().zeroHardnessAndResistance().lootFrom(BLUE_REDSTONE_TORCH.get()).setLightLevel((state) -> 7)));
    public static final RegistryObject<RedstoneWallTorchBlock> BROWN_REDSTONE_WALL_TORCH = BLOCKS.register("brown_redstone_wall_torch", () -> new RedstoneWallTorchBlock(AbstractBlock.Properties.create(Material.MISCELLANEOUS).sound(SoundType.WOOD).doesNotBlockMovement().zeroHardnessAndResistance().lootFrom(BROWN_REDSTONE_TORCH.get()).setLightLevel((state) -> 7)));
    public static final RegistryObject<RedstoneWallTorchBlock> CYAN_REDSTONE_WALL_TORCH = BLOCKS.register("cyan_redstone_wall_torch", () -> new RedstoneWallTorchBlock(AbstractBlock.Properties.create(Material.MISCELLANEOUS).sound(SoundType.WOOD).doesNotBlockMovement().zeroHardnessAndResistance().lootFrom(CYAN_REDSTONE_TORCH.get()).setLightLevel((state) -> 7)));
    public static final RegistryObject<RedstoneWallTorchBlock> GRAY_REDSTONE_WALL_TORCH = BLOCKS.register("gray_redstone_wall_torch", () -> new RedstoneWallTorchBlock(AbstractBlock.Properties.create(Material.MISCELLANEOUS).sound(SoundType.WOOD).doesNotBlockMovement().zeroHardnessAndResistance().lootFrom(GRAY_REDSTONE_TORCH.get()).setLightLevel((state) -> 7)));
    public static final RegistryObject<RedstoneWallTorchBlock> GREEN_REDSTONE_WALL_TORCH = BLOCKS.register("green_redstone_wall_torch", () -> new RedstoneWallTorchBlock(AbstractBlock.Properties.create(Material.MISCELLANEOUS).sound(SoundType.WOOD).doesNotBlockMovement().zeroHardnessAndResistance().lootFrom(GREEN_REDSTONE_TORCH.get()).setLightLevel((state) -> 7)));
    public static final RegistryObject<RedstoneWallTorchBlock> LIGHT_BLUE_REDSTONE_WALL_TORCH = BLOCKS.register("light_blue_redstone_wall_torch", () -> new RedstoneWallTorchBlock(AbstractBlock.Properties.create(Material.MISCELLANEOUS).sound(SoundType.WOOD).doesNotBlockMovement().zeroHardnessAndResistance().lootFrom(LIGHT_BLUE_REDSTONE_TORCH.get()).setLightLevel((state) -> 7)));
    public static final RegistryObject<RedstoneWallTorchBlock> LIGHT_GRAY_REDSTONE_WALL_TORCH = BLOCKS.register("light_gray_redstone_wall_torch", () -> new RedstoneWallTorchBlock(AbstractBlock.Properties.create(Material.MISCELLANEOUS).sound(SoundType.WOOD).doesNotBlockMovement().zeroHardnessAndResistance().lootFrom(LIGHT_GRAY_REDSTONE_TORCH.get()).setLightLevel((state) -> 7)));
    public static final RegistryObject<RedstoneWallTorchBlock> LIME_REDSTONE_WALL_TORCH = BLOCKS.register("lime_redstone_wall_torch", () -> new RedstoneWallTorchBlock(AbstractBlock.Properties.create(Material.MISCELLANEOUS).sound(SoundType.WOOD).doesNotBlockMovement().zeroHardnessAndResistance().lootFrom(LIME_REDSTONE_TORCH.get()).setLightLevel((state) -> 7)));
    public static final RegistryObject<RedstoneWallTorchBlock> MAGENTA_REDSTONE_WALL_TORCH = BLOCKS.register("magenta_redstone_wall_torch", () -> new RedstoneWallTorchBlock(AbstractBlock.Properties.create(Material.MISCELLANEOUS).sound(SoundType.WOOD).doesNotBlockMovement().zeroHardnessAndResistance().lootFrom(MAGENTA_REDSTONE_TORCH.get()).setLightLevel((state) -> 7)));
    public static final RegistryObject<RedstoneWallTorchBlock> ORANGE_REDSTONE_WALL_TORCH = BLOCKS.register("orange_redstone_wall_torch", () -> new RedstoneWallTorchBlock(AbstractBlock.Properties.create(Material.MISCELLANEOUS).sound(SoundType.WOOD).doesNotBlockMovement().zeroHardnessAndResistance().lootFrom(ORANGE_REDSTONE_TORCH.get()).setLightLevel((state) -> 7)));
    public static final RegistryObject<RedstoneWallTorchBlock> PINK_REDSTONE_WALL_TORCH = BLOCKS.register("pink_redstone_wall_torch", () -> new RedstoneWallTorchBlock(AbstractBlock.Properties.create(Material.MISCELLANEOUS).sound(SoundType.WOOD).doesNotBlockMovement().zeroHardnessAndResistance().lootFrom(PINK_REDSTONE_TORCH.get()).setLightLevel((state) -> 7)));
    public static final RegistryObject<RedstoneWallTorchBlock> PURPLE_REDSTONE_WALL_TORCH = BLOCKS.register("purple_redstone_wall_torch", () -> new RedstoneWallTorchBlock(AbstractBlock.Properties.create(Material.MISCELLANEOUS).sound(SoundType.WOOD).doesNotBlockMovement().zeroHardnessAndResistance().lootFrom(PURPLE_REDSTONE_TORCH.get()).setLightLevel((state) -> 7)));
    public static final RegistryObject<RedstoneWallTorchBlock> WHITE_REDSTONE_WALL_TORCH = BLOCKS.register("white_redstone_wall_torch", () -> new RedstoneWallTorchBlock(AbstractBlock.Properties.create(Material.MISCELLANEOUS).sound(SoundType.WOOD).doesNotBlockMovement().zeroHardnessAndResistance().lootFrom(WHITE_REDSTONE_TORCH.get()).setLightLevel((state) -> 7)));
    public static final RegistryObject<RedstoneWallTorchBlock> YELLOW_REDSTONE_WALL_TORCH = BLOCKS.register("yellow_redstone_wall_torch", () -> new RedstoneWallTorchBlock(AbstractBlock.Properties.create(Material.MISCELLANEOUS).sound(SoundType.WOOD).doesNotBlockMovement().zeroHardnessAndResistance().lootFrom(YELLOW_REDSTONE_TORCH.get()).setLightLevel((state) -> 7)));

    public static final RegistryObject<Block> BLACK_COMPARATOR = BLOCKS.register("black_comparator", () -> new ComparatorBlock(AbstractBlock.Properties.from(Blocks.COMPARATOR)));
    public static final RegistryObject<Block> BLUE_COMPARATOR = BLOCKS.register("blue_comparator", () -> new ComparatorBlock(AbstractBlock.Properties.from(Blocks.COMPARATOR)));
    public static final RegistryObject<Block> BROWN_COMPARATOR = BLOCKS.register("brown_comparator", () -> new ComparatorBlock(AbstractBlock.Properties.from(Blocks.COMPARATOR)));
    public static final RegistryObject<Block> CYAN_COMPARATOR = BLOCKS.register("cyan_comparator", () -> new ComparatorBlock(AbstractBlock.Properties.from(Blocks.COMPARATOR)));
    public static final RegistryObject<Block> GRAY_COMPARATOR = BLOCKS.register("gray_comparator", () -> new ComparatorBlock(AbstractBlock.Properties.from(Blocks.COMPARATOR)));
    public static final RegistryObject<Block> GREEN_COMPARATOR = BLOCKS.register("green_comparator", () -> new ComparatorBlock(AbstractBlock.Properties.from(Blocks.COMPARATOR)));
    public static final RegistryObject<Block> LIGHT_BLUE_COMPARATOR = BLOCKS.register("light_blue_comparator", () -> new ComparatorBlock(AbstractBlock.Properties.from(Blocks.COMPARATOR)));
    public static final RegistryObject<Block> LIGHT_GRAY_COMPARATOR = BLOCKS.register("light_gray_comparator", () -> new ComparatorBlock(AbstractBlock.Properties.from(Blocks.COMPARATOR)));
    public static final RegistryObject<Block> LIME_COMPARATOR = BLOCKS.register("lime_comparator", () -> new ComparatorBlock(AbstractBlock.Properties.from(Blocks.COMPARATOR)));
    public static final RegistryObject<Block> MAGENTA_COMPARATOR = BLOCKS.register("magenta_comparator", () -> new ComparatorBlock(AbstractBlock.Properties.from(Blocks.COMPARATOR)));
    public static final RegistryObject<Block> ORANGE_COMPARATOR = BLOCKS.register("orange_comparator", () -> new ComparatorBlock(AbstractBlock.Properties.from(Blocks.COMPARATOR)));
    public static final RegistryObject<Block> PINK_COMPARATOR = BLOCKS.register("pink_comparator", () -> new ComparatorBlock(AbstractBlock.Properties.from(Blocks.COMPARATOR)));
    public static final RegistryObject<Block> PURPLE_COMPARATOR = BLOCKS.register("purple_comparator", () -> new ComparatorBlock(AbstractBlock.Properties.from(Blocks.COMPARATOR)));
    public static final RegistryObject<Block> WHITE_COMPARATOR = BLOCKS.register("white_comparator", () -> new ComparatorBlock(AbstractBlock.Properties.from(Blocks.COMPARATOR)));
    public static final RegistryObject<Block> YELLOW_COMPARATOR = BLOCKS.register("yellow_comparator", () -> new ComparatorBlock(AbstractBlock.Properties.from(Blocks.COMPARATOR)));

    public static final RegistryObject<Block> BLACK_REPEATER = BLOCKS.register("black_repeater", () -> new RepeaterBlock(AbstractBlock.Properties.from(Blocks.REPEATER)));
    public static final RegistryObject<Block> BLUE_REPEATER = BLOCKS.register("blue_repeater", () -> new RepeaterBlock(AbstractBlock.Properties.from(Blocks.REPEATER)));
    public static final RegistryObject<Block> BROWN_REPEATER = BLOCKS.register("brown_repeater", () -> new RepeaterBlock(AbstractBlock.Properties.from(Blocks.REPEATER)));
    public static final RegistryObject<Block> CYAN_REPEATER = BLOCKS.register("cyan_repeater", () -> new RepeaterBlock(AbstractBlock.Properties.from(Blocks.REPEATER)));
    public static final RegistryObject<Block> GRAY_REPEATER = BLOCKS.register("gray_repeater", () -> new RepeaterBlock(AbstractBlock.Properties.from(Blocks.REPEATER)));
    public static final RegistryObject<Block> GREEN_REPEATER = BLOCKS.register("green_repeater", () -> new RepeaterBlock(AbstractBlock.Properties.from(Blocks.REPEATER)));
    public static final RegistryObject<Block> LIGHT_BLUE_REPEATER = BLOCKS.register("light_blue_repeater", () -> new RepeaterBlock(AbstractBlock.Properties.from(Blocks.REPEATER)));
    public static final RegistryObject<Block> LIGHT_GRAY_REPEATER = BLOCKS.register("light_gray_repeater", () -> new RepeaterBlock(AbstractBlock.Properties.from(Blocks.REPEATER)));
    public static final RegistryObject<Block> LIME_REPEATER = BLOCKS.register("lime_repeater", () -> new RepeaterBlock(AbstractBlock.Properties.from(Blocks.REPEATER)));
    public static final RegistryObject<Block> MAGENTA_REPEATER = BLOCKS.register("magenta_repeater", () -> new RepeaterBlock(AbstractBlock.Properties.from(Blocks.REPEATER)));
    public static final RegistryObject<Block> ORANGE_REPEATER = BLOCKS.register("orange_repeater", () -> new RepeaterBlock(AbstractBlock.Properties.from(Blocks.REPEATER)));
    public static final RegistryObject<Block> PINK_REPEATER = BLOCKS.register("pink_repeater", () -> new RepeaterBlock(AbstractBlock.Properties.from(Blocks.REPEATER)));
    public static final RegistryObject<Block> PURPLE_REPEATER = BLOCKS.register("purple_repeater", () -> new RepeaterBlock(AbstractBlock.Properties.from(Blocks.REPEATER)));
    public static final RegistryObject<Block> WHITE_REPEATER = BLOCKS.register("white_repeater", () -> new RepeaterBlock(AbstractBlock.Properties.from(Blocks.REPEATER)));
    public static final RegistryObject<Block> YELLOW_REPEATER = BLOCKS.register("yellow_repeater", () -> new RepeaterBlock(AbstractBlock.Properties.from(Blocks.REPEATER)));

    public static final RegistryObject<Block> BLACK_REDSTONE_WIRE = BLOCKS.register("black_redstone_wire", () -> new RedstoneWireBlock(AbstractBlock.Properties.from(Blocks.REDSTONE_WIRE)));
    public static final RegistryObject<Block> BLUE_REDSTONE_WIRE = BLOCKS.register("blue_redstone_wire", () -> new RedstoneWireBlock(AbstractBlock.Properties.from(Blocks.REDSTONE_WIRE)));
    public static final RegistryObject<Block> BROWN_REDSTONE_WIRE = BLOCKS.register("brown_redstone_wire", () -> new RedstoneWireBlock(AbstractBlock.Properties.from(Blocks.REDSTONE_WIRE)));
    public static final RegistryObject<Block> CYAN_REDSTONE_WIRE = BLOCKS.register("cyan_redstone_wire", () -> new RedstoneWireBlock(AbstractBlock.Properties.from(Blocks.REDSTONE_WIRE)));
    public static final RegistryObject<Block> GRAY_REDSTONE_WIRE = BLOCKS.register("gray_redstone_wire", () -> new RedstoneWireBlock(AbstractBlock.Properties.from(Blocks.REDSTONE_WIRE)));
    public static final RegistryObject<Block> GREEN_REDSTONE_WIRE = BLOCKS.register("green_redstone_wire", () -> new RedstoneWireBlock(AbstractBlock.Properties.from(Blocks.REDSTONE_WIRE)));
    public static final RegistryObject<Block> LIGHT_BLUE_REDSTONE_WIRE = BLOCKS.register("light_blue_redstone_wire", () -> new RedstoneWireBlock(AbstractBlock.Properties.from(Blocks.REDSTONE_WIRE)));
    public static final RegistryObject<Block> LIGHT_GRAY_REDSTONE_WIRE = BLOCKS.register("light_gray_redstone_wire", () -> new RedstoneWireBlock(AbstractBlock.Properties.from(Blocks.REDSTONE_WIRE)));
    public static final RegistryObject<Block> LIME_REDSTONE_WIRE = BLOCKS.register("lime_redstone_wire", () -> new RedstoneWireBlock(AbstractBlock.Properties.from(Blocks.REDSTONE_WIRE)));
    public static final RegistryObject<Block> MAGENTA_REDSTONE_WIRE = BLOCKS.register("magenta_redstone_wire", () -> new RedstoneWireBlock(AbstractBlock.Properties.from(Blocks.REDSTONE_WIRE)));
    public static final RegistryObject<Block> ORANGE_REDSTONE_WIRE = BLOCKS.register("orange_redstone_wire", () -> new RedstoneWireBlock(AbstractBlock.Properties.from(Blocks.REDSTONE_WIRE)));
    public static final RegistryObject<Block> PINK_REDSTONE_WIRE = BLOCKS.register("pink_redstone_wire", () -> new RedstoneWireBlock(AbstractBlock.Properties.from(Blocks.REDSTONE_WIRE)));
    public static final RegistryObject<Block> PURPLE_REDSTONE_WIRE = BLOCKS.register("purple_redstone_wire", () -> new RedstoneWireBlock(AbstractBlock.Properties.from(Blocks.REDSTONE_WIRE)));
    public static final RegistryObject<Block> WHITE_REDSTONE_WIRE = BLOCKS.register("white_redstone_wire", () -> new RedstoneWireBlock(AbstractBlock.Properties.from(Blocks.REDSTONE_WIRE)));
    public static final RegistryObject<Block> YELLOW_REDSTONE_WIRE = BLOCKS.register("yellow_redstone_wire", () -> new RedstoneWireBlock(AbstractBlock.Properties.from(Blocks.REDSTONE_WIRE)));

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

    public static final RegistryObject<BlockItem> BLACK_REDSTONE_BLOCK_ITEM = ItemInit.ITEMS.register("black_redstone_block", () -> new BlockItem(BLACK_REDSTONE_BLOCK.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> BLUE_REDSTONE_BLOCK_ITEM = ItemInit.ITEMS.register("blue_redstone_block", () -> new BlockItem(BLUE_REDSTONE_BLOCK.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> BROWN_REDSTONE_BLOCK_ITEM = ItemInit.ITEMS.register("brown_redstone_block", () -> new BlockItem(BROWN_REDSTONE_BLOCK.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> CYAN_REDSTONE_BLOCK_ITEM = ItemInit.ITEMS.register("cyan_redstone_block", () -> new BlockItem(CYAN_REDSTONE_BLOCK.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> GRAY_REDSTONE_BLOCK_ITEM = ItemInit.ITEMS.register("gray_redstone_block", () -> new BlockItem(GRAY_REDSTONE_BLOCK.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> GREEN_REDSTONE_BLOCK_ITEM = ItemInit.ITEMS.register("green_redstone_block", () -> new BlockItem(GREEN_REDSTONE_BLOCK.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> LIGHT_BLUE_REDSTONE_BLOCK_ITEM = ItemInit.ITEMS.register("light_blue_redstone_block", () -> new BlockItem(LIGHT_BLUE_REDSTONE_BLOCK.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> LIGHT_GRAY_REDSTONE_BLOCK_ITEM = ItemInit.ITEMS.register("light_gray_redstone_block", () -> new BlockItem(LIGHT_GRAY_REDSTONE_BLOCK.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> LIME_REDSTONE_BLOCK_ITEM = ItemInit.ITEMS.register("lime_redstone_block", () -> new BlockItem(LIME_REDSTONE_BLOCK.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> MAGENTA_REDSTONE_BLOCK_ITEM = ItemInit.ITEMS.register("magenta_redstone_block", () -> new BlockItem(MAGENTA_REDSTONE_BLOCK.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> ORANGE_REDSTONE_BLOCK_ITEM = ItemInit.ITEMS.register("orange_redstone_block", () -> new BlockItem(ORANGE_REDSTONE_BLOCK.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> PINK_REDSTONE_BLOCK_ITEM = ItemInit.ITEMS.register("pink_redstone_block", () -> new BlockItem(PINK_REDSTONE_BLOCK.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> PURPLE_REDSTONE_BLOCK_ITEM = ItemInit.ITEMS.register("purple_redstone_block", () -> new BlockItem(PURPLE_REDSTONE_BLOCK.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> WHITE_REDSTONE_BLOCK_ITEM = ItemInit.ITEMS.register("white_redstone_block", () -> new BlockItem(WHITE_REDSTONE_BLOCK.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> YELLOW_REDSTONE_BLOCK_ITEM = ItemInit.ITEMS.register("yellow_redstone_block", () -> new BlockItem(YELLOW_REDSTONE_BLOCK.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));

    public static final RegistryObject<BlockItem> BLACK_COMPARATOR_ITEM = ItemInit.ITEMS.register("black_comparator", () -> new BlockItem(BLACK_COMPARATOR.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> BLUE_COMPARATOR_ITEM = ItemInit.ITEMS.register("blue_comparator", () -> new BlockItem(BLUE_COMPARATOR.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> BROWN_COMPARATOR_ITEM = ItemInit.ITEMS.register("brown_comparator", () -> new BlockItem(BROWN_COMPARATOR.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> CYAN_COMPARATOR_ITEM = ItemInit.ITEMS.register("cyan_comparator", () -> new BlockItem(CYAN_COMPARATOR.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> GRAY_COMPARATOR_ITEM = ItemInit.ITEMS.register("gray_comparator", () -> new BlockItem(GRAY_COMPARATOR.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> GREEN_COMPARATOR_ITEM = ItemInit.ITEMS.register("green_comparator", () -> new BlockItem(GREEN_COMPARATOR.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> LIGHT_BLUE_COMPARATOR_ITEM = ItemInit.ITEMS.register("light_blue_comparator", () -> new BlockItem(LIGHT_BLUE_COMPARATOR.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> LIGHT_GRAY_COMPARATOR_ITEM = ItemInit.ITEMS.register("light_gray_comparator", () -> new BlockItem(LIGHT_GRAY_COMPARATOR.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> LIME_COMPARATOR_ITEM = ItemInit.ITEMS.register("lime_comparator", () -> new BlockItem(LIME_COMPARATOR.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> MAGENTA_COMPARATOR_ITEM = ItemInit.ITEMS.register("magenta_comparator", () -> new BlockItem(MAGENTA_COMPARATOR.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> ORANGE_COMPARATOR_ITEM = ItemInit.ITEMS.register("orange_comparator", () -> new BlockItem(ORANGE_COMPARATOR.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> PINK_COMPARATOR_ITEM = ItemInit.ITEMS.register("pink_comparator", () -> new BlockItem(PINK_COMPARATOR.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> PURPLE_COMPARATOR_ITEM = ItemInit.ITEMS.register("purple_comparator", () -> new BlockItem(PURPLE_COMPARATOR.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> WHITE_COMPARATOR_ITEM = ItemInit.ITEMS.register("white_comparator", () -> new BlockItem(WHITE_COMPARATOR.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> YELLOW_COMPARATOR_ITEM = ItemInit.ITEMS.register("yellow_comparator", () -> new BlockItem(YELLOW_COMPARATOR.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));

    public static final RegistryObject<BlockItem> BLACK_REPEATER_ITEM = ItemInit.ITEMS.register("black_repeater", () -> new BlockItem(BLACK_REPEATER.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> BLUE_REPEATER_ITEM = ItemInit.ITEMS.register("blue_repeater", () -> new BlockItem(BLUE_REPEATER.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> BROWN_REPEATER_ITEM = ItemInit.ITEMS.register("brown_repeater", () -> new BlockItem(BROWN_REPEATER.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> CYAN_REPEATER_ITEM = ItemInit.ITEMS.register("cyan_repeater", () -> new BlockItem(CYAN_REPEATER.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> GRAY_REPEATER_ITEM = ItemInit.ITEMS.register("gray_repeater", () -> new BlockItem(GRAY_REPEATER.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> GREEN_REPEATER_ITEM = ItemInit.ITEMS.register("green_repeater", () -> new BlockItem(GREEN_REPEATER.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> LIGHT_BLUE_REPEATER_ITEM = ItemInit.ITEMS.register("light_blue_repeater", () -> new BlockItem(LIGHT_BLUE_REPEATER.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> LIGHT_GRAY_REPEATER_ITEM = ItemInit.ITEMS.register("light_gray_repeater", () -> new BlockItem(LIGHT_GRAY_REPEATER.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> LIME_REPEATER_ITEM = ItemInit.ITEMS.register("lime_repeater", () -> new BlockItem(LIME_REPEATER.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> MAGENTA_REPEATER_ITEM = ItemInit.ITEMS.register("magenta_repeater", () -> new BlockItem(MAGENTA_REPEATER.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> ORANGE_REPEATER_ITEM = ItemInit.ITEMS.register("orange_repeater", () -> new BlockItem(ORANGE_REPEATER.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> PINK_REPEATER_ITEM = ItemInit.ITEMS.register("pink_repeater", () -> new BlockItem(PINK_REPEATER.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> PURPLE_REPEATER_ITEM = ItemInit.ITEMS.register("purple_repeater", () -> new BlockItem(PURPLE_REPEATER.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> WHITE_REPEATER_ITEM = ItemInit.ITEMS.register("white_repeater", () -> new BlockItem(WHITE_REPEATER.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> YELLOW_REPEATER_ITEM = ItemInit.ITEMS.register("yellow_repeater", () -> new BlockItem(YELLOW_REPEATER.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));

    public static final RegistryObject<BlockItem> BLACK_REDSTONE_TORCH_ITEM = ItemInit.ITEMS.register("black_redstone_torch", () -> new WallOrFloorItem(BLACK_REDSTONE_TORCH.get(), BLACK_REDSTONE_WALL_TORCH.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> BLUE_REDSTONE_TORCH_ITEM = ItemInit.ITEMS.register("blue_redstone_torch", () -> new WallOrFloorItem(BLUE_REDSTONE_TORCH.get(), BLUE_REDSTONE_WALL_TORCH.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> BROWN_REDSTONE_TORCH_ITEM = ItemInit.ITEMS.register("brown_redstone_torch", () -> new WallOrFloorItem(BROWN_REDSTONE_TORCH.get(), BROWN_REDSTONE_WALL_TORCH.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> CYAN_REDSTONE_TORCH_ITEM = ItemInit.ITEMS.register("cyan_redstone_torch", () -> new WallOrFloorItem(CYAN_REDSTONE_TORCH.get(), CYAN_REDSTONE_WALL_TORCH.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> GRAY_REDSTONE_TORCH_ITEM = ItemInit.ITEMS.register("gray_redstone_torch", () -> new WallOrFloorItem(GRAY_REDSTONE_TORCH.get(), GRAY_REDSTONE_WALL_TORCH.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> GREEN_REDSTONE_TORCH_ITEM = ItemInit.ITEMS.register("green_redstone_torch", () -> new WallOrFloorItem(GREEN_REDSTONE_TORCH.get(), GREEN_REDSTONE_WALL_TORCH.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> LIGHT_BLUE_REDSTONE_TORCH_ITEM = ItemInit.ITEMS.register("light_blue_redstone_torch", () -> new WallOrFloorItem(LIGHT_BLUE_REDSTONE_TORCH.get(), LIGHT_BLUE_REDSTONE_WALL_TORCH.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> LIGHT_GRAY_REDSTONE_TORCH_ITEM = ItemInit.ITEMS.register("light_gray_redstone_torch", () -> new WallOrFloorItem(LIGHT_GRAY_REDSTONE_TORCH.get(), LIGHT_GRAY_REDSTONE_WALL_TORCH.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> LIME_REDSTONE_TORCH_ITEM = ItemInit.ITEMS.register("lime_redstone_torch", () -> new WallOrFloorItem(LIME_REDSTONE_TORCH.get(), LIME_REDSTONE_WALL_TORCH.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> MAGENTA_REDSTONE_TORCH_ITEM = ItemInit.ITEMS.register("magenta_redstone_torch", () -> new WallOrFloorItem(MAGENTA_REDSTONE_TORCH.get(), MAGENTA_REDSTONE_WALL_TORCH.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> ORANGE_REDSTONE_TORCH_ITEM = ItemInit.ITEMS.register("orange_redstone_torch", () -> new WallOrFloorItem(ORANGE_REDSTONE_TORCH.get(), ORANGE_REDSTONE_WALL_TORCH.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> PINK_REDSTONE_TORCH_ITEM = ItemInit.ITEMS.register("pink_redstone_torch", () -> new WallOrFloorItem(PINK_REDSTONE_TORCH.get(), PINK_REDSTONE_WALL_TORCH.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> PURPLE_REDSTONE_TORCH_ITEM = ItemInit.ITEMS.register("purple_redstone_torch", () -> new WallOrFloorItem(PURPLE_REDSTONE_TORCH.get(), PURPLE_REDSTONE_WALL_TORCH.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> WHITE_REDSTONE_TORCH_ITEM = ItemInit.ITEMS.register("white_redstone_torch", () -> new WallOrFloorItem(WHITE_REDSTONE_TORCH.get(), WHITE_REDSTONE_WALL_TORCH.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));
    public static final RegistryObject<BlockItem> YELLOW_REDSTONE_TORCH_ITEM = ItemInit.ITEMS.register("yellow_redstone_torch", () -> new WallOrFloorItem(YELLOW_REDSTONE_TORCH.get(), YELLOW_REDSTONE_WALL_TORCH.get(), new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));

}

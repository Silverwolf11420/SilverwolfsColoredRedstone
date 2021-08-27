package com.silverwolfs.silverwolfscoloredredstone;

import com.silverwolfs.silverwolfscoloredredstone.init.BlockInit;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod.EventBusSubscriber(modid = SilverwolfsColoredRedstone.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
@Mod("silverwolfscoloredredstone")
public class SilverwolfsColoredRedstone {

    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "silverwolfscoloredredstone";
    public static SilverwolfsColoredRedstone instance;

    public SilverwolfsColoredRedstone()
    {
        final IEventBus modEventbus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventbus.addListener(this::setup);
        modEventbus.addListener(this::doClientStuff);

        BlockInit.BLOCKS.register(modEventbus);

        instance = this;
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
        final IForgeRegistry<Item> registry = event.getRegistry();

        BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
            final Item.Properties properties = new Item.Properties().group(SilverwolfsRedstoneItemGroup.instance);
            final BlockItem blockItem = new BlockItem(block, properties);
            blockItem.setRegistryName(block.getRegistryName());
            registry.register(blockItem);
        });
    }

    private void setup(final FMLCommonSetupEvent event)
    {
    }

    private void doClientStuff(final FMLClientSetupEvent event)
    {
    }

    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event)
    {
    }

    //creative tabs
    public static class SilverwolfsRedstoneItemGroup extends ItemGroup {
        public static final SilverwolfsRedstoneItemGroup instance = new SilverwolfsRedstoneItemGroup(ItemGroup.GROUPS.length, "creativetab");

        private SilverwolfsRedstoneItemGroup(int index, String label) {
            super(index, label);
        }

        @Override
        public ItemStack createIcon() {
            return new ItemStack(Blocks.CHAIN);
        }

        @Override
        public boolean hasSearchBar() {
            return true;
        }

    }
}

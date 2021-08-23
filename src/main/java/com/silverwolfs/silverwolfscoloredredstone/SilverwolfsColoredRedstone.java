package com.silverwolfs.silverwolfscoloredredstone;

import com.silverwolfs.silverwolfscoloredredstone.util.RegistryHandler;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;

@Mod.EventBusSubscriber(modid = SilverwolfsColoredRedstone.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
@Mod("silverwolfscoloredredstone")
public class SilverwolfsColoredRedstone {

    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "silverwolfscoloredredstone";
    public static SilverwolfsColoredRedstone instance;

    public SilverwolfsColoredRedstone()
    {
        final IEventBus modEventbus = FMLJavaModLoadingContext.get().getModEventBus();
        RegistryHandler.init(modEventbus);

        instance = this;
        MinecraftForge.EVENT_BUS.register(this);
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

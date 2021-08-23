package com.silverwolfs.silverwolfscoloredredstone.util;

import com.silverwolfs.silverwolfscoloredredstone.SilverwolfsColoredRedstone;
import com.silverwolfs.silverwolfscoloredredstone.init.BlockInit;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = SilverwolfsColoredRedstone.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {

        RenderTypeLookup.setRenderLayer(BlockInit.BLACK_ACTIVATOR_RAIL.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.BLUE_ACTIVATOR_RAIL.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.BROWN_ACTIVATOR_RAIL.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.CYAN_ACTIVATOR_RAIL.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.GRAY_ACTIVATOR_RAIL.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.GREEN_ACTIVATOR_RAIL.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.LIGHT_BLUE_ACTIVATOR_RAIL.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.LIGHT_GRAY_ACTIVATOR_RAIL.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.LIME_ACTIVATOR_RAIL.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.MAGENTA_ACTIVATOR_RAIL.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.ORANGE_ACTIVATOR_RAIL.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.PINK_ACTIVATOR_RAIL.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.PURPLE_ACTIVATOR_RAIL.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.WHITE_ACTIVATOR_RAIL.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.YELLOW_ACTIVATOR_RAIL.get(), RenderType.getCutout());

    }
}

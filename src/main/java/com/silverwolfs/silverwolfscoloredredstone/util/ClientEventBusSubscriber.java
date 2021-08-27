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

        RenderTypeLookup.setRenderLayer(BlockInit.BLACK_DETECTOR_RAIL.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.BLUE_DETECTOR_RAIL.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.BROWN_DETECTOR_RAIL.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.CYAN_DETECTOR_RAIL.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.GRAY_DETECTOR_RAIL.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.GREEN_DETECTOR_RAIL.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.LIGHT_BLUE_DETECTOR_RAIL.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.LIGHT_GRAY_DETECTOR_RAIL.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.LIME_DETECTOR_RAIL.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.MAGENTA_DETECTOR_RAIL.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.ORANGE_DETECTOR_RAIL.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.PINK_DETECTOR_RAIL.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.PURPLE_DETECTOR_RAIL.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.WHITE_DETECTOR_RAIL.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.YELLOW_DETECTOR_RAIL.get(), RenderType.getCutout());

        RenderTypeLookup.setRenderLayer(BlockInit.BLACK_POWERED_RAIL.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.BLUE_POWERED_RAIL.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.BROWN_POWERED_RAIL.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.CYAN_POWERED_RAIL.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.GRAY_POWERED_RAIL.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.GREEN_POWERED_RAIL.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.LIGHT_BLUE_POWERED_RAIL.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.LIGHT_GRAY_POWERED_RAIL.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.LIME_POWERED_RAIL.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.MAGENTA_POWERED_RAIL.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.ORANGE_POWERED_RAIL.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.PINK_POWERED_RAIL.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.PURPLE_POWERED_RAIL.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.WHITE_POWERED_RAIL.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.YELLOW_POWERED_RAIL.get(), RenderType.getCutout());

        RenderTypeLookup.setRenderLayer(BlockInit.BLACK_REDSTONE_TORCH.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.BLUE_REDSTONE_TORCH.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.BROWN_REDSTONE_TORCH.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.CYAN_REDSTONE_TORCH.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.GRAY_REDSTONE_TORCH.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.GREEN_REDSTONE_TORCH.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.LIGHT_BLUE_REDSTONE_TORCH.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.LIGHT_GRAY_REDSTONE_TORCH.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.LIME_REDSTONE_TORCH.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.MAGENTA_REDSTONE_TORCH.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.ORANGE_REDSTONE_TORCH.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.PINK_REDSTONE_TORCH.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.PURPLE_REDSTONE_TORCH.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.WHITE_REDSTONE_TORCH.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.YELLOW_REDSTONE_TORCH.get(), RenderType.getCutout());
    }
}

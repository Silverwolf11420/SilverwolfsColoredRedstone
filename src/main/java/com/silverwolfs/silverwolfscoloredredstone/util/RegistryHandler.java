package com.silverwolfs.silverwolfscoloredredstone.util;

import com.silverwolfs.silverwolfscoloredredstone.SilverwolfsColoredRedstone;
import com.silverwolfs.silverwolfscoloredredstone.init.BlockInit;
import com.silverwolfs.silverwolfscoloredredstone.init.ItemInit;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.IForgeRegistryEntry;

public class RegistryHandler {
    public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final String name) {
        return setup(entry, new ResourceLocation(SilverwolfsColoredRedstone.MOD_ID, name));
    }

    public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final ResourceLocation registryName) {
        entry.setRegistryName(registryName);
        return entry;
    }

    public static void init(IEventBus modBus){
        ItemInit.init(modBus);
        BlockInit.init(modBus);

    }
}

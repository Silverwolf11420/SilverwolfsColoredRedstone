package com.silverwolfs.silverwolfscoloredredstone.init;

import com.silverwolfs.silverwolfscoloredredstone.SilverwolfsColoredRedstone;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SilverwolfsColoredRedstone.MOD_ID);

    public static void init(IEventBus modBus) {
        ITEMS.register(modBus);
    }

    public static final RegistryObject<Item> BLACK_REDSTONE = ITEMS.register("black_redstone", () -> new Item(new Item.Properties().group(SilverwolfsColoredRedstone.SilverwolfsRedstoneItemGroup.instance)));

}

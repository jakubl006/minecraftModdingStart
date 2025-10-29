package net.liniq.firstMinecraftMod.item;

import net.liniq.firstMinecraftMod.FirstMinecraftMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(FirstMinecraftMod.MODID);

    public static final DeferredItem<Item> CWELIUM = ITEMS.register("cwelium",
            () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}

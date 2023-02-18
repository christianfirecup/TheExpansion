package firecup.theexpansion.Items;

import firecup.theexpansion.TheExpansion;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemRegistration {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TheExpansion.MOD_ID);

    public static final RegistryObject<Item> STRONGSTICK = ITEMS.register("strongstick", () ->
            new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));


    public static void register(IEventBus bus){
        ITEMS.register(bus);
    }
}

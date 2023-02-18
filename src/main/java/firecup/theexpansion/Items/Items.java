package firecup.theexpansion.Items;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;

public class Items {
    public static final RegistryObject<Item> STRONGSTICK = ItemRegistration.ITEMS.register("strongstick", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
}

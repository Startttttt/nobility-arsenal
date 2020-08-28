package startttttt.nobility.arsenal;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class main implements ModInitializer {
	public final Item KINGSCROWN = new kingsCrown();

	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier("nobility-arsenal", "kings-crown"), KINGSCROWN);
	}
}

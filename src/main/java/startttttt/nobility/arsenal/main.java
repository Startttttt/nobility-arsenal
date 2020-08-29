package startttttt.nobility.arsenal;

import net.fabricmc.api.ModInitializer;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import startttttt.nobility.arsenal.items.armor.kingsArmor;
import startttttt.nobility.arsenal.items.armor.nobilityMaterials;
import startttttt.nobility.arsenal.items.tools.scepterOfCards;

public class main implements ModInitializer {
	public static final String MODID = "nobility-arsenal";

	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier(MODID, "kings-crown"), new kingsArmor(nobilityMaterials.KING, EquipmentSlot.HEAD));
		Registry.register(Registry.ITEM, new Identifier(MODID, "scepter-of-cards"), new scepterOfCards());
	}
}

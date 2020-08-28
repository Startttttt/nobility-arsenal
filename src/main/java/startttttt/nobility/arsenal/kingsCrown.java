package startttttt.nobility.arsenal;


import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;


public class kingsCrown extends ArmorItem {
    public kingsCrown() {
        super(new ArmorMaterial() {
            @Override
            public int getDurability(EquipmentSlot slot) {
                return 200;
            }
            @Override
            public int getProtectionAmount(EquipmentSlot slot) {
                return 5;
            }

            @Override
            public int getEnchantability() {
                return 15;
            }

            @Override
            public SoundEvent getEquipSound() {
                return SoundEvents.ITEM_ARMOR_EQUIP_GOLD;
            }

            @Override
            public Ingredient getRepairIngredient() {
                return (Ingredient.ofItems(Items.GOLD_INGOT));
            }

            @Override
            public String getName() {
                return null;
            }

            @Override
            public float getToughness() {
                return 0;
            }

            @Override
            public float getKnockbackResistance() {
                return 0;
            }
        }, EquipmentSlot.HEAD, new Settings().group(ItemGroup.COMBAT));
    }
}

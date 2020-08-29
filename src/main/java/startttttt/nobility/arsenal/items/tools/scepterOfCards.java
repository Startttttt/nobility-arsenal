package startttttt.nobility.arsenal.items.tools;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class scepterOfCards extends Item {
    private boolean first;
    public scepterOfCards() {
        super(new Item.Settings().group(ItemGroup.COMBAT));
        first = true;
    }


    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        super.inventoryTick(stack, world, entity, slot, selected);
        if(!first){
            if(entity.isOnGround()){
                first = true;
            }
        }
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity PlayerEntity, Hand hand){
        if(first){
            first = false;
            Vec3d forward = PlayerEntity.getRotationVector();
            PlayerEntity.setVelocity(forward.getX() * 2, 0, forward.getZ() * 2);
        }
        return new TypedActionResult<ItemStack>(ActionResult.SUCCESS, PlayerEntity.getStackInHand(hand));
    }
}

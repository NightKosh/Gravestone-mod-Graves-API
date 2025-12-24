package nightkosh.gravestone.api.death_handler;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.ItemStack;
import nightkosh.gravestone.api.grave.EnumGraveMaterial;
import nightkosh.gravestone.api.grave.EnumGraveType;

import java.util.List;

/**
 * GraveStone mod
 *
 * @author NightKosh
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public interface ICustomEntityDeathHandler {

    /**
     * Your entity class
     */
    Class getEntityClass();

    boolean canGenerateGrave(Entity entity, DamageSource damageSource);

    EnumGraveType getGraveType(Entity entity, DamageSource damageSource);

    EnumGraveMaterial getGraveMaterial(Entity entity, DamageSource damageSource);

    /**
     * Items to be placed in grave
     */
    List<ItemStack> getItems();

    /**
     * Sword which will be used as a gravestone
     * do not forget to remove it from items list
     */
    default ItemStack getSword() {
        return null;
    }

    /**
     * Amount of lived days
     * you can calculate it as "(int) (entity.worldObj.getWorldTime() - spawnTime) / 24000"
     */
    default int getAge() {
        return 0;
    }

}

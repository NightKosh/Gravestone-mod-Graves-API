package nightkosh.gravestone.api.death_handler;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
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
    public Class getEntityClass();

    public boolean canGenerateGrave(Entity entity, DamageSource damageSource);

    public EnumGraveType getGraveType(Entity entity, DamageSource damageSource);

    public EnumGraveMaterial getGraveMaterial(Entity entity, DamageSource damageSource);

    /**
     * Items to be placed in grave
     */
    public List<ItemStack> getItems();

    /**
     * Sword which will be used as a gravestone
     * do not forget to remove it from items list
     */
    public default ItemStack getSword() {
        return null;
    }

    /**
     * Amount of lived days
     * you can calculate it as "(int) (entity.worldObj.getWorldTime() - spawnTime) / 24000"
     */
    public default int getAge() {
        return 0;
    }
}

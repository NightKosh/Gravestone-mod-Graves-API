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

    public Class getEntityClass();

    public boolean generateGrave(Entity entity, DamageSource damageSource);

    public EnumGraveType getGraveType();

    public EnumGraveMaterial getGraveMaterial();

    public List<ItemStack> getItems();

    public default ItemStack getSword() {
        return null;
    }

    public default int getAge() {
        return 0;
    }
}

package nightkosh.gravestone.api;

import net.minecraft.core.BlockPos;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import nightkosh.gravestone.api.grave.EnumGraveMaterial;
import nightkosh.gravestone.api.grave.EnumGraveType;

/**
 * GraveStone mod
 *
 * @author NightKosh
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public interface IGraveStoneHelper {

    /**
     * Allow graves to use any your sword as a gravestone
     */
    void addSwordToSwordsList(Item sword);

    EnumGraveMaterial getGraveMaterialByLevel(int level);

    EnumGraveMaterial getGraveMaterialByAge(int age);

    boolean isMagicDamage(DamageSource damageSource);

    boolean isMossyGrave(Level level, BlockPos pos, EnumGraveMaterial graveMaterial, EnumGraveType graveType);

}

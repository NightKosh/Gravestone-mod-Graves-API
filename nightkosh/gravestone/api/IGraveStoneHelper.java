package nightkosh.gravestone.api;

import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
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
    public void addSwordToSwordsList(Item sword);

    public EnumGraveMaterial getGraveMaterialByLevel(int level);

    public EnumGraveMaterial getGraveMaterialByAge(int age);

    public boolean isMagicDamage(DamageSource damageSource);

    public boolean isMossyGrave(World world, BlockPos pos, EnumGraveMaterial graveMaterial, EnumGraveType graveType);
}

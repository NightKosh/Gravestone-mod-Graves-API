package nightkosh.gravestone.api.grave_position;

import net.minecraft.entity.Entity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/**
 * GraveStone mod
 *
 * @author NightKosh
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public interface IGravePositionHandler {

    /**
     * A condition to use custom grave position
     *
     * @param world World
     * @param entity Dead mob. It can be player, villager, dog, cat horse, or even any other modded mob
     * @param pos Position of death
     * @param damageSource source of damage which killed this mod
     * @return should position of generated grave be changed or not
     */
    public boolean condition(World world, Entity entity, BlockPos pos, DamageSource damageSource);

    /**
     * New position of the grave
     */
    public BlockPos gravePosition();
}

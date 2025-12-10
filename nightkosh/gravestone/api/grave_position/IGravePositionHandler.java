package nightkosh.gravestone.api.grave_position;

import net.minecraft.core.BlockPos;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

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
     * @param level        Level
     * @param entity       Dead mob. It can be player, villager, dog, cat horse, or even any other modded mob
     * @param pos          Position of death
     * @param damageSource source of damage which killed this mod
     * @return should position of generated grave be changed or not
     */
    boolean condition(Level level, Entity entity, BlockPos pos, DamageSource damageSource);

    /**
     * New position of the grave
     *
     * @param level        Level
     * @param entity       Dead mob. It can be player, villager, dog, cat horse, or even any other modded mob
     * @param pos          Position of death
     * @param damageSource source of damage which killed this mod
     * @return position in which grave will be generated
     */
    @Nullable
    BlockPos gravePosition(Level level, Entity entity, BlockPos pos, DamageSource damageSource);

    /**
     * New facing of the grave
     *
     * @param level        Level
     * @param entity       Dead mob. It can be player, villager, dog, cat horse, or even any other modded mob
     * @param pos          Position of death
     * @param damageSource source of damage which killed this mod
     * @return direction in which grave will be rotated
     */
    //TODO
//    @Nonnull
//    EnumFacing graveFacing(Level level, Entity entity, BlockPos pos, DamageSource damageSource);

    /**
     * Provide custom level in case you'd like to create grave in custom dimension
     *
     * @param level        Level
     * @param entity       Dead mob. It can be player, villager, dog, cat horse, or even any other modded mob
     * @param pos          Position of death
     * @param damageSource source of damage which killed this mod
     * @return World instance
     */
    @Nonnull
    default Level getLevel(Level level, Entity entity, BlockPos pos, DamageSource damageSource) {
        return level;
    }

}

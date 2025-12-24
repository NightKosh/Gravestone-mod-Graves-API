package nightkosh.gravestone.api.death_handler;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.player.Player;

/**
 * GraveStone mod
 *
 * @author NightKosh
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public interface IPlayerDeathHandler {

    boolean cancelGraveGeneration(Player player, DamageSource source);

}

package nightkosh.gravestone.api.death_handler;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;

/**
 * GraveStone mod
 *
 * @author NightKosh
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public interface IPlayerDeathHandler {

    public boolean cancelGraveGeneration(EntityPlayer player, DamageSource source);
}

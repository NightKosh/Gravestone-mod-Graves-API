package nightkosh.gravestone.api.death_handler;

import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.util.DamageSource;

/**
 * GraveStone mod
 *
 * @author NightKosh
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public interface IDogDeathHandler {

    public boolean cancelGraveGeneration(EntityWolf dog, DamageSource source);
}

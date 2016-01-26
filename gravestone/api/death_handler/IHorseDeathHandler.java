package gravestone.api.death_handler;

import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.util.DamageSource;

/**
 * GraveStone mod
 *
 * @author NightKosh
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public interface IHorseDeathHandler {

    public boolean cancelGraveGeneration(EntityHorse horse, DamageSource source);
}

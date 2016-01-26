package gravestone.api.death_handler;

import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.util.DamageSource;

/**
 * GraveStone mod
 *
 * @author NightKosh
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public interface ICatDeathHandler {

    public boolean cancelGraveGeneration(EntityOcelot cat, DamageSource source);
}

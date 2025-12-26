package nightkosh.gravestone.api.death_handler;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.npc.villager.Villager;

/**
 * GraveStone mod
 *
 * @author NightKosh
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public interface IVillagerDeathHandler {

    boolean cancelGraveGeneration(Villager villager, DamageSource source);

}

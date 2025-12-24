package nightkosh.gravestone.api.grave_items;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;

import java.util.List;

/**
 * GraveStone mod
 *
 * @author NightKosh
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public interface IPlayerItems {

    List<ItemStack> addItems(Player player, DamageSource source);

    /**
     * Calls after all items were collected. Use it only if you need to remove/change some of them.
     *
     * @param items Items to place in grave
     */
    default void getItems(Player player, DamageSource source, List<ItemStack> items) {

    }

}

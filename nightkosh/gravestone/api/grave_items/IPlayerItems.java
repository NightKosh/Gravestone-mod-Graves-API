package nightkosh.gravestone.api.grave_items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;

import java.util.List;

/**
 * GraveStone mod
 *
 * @author NightKosh
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public interface IPlayerItems {

    public List<ItemStack> addItems(EntityPlayer player, DamageSource source);

    /**
     * Calls after all items were collected. Use it only if you need to remove/change some of them.
     * @param items Items to place in grave
     */
    public default void getItems(EntityPlayer player, DamageSource source, List<ItemStack> items) {

    }
}

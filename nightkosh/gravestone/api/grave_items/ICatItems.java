package nightkosh.gravestone.api.grave_items;


import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.animal.Cat;
import net.minecraft.world.item.ItemStack;

import java.util.List;

/**
 * GraveStone mod
 *
 * @author NightKosh
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public interface ICatItems {

    List<ItemStack> addItems(Cat cat, DamageSource source);

}

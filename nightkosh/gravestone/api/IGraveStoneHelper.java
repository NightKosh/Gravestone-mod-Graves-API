package nightkosh.gravestone.api;

import net.minecraft.item.Item;
import nightkosh.gravestone.api.grave.EnumGraveMaterial;

/**
 * GraveStone mod
 *
 * @author NightKosh
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public interface IGraveStoneHelper {

    public void addSwordToSwordsList(Item sword);

    public EnumGraveMaterial getPlayerGraveMaterialByLevel(int level);

    public EnumGraveMaterial getGraveMaterialByAge(int age);
}

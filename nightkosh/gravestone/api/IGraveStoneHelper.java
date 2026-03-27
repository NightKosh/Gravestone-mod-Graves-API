package nightkosh.gravestone.api;

import nightkosh.gravestone.api.grave.EnumGraveMaterial;

/**
 * GraveStone mod
 *
 * @author NightKosh
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public interface IGraveStoneHelper {

    EnumGraveMaterial getGraveMaterialByLevel(int level);

    EnumGraveMaterial getGraveMaterialByAge(int age);

}

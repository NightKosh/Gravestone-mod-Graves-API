package nightkosh.gravestone.api;

import net.minecraft.world.item.CreativeModeTab;

import javax.annotation.Nullable;

/**
 * GraveStone mod
 *
 * @author NightKosh
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class GraveStoneAPI {

    @Nullable
    public static IGraveStoneHelper graveStone;

    @Nullable
    public static IGraveGeneration graveGenerationAtDeath;

    @Nullable
    public static CreativeModeTab gravesTab;

}

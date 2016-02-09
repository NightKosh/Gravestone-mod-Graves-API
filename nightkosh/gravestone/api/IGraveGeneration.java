package nightkosh.gravestone.api;

import nightkosh.gravestone.api.death_handler.*;
import nightkosh.gravestone.api.grave_items.*;

/**
 * GraveStone mod
 *
 * @author NightKosh
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public interface IGraveGeneration {

    public void addPlayerDeathHandler(IPlayerDeathHandler playerDeathHandler);

    public void addVillagerDeathHandler(IVillagerDeathHandler villagerDeathHandler);

    public void addDogDeathHandler(IDogDeathHandler dogDeathHandler);

    public void addCatDeathHandler(ICatDeathHandler catDeathHandler);

    public void addHorseDeathHandler(IHorseDeathHandler horseDeathHandler);


    public void addPlayerItemsHandler(IPlayerItems playerItems);

    public void addVillagerItemsHandler(IVillagerItems villagerItems);

    public void addDogItemsHandler(IDogItems dogItems);

    public void addCatItemsHandler(ICatItems catItems);

    public void addHorseItemsHandler(IHorseItems horseItems);



    public void addCustomEntityDeathHandler(ICustomEntityDeathHandler customEntityDeathHandler);
}

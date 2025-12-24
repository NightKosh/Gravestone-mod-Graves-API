package nightkosh.gravestone.api;

import nightkosh.gravestone.api.death_handler.*;
import nightkosh.gravestone.api.grave_items.*;
import nightkosh.gravestone.api.grave_position.IGravePositionHandler;

/**
 * GraveStone mod
 *
 * @author NightKosh
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public interface IGraveGeneration {

    void addPlayerDeathHandler(IPlayerDeathHandler playerDeathHandler);

    void addVillagerDeathHandler(IVillagerDeathHandler villagerDeathHandler);

    void addDogDeathHandler(IDogDeathHandler dogDeathHandler);

    void addCatDeathHandler(ICatDeathHandler catDeathHandler);

    void addHorseDeathHandler(IHorseDeathHandler horseDeathHandler);


    void addPlayerItemsHandler(IPlayerItems playerItems);

    void addVillagerItemsHandler(IVillagerItems villagerItems);

    void addDogItemsHandler(IDogItems dogItems);

    void addCatItemsHandler(ICatItems catItems);

    void addHorseItemsHandler(IHorseItems horseItems);

    /**
     * It can be used to generate graves for your Entities
     */
    void addCustomEntityDeathHandler(ICustomEntityDeathHandler customEntityDeathHandler);

    /**
     * It can be used to change position of generated grave
     */
    void addGravePositionHandler(IGravePositionHandler gravePosition);

}

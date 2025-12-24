package nightkosh.gravestone.api.grave;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

/**
 * GraveStone mod
 *
 * @author NightKosh
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public enum EnumGraveMaterial {

    SANDSTONE(Blocks.SANDSTONE),
    STONE(Blocks.STONE),
    DIORITE(Blocks.STONE),
    GRANITE(Blocks.GRANITE),
    MOSSY(Blocks.MOSSY_COBBLESTONE),
    GOLD(Blocks.GOLD_BLOCK),
    DIAMOND(Blocks.DIAMOND_BLOCK),
    OBSIDIAN(Blocks.OBSIDIAN),
    QUARTZ(Blocks.QUARTZ_BLOCK),
    PRIZMARINE(Blocks.PRISMARINE),
    ICE(Blocks.ICE);

    private final Block block;

    EnumGraveMaterial(Block block) {
        this.block = block;
    }

    public Block getBlock() {
        return this.block;
    }

}

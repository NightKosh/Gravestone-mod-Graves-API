package nightkosh.gravestone.api.grave;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

/**
 * GraveStone mod
 *
 * @author NightKosh
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public enum EnumGraveMaterial implements IEnumGraveMaterial {
    WOOD(Blocks.PLANKS),
    SANDSTONE(Blocks.SANDSTONE),
    RED_SANDSTONE(Blocks.RED_SANDSTONE),
    STONE(Blocks.STONE),
    DIORITE(Blocks.STONE, DIORITE_META),
    ANDESITE(Blocks.STONE, ANDESITE_META),
    GRANITE(Blocks.STONE, GRANITE_META),
    IRON(Blocks.IRON_BLOCK),
    GOLD(Blocks.GOLD_BLOCK),
    DIAMOND(Blocks.DIAMOND_BLOCK),
    EMERALD(Blocks.EMERALD_BLOCK),
    LAPIS(Blocks.LAPIS_BLOCK),
    REDSTONE(Blocks.REDSTONE_BLOCK),
    OBSIDIAN(Blocks.OBSIDIAN),
    QUARTZ(Blocks.QUARTZ_BLOCK),
    PRIZMARINE(Blocks.PRISMARINE),
    ICE(Blocks.ICE),
    OTHER(null);

    private Block block;
    private int meta;

    private EnumGraveMaterial(Block block) {
        this(block, 0);
    }

    private EnumGraveMaterial(Block block, int meta) {
        this.block = block;
        this.meta = meta;
    }

    public Block getBlock() {
        return this.block;
    }

    public int getMeta() {
        return this.meta;
    }
}

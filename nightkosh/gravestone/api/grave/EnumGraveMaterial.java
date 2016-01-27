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
    WOOD(Blocks.planks),
    SANDSTONE(Blocks.sandstone),
    RED_SANDSTONE(Blocks.red_sandstone),
    STONE(Blocks.stone),
    DIORITE(Blocks.stone, DIORITE_META),
    ANDESITE(Blocks.stone, ANDESITE_META),
    GRANITE(Blocks.stone, GRANITE_META),
    IRON(Blocks.iron_block),
    GOLD(Blocks.gold_block),
    DIAMOND(Blocks.diamond_block),
    EMERALD(Blocks.emerald_block),
    LAPIS(Blocks.lapis_block),
    REDSTONE(Blocks.redstone_block),
    OBSIDIAN(Blocks.obsidian),
    QUARTZ(Blocks.quartz_block),
    PRIZMARINE(Blocks.prismarine),
    ICE(Blocks.ice),
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

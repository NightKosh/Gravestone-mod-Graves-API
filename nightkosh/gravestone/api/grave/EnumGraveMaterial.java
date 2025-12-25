package nightkosh.gravestone.api.grave;

import com.mojang.serialization.Codec;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import javax.annotation.Nonnull;
import java.util.Locale;

/**
 * GraveStone mod
 *
 * @author NightKosh
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public enum EnumGraveMaterial implements StringRepresentable {

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

    public static final Codec<EnumGraveMaterial> CODEC = StringRepresentable.fromEnum(EnumGraveMaterial::values);

    private final Block block;

    EnumGraveMaterial(Block block) {
        this.block = block;
    }

    public Block getBlock() {
        return this.block;
    }

    @Nonnull
    @Override
    public String getSerializedName() {
        return name().toLowerCase(Locale.ROOT);
    }

}

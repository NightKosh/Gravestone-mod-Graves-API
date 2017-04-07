package nightkosh.gravestone.api.grave;

import net.minecraft.block.BlockStone;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;

/**
 * GraveStone mod
 *
 * @author NightKosh
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public interface IEnumGraveMaterial {
    public static final IBlockState DEFAULT_STONE_STATE = Blocks.STONE.getDefaultState();
    public static final int DIORITE_META = Blocks.STONE.getMetaFromState(DEFAULT_STONE_STATE.withProperty(BlockStone.VARIANT, BlockStone.EnumType.DIORITE_SMOOTH));
    public static final int ANDESITE_META = Blocks.STONE.getMetaFromState(DEFAULT_STONE_STATE.withProperty(BlockStone.VARIANT, BlockStone.EnumType.ANDESITE_SMOOTH));
    public static final int GRANITE_META = Blocks.STONE.getMetaFromState(DEFAULT_STONE_STATE.withProperty(BlockStone.VARIANT, BlockStone.EnumType.GRANITE_SMOOTH));
}

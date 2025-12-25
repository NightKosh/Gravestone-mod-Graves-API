package nightkosh.gravestone.api.grave;

import com.mojang.serialization.Codec;
import net.minecraft.util.StringRepresentable;

import javax.annotation.Nonnull;
import java.util.Locale;

/**
 * GraveStone mod
 *
 * @author NightKosh
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public enum EnumGraveType implements IEnumGraveType, StringRepresentable {
    GRAVE_STONE,
    GRAVE_PLATE,
    CROSS,
    OBELISK,
    CELTIC_CROSS,
    PET_GRAVE_STONE,
    VILLAGER_GRAVE_STONE,
    SWORD;

    public static final Codec<EnumGraveType> CODEC = StringRepresentable.fromEnum(EnumGraveType::values);

    @Nonnull
    @Override
    public String getSerializedName() {
        return name().toLowerCase(Locale.ROOT);
    }

}

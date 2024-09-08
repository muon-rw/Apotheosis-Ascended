package dev.davey.apotheosis_ascended;

import dev.shadowsoffire.apotheosis.adventure.loot.LootCategory;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ItemStack;
import top.ribs.scguns.item.GunItem;


public class AALootCategories {

    public static final LootCategory GUN = LootCategory.register(LootCategory.SWORD, "gun",
            s -> s.getItem() instanceof GunItem, arr(EquipmentSlot.MAINHAND));
    private static EquipmentSlot[] arr(EquipmentSlot... s) {
        return s;
    }

    public static boolean isGun(ItemStack stack) {
        return LootCategory.forItem(stack).equals(GUN);
    }

    public static void init() {}
}
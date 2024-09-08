package dev.davey.apotheosis_ascended.attributes;

import dev.davey.apotheosis_ascended.ApotheosisAscended;
import dev.shadowsoffire.attributeslib.impl.PercentBasedAttribute;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.RangedAttribute;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class AAAttributes {
    public static final DeferredRegister<Attribute> ATTRIBUTES = DeferredRegister.create(ForgeRegistries.ATTRIBUTES, ApotheosisAscended.MODID);

    public static final RegistryObject<Attribute> KICK_REDUCTION = ATTRIBUTES.register("kick_reduction",
            () -> new PercentBasedAttribute("attribute.apotheosis_ascended.kick_reduction", 0.0, 0.0, 1.0).setSyncable(true));

    public static final RegistryObject<Attribute> PROJECTILE_SPEED = ATTRIBUTES.register("projectile_speed",
            () -> new RangedAttribute("attribute.apotheosis_ascended.projectile_speed", 0.0, -0.99, 10.0).setSyncable(true));

    public static final RegistryObject<Attribute> FIRE_RATE = ATTRIBUTES.register("fire_rate",
            () -> new RangedAttribute("attribute.apotheosis_ascended.fire_rate", 0.0, -0.99, 10.0).setSyncable(true));

    public static final RegistryObject<Attribute> ADDITIONAL_AMMO = ATTRIBUTES.register("additional_ammo",
            () -> new RangedAttribute("attribute.apotheosis_ascended.additional_ammo", 0.0, 0.0, 100.0).setSyncable(true));

    public static final RegistryObject<Attribute> SPREAD_REDUCTION = ATTRIBUTES.register("spread_reduction",
            () -> new PercentBasedAttribute("attribute.apotheosis_ascended.spread_reduction", 0.0, 0.0, 1.0).setSyncable(true));

    public static final RegistryObject<Attribute> RELOAD_SPEED = ATTRIBUTES.register("reload_speed",
            () -> new RangedAttribute("attribute.apotheosis_ascended.reload_speed", 0.0, -0.99, 10.0).setSyncable(true));

    public static final RegistryObject<Attribute> BULLET_DAMAGE = ATTRIBUTES.register("bullet_damage",
            () -> new RangedAttribute("attribute.apotheosis_ascended.bullet_damage", 0.0, -0.99, 10.0).setSyncable(true));

}
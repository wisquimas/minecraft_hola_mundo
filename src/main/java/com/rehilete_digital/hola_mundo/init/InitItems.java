package com.rehilete_digital.hola_mundo.init;

import com.rehilete_digital.hola_mundo.HolaMundo;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ThrowablePotionItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class InitItems {
    /**
     * Registro general de Items
     */
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(
            ForgeRegistries.ITEMS, HolaMundo.MODID
    );

    /**
     * Registro individual de objeto
     */
    public static final RegistryObject<Item> POKEBOLA = ITEMS.register(
            "pokebola", () -> new ThrowablePotionItem(
                    new Item.Properties()
                            .tab(CreativeModeTab.TAB_MISC)
            )
    );
}

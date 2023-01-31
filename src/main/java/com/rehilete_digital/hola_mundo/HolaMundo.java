package com.rehilete_digital.hola_mundo;

import com.rehilete_digital.hola_mundo.init.InitItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(HolaMundo.MODID)
public class HolaMundo {
    public static final String MODID = "hola_mundo";

    public HolaMundo() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        InitItems.ITEMS.register(bus);
    }
}

package com.jerios.yteat;

import com.jerios.yteat.init.ItemInit;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ExampleMod.MOD_ID)
public class ExampleMod{
	
	public static final String MOD_ID = "mainmod";

    public ExampleMod() {
    	IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
    	ItemInit.ITEMS.register(bus);
        MinecraftForge.EVENT_BUS.register(this);
    }


}

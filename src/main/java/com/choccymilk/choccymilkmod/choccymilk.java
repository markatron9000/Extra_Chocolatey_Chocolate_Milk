package com.choccymilk.choccymilkmod;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.choccymilk.choccymilkmod.core.init.iteminit;

import java.util.stream.Collectors;

@Mod("choccymilk")
public class choccymilk
{
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String modid = "choccymilk";
    
	
	
	public choccymilk() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		bus.addListener(this::setup);
		iteminit.ITEMS.register(bus);
		
		MinecraftForge.EVENT_BUS.register(this);
	
	}
	
	
	
	
	private void setup(final FMLCommonSetupEvent event) {
		
		
	}
	
	
}

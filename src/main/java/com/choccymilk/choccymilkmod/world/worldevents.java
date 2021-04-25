package com.choccymilk.choccymilkmod.world;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraftforge.event.TickEvent.PlayerTickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber
public class worldevents {
	static boolean tripped = false;
	@SubscribeEvent
	public static void speedActive(PlayerTickEvent event) {
		//System.out.println("Event checked!");
		boolean chocmilkActive = false;
		boolean eccmilkActive = false;
		
		//event.player.getActiveEffects()
		//if((event.player.getArmorSlots())
		/*
		if(event.player.getActiveEffects().contains(Effects.MOVEMENT_SPEED)) {
			System.out.println("chocmilkActive is active!");
			chocmilkActive = true;
		}
		*/
		//System.out.println(event.player.getActiveEffects());
		//System.out.println(event.player.getSpeed());
		if((event.player.getSpeed() > 0.11 && event.player.getSpeed() < 0.19)) {
			System.out.println("chocmilkActive is active!");
			chocmilkActive = true;
			tripped = true;
		}
		else if(event.player.getSpeed() > 0.19) {
			System.out.println("eccmilkActive is active!");
			eccmilkActive = true;
			tripped = true;
		}
		
		if(chocmilkActive) {
			//System.out.println(event.player.getArmorSlots().toString());
			//Iterable<ItemStack> x = event.player.getArmorSlots();
			//if(event.player.getArmorSlots()[3] == "1 air") {
				//event.player.inventory.add(1, new ItemStack(Items.LEATHER_HELMET));
				event.player.inventory.setItem(39, new ItemStack(Items.LEATHER_HELMET));
			//}
			//if(event.player.inventory.getArmor(1) == null) {
				event.player.inventory.setItem(38, new ItemStack(Items.LEATHER_CHESTPLATE));
			//}
			//if(event.player.inventory.getArmor(2) == null) {
				event.player.inventory.setItem(37, new ItemStack(Items.LEATHER_LEGGINGS));
			//}
			//if(event.player.inventory.getArmor(3) == null) {
				event.player.inventory.setItem(36, new ItemStack(Items.LEATHER_BOOTS));
			//}
		}
		else if(eccmilkActive) {
			//if(event.player.inventory.getArmor(0) == null) {
				event.player.inventory.setItem(39, new ItemStack(Items.NETHERITE_HELMET));
			//}
			//if(event.player.inventory.getArmor(1) == null) {
				event.player.inventory.setItem(38, new ItemStack(Items.NETHERITE_CHESTPLATE));
			//}
			//if(event.player.inventory.getArmor(2) == null) {
				event.player.inventory.setItem(37, new ItemStack(Items.NETHERITE_LEGGINGS));
			//}
			//if(event.player.inventory.getArmor(3) == null) {
				event.player.inventory.setItem(36, new ItemStack(Items.NETHERITE_BOOTS));
			//}
		}
	
		if((chocmilkActive == false) && (eccmilkActive == false) && (tripped == true)) {
			event.player.inventory.setItem(39, new ItemStack(Items.AIR));
			event.player.inventory.setItem(38, new ItemStack(Items.AIR));
			event.player.inventory.setItem(37, new ItemStack(Items.AIR));
			event.player.inventory.setItem(36, new ItemStack(Items.AIR));
			tripped = false;
		}
	}
}

package com.choccymilk.choccymilkmod.core.init;

import com.choccymilk.choccymilkmod.choccymilk;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class iteminit {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, choccymilk.modid);

	public static final RegistryObject<Item> chocmilk = ITEMS.register("chocolate_milk", ()->new Item(new Item.Properties().tab(ItemGroup.TAB_MISC).food(foodinit.choc_milk_settings)));

	public static final RegistryObject<Item> eccmilk = ITEMS.register("ecc_milk", ()->new Item(new Item.Properties().tab(ItemGroup.TAB_MISC).food(foodinit.ecc_milk_settings)));
}

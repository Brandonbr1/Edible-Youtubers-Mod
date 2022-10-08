package com.jerios.yteat.init;

import com.jerios.yteat.ExampleMod;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
	
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,ExampleMod.MOD_ID);

	public static final RegistryObject<Item> SUPERGIRLYGAER = ITEMS.register("supergrilygamer",
			() -> new Item(new Item.Properties().group(null).food(FoodInit.GIRLYGAMERFOOD)));
	
	public static final RegistryObject<Item> DANTDM = ITEMS.register("dantdm",
			() -> new Item(new Item.Properties().group(null).food(FoodInit.DANTDMFOOD)));
	
	public static final RegistryObject<Item> POPULARRMOS = ITEMS.register("popularrmos",
			() -> new Item(new Item.Properties().group(null).food(FoodInit.POPULARMMOS)));
	
	public static final RegistryObject<Item> PRESTONPLAYZ = ITEMS.register("preston_playz",
			() -> new Item(new Item.Properties().group(null).food(FoodInit.PRESTONBUILDER)));
	
	public static final RegistryObject<Item> SKYDOESMC = ITEMS.register("skydoesminecraft",
			() -> new Item(new Item.Properties().group(null).food(FoodInit.SKYDOESMINECRAFTBUILDER)));
	
	public static final RegistryObject<Item> COLBANATOR = ITEMS.register("colbantor",
			() -> new Item(new Item.Properties().group(null).food(FoodInit.COLBANATORBUILDER)));
	
	public static final RegistryObject<Item> VOX = ITEMS.register("vox",
			() -> new Item(new Item.Properties().group(null).food(FoodInit.VOXBUILDER)));
	
	public static final RegistryObject<Item> DREAM = ITEMS.register("dream",
			() -> new Item(new Item.Properties().group(null).food(FoodInit.DREAM)));
	
	public static final RegistryObject<Item> SSUNDE = ITEMS.register("ssunde",
			() -> new Item(new Item.Properties().group(null).food(FoodInit.SSUNDEEATBUILDER)));
	
	public static final RegistryObject<Item> BAGE = ITEMS.register("bajancanidan",
			() -> new Item(new Item.Properties().group(null).food(FoodInit.BAGE)));

	public static final RegistryObject<Item> HUSTY = ITEMS.register("huskymudkits",
			() -> new Item(new Item.Properties().group(null).food(FoodInit.HUSKY)));

	public static final RegistryObject<Item> JEROME = ITEMS.register("jerome",
			() -> new Item(new Item.Properties().group(null).food(FoodInit.JEROME)));
	
}

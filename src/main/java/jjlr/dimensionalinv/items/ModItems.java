package jjlr.dimensionalinv.items;

import jjlr.dimensionalinv.references;
//Local imports
import jjlr.dimensionalinv.items.simpleItem;

//Minecraft imports
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

//Forge imports
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {
	
	public static simpleItem dimensionalBag = new simpleItem("dimensional_bag", references.MODID).setCreativeTab(CreativeTabs.MATERIALS);
	
	public static void register(IForgeRegistry<Item> registry) {
		registry.registerAll(
				
				dimensionalBag
		);
	}
	
	public static void registerModels() {
		
		dimensionalBag.registerItemModel();
	}
}

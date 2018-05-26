package jjlr.dimensionalinv;
/*
 * Dimensional Inventory 1.12(.x)
 * by jjlr
 * Created 5-20-2018 04:45 UTC
 * Last updated 5-20-2018 00:00 UTC
 */

//Local imports
import jjlr.dimensionalinv.references;
import jjlr.dimensionalinv.items.ModItems;
import jjlr.dimensionalinv.proxy.*;

//Minecraft imports
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
//Forge imports
import net.minecraftforge.event.RegistryEvent;
//  model registry event?
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;

//Apache imports
import org.apache.logging.log4j.Logger;

@Mod(modid = references.MODID, name = references.NAME, version = references.VERSION)
public class dimain {
	
	@Instance
	public static dimain instance;
	
	@SidedProxy(clientSide = references.CLIENT_PROXY, serverSide = references.COMMON_PROXY)
	public static commonProxy proxy;
	
	@Mod.EventBusSubscriber
	public static class RegistrationHandler{
		
		@SubscribeEvent
		public static void registerItems(RegistryEvent.Register<Item> event) {
			ModItems.register(event.getRegistry());
		}
		
		@SubscribeEvent
		public static void registerItem(ModelRegistryEvent event) {
			ModItems.registerModels();
		}
	}
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println(references.NAME + " is starting...");
	}
	
	@Mod.EventHandler
	public void Init(FMLInitializationEvent event) {
		
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		System.out.println(references.NAME + " started successfully...");
	}
}

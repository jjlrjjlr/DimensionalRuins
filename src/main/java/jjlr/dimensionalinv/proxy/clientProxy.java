package jjlr.dimensionalinv.proxy;

//Local imports
import jjlr.dimensionalinv.references;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

//Minecraft imports
import net.minecraft.item.Item;

//Forge imports
import net.minecraftforge.client.model.ModelLoader;
import net.minecraft.util.ResourceLocation;

public class clientProxy extends commonProxy {
	
	public void registerItemRenderer(Item item, int meta, String id) {
		
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(references.MODID + ":" + id, "inventory"));
	}
}

package jjlr.dimensionalinv.items;

//Local imports
import jjlr.dimensionalinv.dimain;

//Minecraft imports
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class simpleItem extends Item {
	
	protected String name;
	
	public simpleItem(String name, String modID) {
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(modID + name);
	}
	
	public void registerItemModel() {
		dimain.proxy.registerItemRenderer(this, 0 , name);
	}
	
	@Override
	public simpleItem setCreativeTab(CreativeTabs tab) {
		
		super.setCreativeTab(tab);
		return this;
	}
}

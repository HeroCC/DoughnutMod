package net.minecraft.src;
import java.util.Random;
public class mod_Doughnuts extends BaseMod
{
	/* Defines and adds the items */ 
	public static final Item DoughnutNormal = new ItemFood(500, 1, 1F, false).setItemName("Normal Doughnut");
	public static final Item Popcorn = new ItemFood(501, 3, 5F, false).setItemName("Popcorn");
	public static final Item Sprinkles = new Item(502).setItemName("Sprinkles");
	public static final Item DoughnutSprinkled = new ItemFood(503, 3, 3F, false).setItemName("Sprinkled Doughnut");
	public static final Item ChocolateBar = new ItemFood(504, 0, 3F, false).setItemName("Bar of Chocolate");
	public static final Item DoughnutChocolate = new ItemFood(505, 3, 3F, false).setItemName("Chocolate Doughnut");
	public static final Item Taco = new ItemFood(506, 3, 3F, false).setItemName("Taco");

public void load()
{
		/* Secret items */
	{
		/*Tacos!*/
		{
			Popcorn.iconIndex = ModLoader.addOverride("/gui/items.png", "/herocc/Doughnuts/Taco.png");
			
			/* Adds Recipe */
			ModLoader.addRecipe( new ItemStack( Popcorn, 1), new Object [] {
				"XXX", "WWW", "WWW", Character.valueOf('W'), Item.wheat, Character.valueOf('X'), Item.seeds, Character.valueOf('B'), Item.ingotGold,
				});
			
			/* Name we see */
			ModLoader.addName(Taco, "Taco");		
		}
			/* PopCorn */
		{
			Popcorn.iconIndex = ModLoader.addOverride("/gui/items.png", "/herocc/Doughnuts/Popcorn.png");
			
			/* Adds Recipe */
			ModLoader.addRecipe( new ItemStack( Popcorn, 1), new Object [] {
				"BBB", "WWW", "XXX", Character.valueOf('W'), Item.wheat, Character.valueOf('X'), Item.seeds, Character.valueOf('B'), Item.ingotGold,
				});
			
			/* Name we see */
			ModLoader.addName(Popcorn, "Popcorn");
		}
	}
	/* Normal Doughnut*/
	{
	/* Adds the image */
	DoughnutNormal.iconIndex = ModLoader.addOverride("/gui/items.png", "/herocc/Doughnuts/NormalDoughnut.png");
	
	/* Adds Recipe */
	ModLoader.addRecipe( new ItemStack( DoughnutNormal, 2), new Object [] {
		"WXW", "WMW", "WWW", Character.valueOf('W'), Item.wheat, Character.valueOf('X'), Item.sugar, Character.valueOf('M'), Item.egg
		});
	
	/* Name we see */
	ModLoader.addName(DoughnutNormal, "Normal Doughnut");
	}
	/* Sprinkles */
	{
		/* Adds the image */
		Sprinkles.iconIndex = ModLoader.addOverride("/gui/items.png", "/herocc/Doughnuts/Sprinkles.png");
		
		/* Adds Recipe */
		ModLoader.addRecipe(new ItemStack(Sprinkles, 1), new Object [] {"RBW", Character.valueOf('R'), new ItemStack(Item.dyePowder, 1, 1), 
			Character.valueOf('B'), new ItemStack(Item.dyePowder, 1, 4),
			Character.valueOf('W'), new ItemStack(Item.dyePowder, 1, 15)});
		
		/* Name we see */
		ModLoader.addName(Sprinkles, "Sprinkles");
	}
		/*Sprinkled Doughnut*/
		{
		/* Adds the image */
		DoughnutSprinkled.iconIndex = ModLoader.addOverride("/gui/items.png", "/herocc/Doughnuts/SprinkledDoughnut.png");
		
		/* Adds Recipe */
		ModLoader.addRecipe(new ItemStack(DoughnutSprinkled, 1), new Object [] {
			"  S", "  D", Character.valueOf('D'), DoughnutNormal, Character.valueOf('S'), Sprinkles});
		
		/* Name we see */
		ModLoader.addName(DoughnutSprinkled, "Sprinkled Doughnut");
		{
		}
		/* Chocolate Bar*/
		{
		/* Adds the image */
		ChocolateBar.iconIndex = ModLoader.addOverride("/gui/items.png", "/herocc/Doughnuts/ChocolateBar.png");
		
		/* Adds Recipe */
		ModLoader.addRecipe( new ItemStack( ChocolateBar, 2), new Object [] {
			"  B", "  M", "  S", Character.valueOf('B'), new ItemStack(Item.dyePowder, 1, 0), Character.valueOf('M'), Item.bucketMilk, Character.valueOf('S'), Item.sugar
			});
		
		/* Name we see */
		ModLoader.addName(ChocolateBar, "Bar of Chocolate");
		}
		/* Chocolate Doughnut*/
		{
		/* Adds the image */
		DoughnutChocolate.iconIndex = ModLoader.addOverride("/gui/items.png", "/herocc/Doughnuts/ChocolateDoughnut.png");
		
		/* Adds Recipe */
		ModLoader.addShapelessRecipe(new ItemStack(DoughnutChocolate, 1), new Object[]{ ChocolateBar, DoughnutNormal });
		
		/* Name we see */
		ModLoader.addName(DoughnutChocolate, "Chocolate Doughnut");
		}
	}
}
public String getVersion()
{
	return "Mod: 1.2, MC: 1.3.2";
}
}
/* � HeroCC */
/* If you are seeing this you must want to code for Doughnut Mod. You may only distribute this on your forked GitHub Resposotory */
/* This is whatever I save so it may not always work */

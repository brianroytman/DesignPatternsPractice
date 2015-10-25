
public class MainOrderCoffee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Order 3 different drinks
		
		//Order espresso with peppermint flavoring drink
		BeverageComponent espressoBeverage = new Espresso();
		espressoBeverage = new Peppermint(espressoBeverage);
		System.out.println(espressoBeverage.getDescription() + " $" + espressoBeverage.cost());
		
		
		//Order House Blend with Mocha, Peppermint, and Whip cream
		BeverageComponent houseBeverage = new HouseBlend();
		houseBeverage = new Mocha(houseBeverage);
		houseBeverage = new Peppermint(houseBeverage);
		houseBeverage = new WhipCream(houseBeverage);
		System.out.println(houseBeverage.getDescription() + " $" + houseBeverage.cost());
		
		
		//Order Light Roast with Pumpkin Spice
		BeverageComponent pumpkinLightBev = new LightRoast();
		pumpkinLightBev = new PumpkinSpice(pumpkinLightBev);
		System.out.println(pumpkinLightBev.getDescription() + " $" + pumpkinLightBev.cost());
		
		
	}

}

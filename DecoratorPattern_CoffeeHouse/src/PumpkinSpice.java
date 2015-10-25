
public class PumpkinSpice extends FlavorAndCondimentDecorator {
	BeverageComponent beverage;
	
	public PumpkinSpice (BeverageComponent takeBeverage) {
		this.beverage = takeBeverage;
	}
	
	public String getDescription() {
		return beverage.getDescription() + "Pumpkin Spice ";
	}
	
	public double cost() {
		return beverage.cost() + 0.25;
	}
}

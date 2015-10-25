
public class Mocha extends FlavorAndCondimentDecorator {
	BeverageComponent beverage;
	
	public Mocha(BeverageComponent takeBeverage) {
		this.beverage = takeBeverage;
	}
	
	
	public String getDescription() {
		return beverage.getDescription() + " Mocha ";
	}
	
	
	public double cost() {
		return beverage.cost() + 0.25;
	}
	
}

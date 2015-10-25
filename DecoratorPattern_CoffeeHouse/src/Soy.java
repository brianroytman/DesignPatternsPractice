
public class Soy extends FlavorAndCondimentDecorator {
	BeverageComponent beverage;
	
	public Soy(BeverageComponent takeBeverage) {
		this.beverage = takeBeverage;
	}
	
	public String getDescription() {
		return beverage.getDescription() + "Soy";
	}
	
	public double cost() {
		return beverage.cost() + 0.50;
	}
}

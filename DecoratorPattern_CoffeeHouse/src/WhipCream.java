
public class WhipCream extends FlavorAndCondimentDecorator {
	BeverageComponent beverage;
	
	public WhipCream(BeverageComponent takeBeverage) {
		this.beverage = takeBeverage;
	}
	
	public String getDescription() {
		return beverage.getDescription() + "Whip Cream ";
	}
	
	public double cost() {
		return beverage.cost() + 0.10;
	}
}

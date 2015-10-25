
public class Peppermint extends FlavorAndCondimentDecorator {
    BeverageComponent beverage;
	
	public Peppermint(BeverageComponent takeBeverage) {
		this.beverage = takeBeverage;
	}
	
	public String getDescription() {
		return beverage.getDescription() + "Peppermint ";
	}
	
	public double cost() {
		return beverage.cost() + 0.25;
	}
}

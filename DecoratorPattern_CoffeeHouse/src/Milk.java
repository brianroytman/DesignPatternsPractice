
public class Milk extends FlavorAndCondimentDecorator {
	BeverageComponent beverage;
	
	public Milk() {
		this.beverage = beverage;
	}
	
	public String getDescription() {
		return beverage.getDescription() + " Milk";
	}
	
	public double cost() {
		return beverage.cost() + 0.25;
	}
}

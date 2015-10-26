
public class Food {
	double price;
	
	public Food(double item) {
		price = item;
	}
	
	public double getPrice() {
		return price;
	}
	
	public double accept(Visitor visitor) {
		return visitor.visit(this);
	}
	
}

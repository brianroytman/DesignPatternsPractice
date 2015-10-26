
public class Beer implements Visitable {
	double price;
	
	public Beer(double item) {
		price = item;
	}
	
	public double getPrice() {
		return price;
	}
	
	public double accept(Visitor visitor) {
		return visitor.visit(this);
	}

}

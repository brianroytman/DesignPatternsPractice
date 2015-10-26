import java.text.DecimalFormat;

public class ConcreteTaxVisitor implements Visitor {
	
	DecimalFormat df = new DecimalFormat("#.##");
	
	@Override
	public double visit(Beer beerItem) {
		// TODO Auto-generated method stub
		System.out.println("Beer: Price With Tax");
		return Double.parseDouble(df.format((beerItem.getPrice() * 0.18) + beerItem.getPrice()));
	}

	@Override
	public double visit(Tobacco tobaccoItem) {
		// TODO Auto-generated method stub
		System.out.println("Tobacco: Price With Tax");
		return Double.parseDouble(df.format((tobaccoItem.getPrice() * 0.32) + tobaccoItem.getPrice()));
	}

	@Override
	public double visit(Food foodItem) {
		// TODO Auto-generated method stub
		System.out.println("Food: Price With Tax");
		return Double.parseDouble(df.format((foodItem.getPrice() * 0.08) + foodItem.getPrice()));
	}
	
}

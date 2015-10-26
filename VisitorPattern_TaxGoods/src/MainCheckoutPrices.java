
public class MainCheckoutPrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcreteTaxVisitor taxCalc = new ConcreteTaxVisitor();
		
		Food bread = new Food(2.99);
		Beer redStripe = new Beer(9.99);
		Tobacco cubanCigars = new Tobacco(50.99);
		
		System.out.println(bread.accept(taxCalc) + "\n");
		System.out.println(redStripe.accept(taxCalc) + "\n");
		System.out.println(cubanCigars.accept(taxCalc) + "\n");

	}

}

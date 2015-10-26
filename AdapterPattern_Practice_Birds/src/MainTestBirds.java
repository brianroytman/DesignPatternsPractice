
public class MainTestBirds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcreteDuck donald = new ConcreteDuck();
		ConcreteTurkey tom = new ConcreteTurkey();
		
		System.out.println("My name is Donald the duck and I can yell... ");
		donald.quack();
		System.out.println("Look! ");
		donald.fly();
		
		System.out.println("My name is Tom the Turkey and I can yell... ");
		tom.gobble();
		System.out.println("Look! ");
		tom.fly();
		
		Duck terry = new TurkeyAdapter(tom);
		
		testDuck(terry);
	}
	
	static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}

}

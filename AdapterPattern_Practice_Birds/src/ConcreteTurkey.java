
public class ConcreteTurkey implements Turkey{

	@Override
	public void gobble() {
		System.out.println("Gobble gobble! I hate Thanksgiving.");
	}

	@Override
	public void fly() {
		System.out.println("I'm flying...but I can't fly that far. At least not as far as a duck.");
	}

}

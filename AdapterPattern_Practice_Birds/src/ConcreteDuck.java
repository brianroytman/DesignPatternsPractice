
public class ConcreteDuck implements Duck {

	@Override
	public void quack() {
		System.out.println("Quack quack!");
	}

	@Override
	public void fly() {
		System.out.println("I'm flying! Please don't shoot me down. \n");
	}

}

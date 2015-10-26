// The visitor pattern is used when you have to perform
// the same action on many objects of different types

public interface Visitor {
	public double visit(Beer beer);
	public double visit(Tobacco tobacco);
	public double visit(Food food);
}

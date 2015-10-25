
public abstract class BeverageComponent {
	String description = "Unknown beverage";
	
	public String getDescription() {
		return description;
	};
	
	public abstract double cost();
	
}

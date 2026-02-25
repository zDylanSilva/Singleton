package Machinery;

public class Boiler {
	
	public static Boiler instance;
	public Boolean resistance = false;
	public Boolean full = false;
	
	//Private constructor avoids any new instance attempt
	private Boiler() {
		
	}
	
	public static Boiler getInstance() {
		if(instance == null)
			instance = new Boiler();
		return instance;
	}
	
	
	/* Methods are given String return types purely for the example's sake
	 * they are made this way to show the right exit(Success) and the wrong exit(Failed),
	 * they should be void type since it allows pure instruction management and no need for
	 * additional returns.
	 */
	
	
	public String addIngredients() {
		if(full == false && resistance == false) {
			// Ingredients get added, the Boiler gets full
			full= true;
			return("Filling container...");
		}
		return("Ingredients are already added, continue the process");
		
	}
	
	public String startMixing() {
		if(full == true && resistance == false) {
		// The next two lines make sure that the variables get updated and other methods can be called
			full=false; // Changes the full state even tho it really shouldn't be but works for method consistency
			resistance=true;
			return("Starting mixing process...");
		}
		return("Make sure to add the ingredients else if already mixed continue the process");
	}
	
	public String emptyContainer() {
		if(full == false && resistance == true) {
			resistance=false;
			return("Emptying container...");
		}
		return("Make sure the mixture is done");
	}

	
}


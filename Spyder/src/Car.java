//Varargs example


public class Car {

	private String model;
	private String[] features;
	// public Car(String model, String[] features) {

	public Car(String model, String... features) {
		super();
		this.model = model;
		this.features = features;
	}

	public void specs() {
		System.out.println("Features of " + model);
		for (String feature : features)
			System.out.println(feature);
	}

	public static void main(String args[]) {
		String[] altof = { "Power Steering", "Power Window", "Keyless Entry" };
		Car alto = new Car("Alto", altof);
		alto.specs();

		String[] jazzf = { "Keyless Start", "ABS", "Pano roof", "auto gears", "cruise" };
		Car jazz = new Car("Jazz", jazzf);
		jazz.specs();
	}
}

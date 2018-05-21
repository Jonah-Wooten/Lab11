
public class UsedCar extends Car {

	private double mileage;

	public UsedCar(String make, String model, int year, double price, double mileage) {
		super(make, model, year, price);
		this.mileage = mileage;
	}

	public UsedCar() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UsedCar(String make, String model, int year, double price) {
		super(make, model, year, price);
		// TODO Auto-generated constructor stub
	}

}

import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<UsedCar> carList = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		String cont = "y";

		carList.add((UsedCar) new Car("Ford", "F150", 2017, 80000));
		carList.add((UsedCar) new UsedCar("Ford", "Mustang", 1992, 600, 200000));
		carList.add((UsedCar) new UsedCar("Dodge", "Ram", 2018, 20000));
		carList.add((UsedCar) new UsedCar("Dodge", "Ram", 2016, 24000));
		carList.add((UsedCar) new UsedCar("Chrysler", "300", 2018, 5000));
		carList.add((UsedCar) new UsedCar("Chrysler", "300", 2017, 9000));

		while (cont.equalsIgnoreCase("y")) {
			System.out.println("Please gather all you car info");

			String make = Validator.getString(scan, "Enter Model");

			String model = Validator.getString(scan, "Enter Model");

			int year = Validator.getInt(scan, "Enter a year");

			double price = Validator.getDouble(scan, "Enter a price");
			carList.add(new UsedCar(make, model, year, price));
			cont = Validator.getString(scan, "Would you like to continune? Y/N");
		}

		for (UsedCar temp : carList) {
			String display = temp.toString();
			System.out.println(display);
		}

	}

}

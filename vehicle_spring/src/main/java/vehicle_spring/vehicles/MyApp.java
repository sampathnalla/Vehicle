package vehicle_spring.vehicles;

public class MyApp {

	public static void main(String[] args) {
		Vehicle vehicle=new Bus();
		String milage = vehicle.getMilage();
		System.out.println(milage);

	}

}

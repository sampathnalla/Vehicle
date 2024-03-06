package vehicle_spring.vehicles;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApp {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Vehicle vehicle = context.getBean("myVehicle", Vehicle.class);
		System.out.println(vehicle.getMilage());
	}

}

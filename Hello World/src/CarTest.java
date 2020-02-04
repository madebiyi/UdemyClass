import org.studyeasy.Car;

public class CarTest {

	public static void main(String[] args) {
		Car car = new Car("closed","on","seated",10);
		//car.setDoors("Closed");
		//car.setDriver("seated");
		//car.setEngine("on");
		//car.setSpeed(10);
		//car.run();
		System.out.println(car.run());
	}

}

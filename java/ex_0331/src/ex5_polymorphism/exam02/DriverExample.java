package ex5_polymorphism.exam02;

public class DriverExample {
	public static void main(String[] args) {
		Dirve drive = new Dirve ();
		drive.drive(new Vehicle());
		drive.drive(new Bus());
		drive.drive(new Taxi());

	}

}

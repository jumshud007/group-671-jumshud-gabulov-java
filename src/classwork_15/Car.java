package classwork_15;

public class Car implements IVehicle {
	@Override
	public void start() {
		System.out.println("Starting car");
	}

	@Override
	public void stop() {
		System.out.println("Stopping car");
	}
}

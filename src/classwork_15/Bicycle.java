package classwork_15;

public class Bicycle implements IVehicle {
	@Override
	public void start() {
		System.out.println("Starting bicycle");
	}

	@Override
	public void stop() {
		System.out.println("Stopping bicycle");
	}
}

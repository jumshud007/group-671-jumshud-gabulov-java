package homework_17;

public class Temperature {
	void fromFahrenheit(double c) {
		System.out.println(c * 9 / 5 + 32);
	}
	void fromCelsius(double f) {
		System.out.println(f * 5 / 9 - 32);
	}
	void fromKelvin(double f) {
		System.out.println(f - 273.15);
	}
	
}

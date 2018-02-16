package su.lyon.fr;

public class Car {
	public String carType;
	public String power;
	public String seats;
	public String windows;
	public String fuelType;
	public String breaks;
	public String engine;
	public String bodyStyle;
	
	public Car(String CarType) {
		carType = CarType;
	}
	
	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("--------------"+carType+"---------------------");
		stringBuilder.append("\nBody: " + bodyStyle);
		stringBuilder.append("\nPower : " + power);
		stringBuilder.append("\nEngine : " + engine);
		stringBuilder.append("\nBreaks : " + breaks);
		stringBuilder.append("\nSeats : " + seats);
		stringBuilder.append("\nWindows : " + windows);
		stringBuilder.append("\nFuel Type : " + fuelType);
		
		return stringBuilder.toString();		
	}
}

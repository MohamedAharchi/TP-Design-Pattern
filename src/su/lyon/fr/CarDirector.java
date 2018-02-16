package su.lyon.fr;

public class CarDirector {
	private CarBuilder carBuilder;
	
	public CarDirector(CarBuilder CarBuilder) {
		carBuilder = CarBuilder;
	}
	
	public void build() {
		carBuilder.buildBodyStyle();
		carBuilder.buildPower();
		carBuilder.buildEngine();
		carBuilder.buildBreaks();
		carBuilder.buildSeats();
		carBuilder.buildWindows();
		carBuilder.buildFuelType();
	}
}

package su.lyon.fr;

public class SportsCarBuilder implements CarBuilder {

	private final Car car = new Car("SPORTS");
	
	@Override
	public void buildBodyStyle() {
		car.bodyStyle = "External dimensions: overall length (inches): 192.3, overall width (inches): 75.5, "
				+ "overall height (inches): 54.2, wheelbase (inches): 112.3, front track (inches): 63.7,"
				+ "real track (inches): 64.1 and curb to curb turning circle (feet): 37.7";
	}

	@Override
	public void buildPower() {
		car.power = "323 hp @ 6,800 rpm; 278 ft lb of torque @ 4,800 rpm";
	}

	@Override
	public void buildEngine() {
		car.engine = "3.6L Duramax V 6 DOHC and variable valve timing";
	}

	@Override
	public void buildBreaks() {
		car.breaks = "Four-wheel disc brakes: two ventilated. Electronic brake distribution. StabiliTrak stability control";
	}

	@Override
	public void buildSeats() {
		car.seats = "Driver sport front seat with one power adjustments manual height, front passenger seat sports front seat with one power adjustments";
	}

	@Override
	public void buildWindows() {
		car.windows = "Front windows with one-touch on two windows";
	}

	@Override
	public void buildFuelType() {
		car.fuelType = "Gasoline 17 MPG city, 28 MPG highway, 20 MPG combined and 380 mi. range";
	}

	@Override
	public Car getCar() {
		return car;
	}

}

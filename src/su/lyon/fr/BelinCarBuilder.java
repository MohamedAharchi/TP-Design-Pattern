package su.lyon.fr;

public class BelinCarBuilder implements CarBuilder {

	private final Car car = new Car("BELIN");
	
	@Override
	public void buildBodyStyle() {
		car.bodyStyle = "External dimensions: overall length (inches): 180.9, overall width (inches): 73.2, "
				+ "overall height (inches): 65.7, wheelbase (inches): 118.9, front track (inches): 61.3,"
				+ "real track (inches): 69.5 and curb to curb turning circle (feet): 37.5";
	}

	@Override
	public void buildPower() {
		car.power = "297 hp @ 6,600 rpm; 273 ft lb of torque @ 4,300 rpm";
	}

	@Override
	public void buildEngine() {
		car.engine = "3.6L Duramax V 6 DOHC";
	}

	@Override
	public void buildBreaks() {
		car.breaks = "Four-wheel disc brakes: two ventilated. Electronic brake distribution";
	}

	@Override
	public void buildSeats() {
		car.seats = "Front seat center armrest.Rear seat center armrest.Split-folding rear seats";
	}

	@Override
	public void buildWindows() {
		car.windows = "Laminated side windows.Fixed rear window with defroster";
	}

	@Override
	public void buildFuelType() {
		car.fuelType = "Gasoline 18 MPG city, 27 MPG highway, 21 MPG combined and 417 mi. range";
	}

	@Override
	public Car getCar() {
		return car;
	}
}

package pattern.creational.builder;

/** Created by ALEXuH on 2019/3/29 */
public class CarBuilder implements Builder {

  private Type type;
  private int seats;
  private Engine engine;
  private Transimission transimission;
  private TripComputer tripComputer;
  private GPSNavigator gpsNavigator;

  @Override
  public void setType(Type type) {
    this.type = type;
  }

  @Override
  public void setSeats(int seats) {
    this.seats = seats;
  }

  @Override
  public void setEngine(Engine engine) {
    this.engine = engine;
  }

  @Override
  public void setTransmission(Transimission transimission) {
    this.transimission = transimission;
  }

  @Override
  public void setTripComputer(TripComputer tripComputer) {
    this.tripComputer = tripComputer;
  }

  @Override
  public void setGPSNavigator(GPSNavigator gpsNavigator) {
    this.gpsNavigator = gpsNavigator;
  }

  public Car getResult() {
    return new Car(
        this.type,
        this.seats,
        this.engine,
        this.transimission,
        this.tripComputer,
        this.gpsNavigator);
  }
}

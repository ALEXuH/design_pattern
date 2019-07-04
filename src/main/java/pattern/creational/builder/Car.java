package pattern.creational.builder;

/** Created by ALEXuH on 2019/3/29 */
public class Car {

  private Type type;
  private int seats;
  private Engine engine;
  private Transimission transimission;
  private TripComputer tripComputer;
  private GPSNavigator gpsNavigator;
  private double fuel = 0;

  public Car(
      Type type,
      int seats,
      Engine engine,
      Transimission transimission,
      TripComputer tripComputer,
      GPSNavigator gpsNavigator) {
    this.type = type;
    this.seats = seats;
    this.engine = engine;
    this.transimission = transimission;
    this.tripComputer = tripComputer;
    this.gpsNavigator = gpsNavigator;
  }

  public Type getType() {
    return type;
  }

  public int getSeats() {
    return seats;
  }

  public void setFuel(double fuel) {
    this.fuel = fuel;
  }

  public Engine getEngine() {
    return engine;
  }

  public Transimission getTransimission() {
    return transimission;
  }

  public TripComputer getTripComputer() {
    return tripComputer;
  }

  public GPSNavigator getGpsNavigator() {
    return gpsNavigator;
  }
}

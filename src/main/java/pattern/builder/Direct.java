package pattern.builder;

/** Created by ALEXuH on 2019/3/29 */
public class Direct {

  public static void constructSportsCar(Builder builder) {
    builder.setType(Type.SPORTS_CAR);
    builder.setSeats(3);
    builder.setEngine(new Engine());
    builder.setTransmission(Transimission.AUTOMIC);
    builder.setTripComputer(new TripComputer());
    builder.setGPSNavigator(new GPSNavigator());
  }

  public static void constructSUVCar(Builder builder) {
    builder.setType(Type.SUV);
    builder.setEngine(new Engine());
    builder.setSeats(3);
    builder.setTripComputer(new TripComputer());
    builder.setTransmission(Transimission.AUTOMIC);
    builder.setGPSNavigator(new GPSNavigator());
  }
}

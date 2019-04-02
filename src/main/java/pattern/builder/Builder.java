package pattern.builder;

/** Created by ALEXuH on 2019/3/29  建造者模式: 构建复杂对象时使用*/
public interface Builder {
  void setType(Type type);

  void setSeats(int seats);

  void setEngine(Engine engine);

  void setTransmission(Transimission transimission);

  void setTripComputer(TripComputer tripComputer);

  void setGPSNavigator(GPSNavigator gpsNavigator);
}

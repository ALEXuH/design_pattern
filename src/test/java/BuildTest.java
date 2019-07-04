import pattern.creational.builder.Car;
import pattern.creational.builder.CarBuilder;
import pattern.creational.builder.Direct;

/** Created by ALEXuH on 2019/3/29 */
public class BuildTest {

  public static void main(String[] args) {
    CarBuilder builder = new CarBuilder();
    Direct.constructSUVCar(builder);
    Car car = builder.getResult();
    System.out.println(car.getSeats());
    car.setFuel(10.00);
    System.out.println(car.getGpsNavigator());
    System.out.println(builder);
  }
}

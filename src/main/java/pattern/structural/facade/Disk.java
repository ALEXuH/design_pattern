package pattern.structural.facade;

/** Created by ALEXuH on 2018/12/25 */
public class Disk implements Behavior {
  @Override
  public void start() {
    System.out.println("disk start");
  }

  @Override
  public void stop() {
    System.out.println("disk stop");
  }
}

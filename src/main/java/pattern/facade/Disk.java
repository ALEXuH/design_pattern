package pattern.facade;

/** Created by ALEXuH on 2018/12/25 */
public class Disk implements Behavior {
  public void start() {
    System.out.println("disk start");
  }

  public void stop() {
    System.out.println("disk stop");
  }
}

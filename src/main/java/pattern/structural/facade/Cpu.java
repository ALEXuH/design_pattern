package pattern.structural.facade;

/** Created by ALEXuH on 2018/12/25 */
public class Cpu implements Behavior {

  public void start() {
    System.out.println("cpu start");
  }

  public void stop() {
    System.out.println("cpu stop");
  }
}

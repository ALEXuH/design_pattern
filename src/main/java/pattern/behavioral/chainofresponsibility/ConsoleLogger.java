package pattern.behavioral.chainofresponsibility;

/** Created by ALEXuH on 2019/5/10 0010 */
public class ConsoleLogger extends AbstractLogger {

  public ConsoleLogger(int level) {
    this.level = level;
  }

  @Override
  public void write(String message) {
    System.out.println("console log: " + message);
  }
}

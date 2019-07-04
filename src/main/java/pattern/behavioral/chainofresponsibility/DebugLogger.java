package pattern.behavioral.chainofresponsibility;

/** Created by ALEXuH on 2019/5/10 0010 */
public class DebugLogger extends AbstractLogger {

  public DebugLogger(int level) {
    this.level = level;
  }

  @Override
  public void write(String message) {
    System.out.println("Debug log:" + message);
  }
}

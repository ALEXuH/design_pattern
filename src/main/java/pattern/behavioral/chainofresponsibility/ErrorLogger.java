package pattern.behavioral.chainofresponsibility;

/** Created by ALEXuH on 2019/5/10 0010 */
public class ErrorLogger extends AbstractLogger {

  public ErrorLogger(int level) {
    this.level = level;
  }

  @Override
  public void write(String message) {
    System.out.println("Error Logger: " + message);
  }
}

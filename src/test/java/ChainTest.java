import pattern.chainofresponsibility.AbstractLogger;
import pattern.chainofresponsibility.ConsoleLogger;
import pattern.chainofresponsibility.DebugLogger;
import pattern.chainofresponsibility.ErrorLogger;

/** Created by ALEXuH on 2019/5/10 0010 */
public class ChainTest {

  public static void main(String[] args) {
    AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
    AbstractLogger debugLogger = new DebugLogger(AbstractLogger.DEBUG);
    AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

    errorLogger.setNextLogger(debugLogger);
    debugLogger.setNextLogger(consoleLogger);

    AbstractLogger logChain = errorLogger;
    logChain.log(AbstractLogger.ERROR, "this is an error message");
    logChain.log(AbstractLogger.DEBUG, "this is an debug message");
    logChain.log(AbstractLogger.INFO, "this is an info message");
  }
}

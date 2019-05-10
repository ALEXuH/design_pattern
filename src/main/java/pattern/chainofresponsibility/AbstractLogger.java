package pattern.chainofresponsibility;

/** Created by ALEXuH on 2019/5/10 0010 责任链模式： 如果一个对象不能处理一个请求则传给下一个对象。解耦发送者和请求者。处理消息时使用[拦截器] */
public abstract class AbstractLogger {

  public static int INFO = 1;
  public static int DEBUG = 2;
  public static int ERROR = 3;
  protected int level;

  protected AbstractLogger nextLogger;

  public void setNextLogger(AbstractLogger logger) {
    this.nextLogger = logger;
  }

  public void log(int level, String message) {
    if (this.level <= level) {
      write(message);
    } else {
      if (null != nextLogger) {
        nextLogger.log(level, message);
      }
    }
  }

  public void write(String message) {}
}

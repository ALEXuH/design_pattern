package pattern.creational.singleton;

/** Created by ALEXuH on 2019/3/28 */
public class SingletonSecond {

  private static SingletonSecond instance = null;

  private SingletonSecond() {}

  public static synchronized SingletonSecond getInstance() {
    if (null == instance) {
      instance = new SingletonSecond();
    }
    return instance;
  }
}

package pattern.creational.singleton;

/** Created by ALEXuH on 2019/3/28 */
public class InnerClassSingleton {

  private InnerClassSingleton() {}

  private static class InnerInstance {
    private static InnerClassSingleton instance = new InnerClassSingleton();
  }

  public static InnerClassSingleton getInstance() {
    return InnerInstance.instance;
  }
}

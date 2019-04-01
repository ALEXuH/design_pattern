package pattern.proxy;

/** Created by ALEXuH on 2018/12/25 */
public class DataSource implements Source {

  @Override
  public void method1() {
    System.out.println("method1");
  }

  @Override
  public void method2() {
    System.out.println("method2");
  }
}

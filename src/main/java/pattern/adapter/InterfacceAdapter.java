package pattern.adapter;

/** Created by ALEXuH on 2018/12/25 接口适配器：实现类与抽象接口打交道，解决需要实现大量没有用到的接口 */
public abstract class InterfacceAdapter implements Sourceable {

  public void method1() {}

  public void method2() {}

  public void method3() {
    System.out.println("Method3");
  }
}

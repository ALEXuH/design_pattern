import pattern.adapter.*;

/** Created by ALEXuH on 2018/12/25 */
public class AdapterTest {

  public static void main(String[] args) {
    // 类的适配器模式
    Target tar = new Adapter();
    tar.sayHello();
    tar.sayThanks();

    // 对象的适配器模式
    Target adp = new Adapter1(new Source());
    adp.sayThanks();
    adp.sayHello();

    // 接口的适配器模式
    Sourceable able = new InterfaceAdapter2();
    able.method1();
    able.method2();
    able.method3();
  }
}

package pattern.structural.adapter;

/** Created by ALEXuH on 2018/12/25 对象适配器：解决类和对象的兼容性 */
public class Adapter1 implements Target {

  private Source source;

  public Adapter1(Source source) {
    super();
    this.source = source;
  }

  @Override
  public void sayHello() {
    source.sayHello();
  }

  @Override
  public void sayThanks() {
    System.out.println(" sys thanks");
  }
}

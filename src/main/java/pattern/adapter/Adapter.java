package pattern.adapter;

/** Created by ALEXuH on 2018/12/25 类的适配器： 解决类之间的兼容性 */
public class Adapter extends Source implements Target {

  public void sayThanks() {
    System.out.println("I am say thanks");
  }
}

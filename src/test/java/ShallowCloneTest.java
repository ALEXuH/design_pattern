import pattern.creational.Prototype.Circle;
import pattern.creational.Prototype.ShallowClone;

/** Created by ALEXuH on 2019/5/9 0009 */
public class ShallowCloneTest {

  public static void main(String[] args) {
    // 浅克隆
    try {
      ShallowClone sha = new ShallowClone();
      ShallowClone shaClone = sha.clone();
      System.out.println(sha == shaClone);
      System.out.println(sha.equals(shaClone));
    } catch (CloneNotSupportedException e) {
      System.out.println(e.getMessage());
    }

    // 深克隆
    Circle cir = new Circle();
    cir.x = 1;
    cir.y = 90;
    cir.color = "red";
    cir.radius = 10;
    System.out.println(cir.y);

    Circle cir1 = (Circle) cir.clone();
    System.out.println(cir.equals(cir1));
    System.out.println("cir1：" + cir.hashCode() + " | cir2: " + cir1.hashCode());
  }
}

package pattern.creational.Prototype;

/** Created by ALEXuH on 2019/5/9 0009 深克隆通过构造参数传入本对象实现 */
public abstract class Shape {

  public int x;
  public int y;
  public String color;

  public Shape() {}

  public Shape(Shape target) {
    if (target != null) {
      x = target.x;
      y = target.y;
      color = target.color;
    }
  }

  public abstract Shape clone();

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof Shape)) return false;
    Shape sha2 = (Shape) obj;
    return sha2.x == x && sha2.y == y && sha2.color.equals(color);
  }
}

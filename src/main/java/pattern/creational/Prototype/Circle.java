package pattern.creational.Prototype;

/** Created by ALEXuH on 2019/5/9 0009 */
public class Circle extends Shape {

  public int radius;

  public Circle() {}

  public Circle(Circle target) {
    super(target);
    if (target != null) {
      radius = target.radius;
    }
  }

  @Override
  public Shape clone() {
    return new Circle(this);
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof Circle) || !super.equals(obj)) return false;
    Circle sha2 = (Circle) obj;
    return sha2.radius == radius;
  }
}

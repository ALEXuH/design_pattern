package pattern.creational.Prototype;

/** Created by ALEXuH on 2019/5/9 0009 */
public class Rectangle extends Shape {

  public int height;

  public int weight;

  public Rectangle() {}

  public Rectangle(Rectangle target) {
    super(target);
    if (target != null) {
      height = target.height;
      weight = target.weight;
    }
  }

  @Override
  public Shape clone() {
    return new Rectangle(this);
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof Rectangle) || super.equals(obj)) return false;
    Rectangle rec = (Rectangle) obj;
    return rec.weight == weight && rec.height == height;
  }
}

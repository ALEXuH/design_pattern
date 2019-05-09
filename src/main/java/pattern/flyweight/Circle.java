package pattern.flyweight;

/** Created by ALEXuH on 2019/5/9 0009 */
public class Circle implements Shape {

  private String color;
  private Double x;
  private Double y;

  public Circle(String color) {
    this.color = color;
  }

  @Override
  public void draw() {
    System.out.println(this.toString());
  }

  @Override
  public String toString() {
    return "Circle{" + "color='" + color + '\'' + ", x=" + x + ", y=" + y + '}';
  }

  public void setX(double x) {
    this.x = x;
  }

  public void setY(double y) {
    this.y = y;
  }
}

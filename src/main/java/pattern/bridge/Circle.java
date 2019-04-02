package pattern.bridge;

/** Created by ALEXuH on 2019/4/2   桥接模式: 将类的功能层次和实现层次分离,使二者可以独立的变化，在两者之间搭建桥梁，实现桥接*/
public class Circle extends Shape {

  private int x, y, radius;

  public Circle(int radius, int x, int y, DrawAPI drawAPI) {
    super(drawAPI);
    this.x = x;
    this.y = y;
    this.radius = radius;
  }

  @Override
  public void draw() {
    drawAPI.drawCircle(radius, x, y);
  }
}

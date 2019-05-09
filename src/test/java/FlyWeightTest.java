import pattern.flyweight.Circle;
import pattern.flyweight.Shape;
import pattern.flyweight.ShapeFactory;

/** Created by ALEXuH on 2019/5/9 0009 */
public class FlyWeightTest {

  public static String[] colors = {"red", "blue", "black"};

  public static void main(String[] args) {
    for (String c : colors) {
      ShapeFactory.getShape(c);
    }
    for (int i = 0; i < 20; i++) {
      Circle cir = (Circle) ShapeFactory.getShape(getColor());
      cir.setX(Math.random() * 100);
      cir.setY(Math.random() * 100);
      cir.draw();
    }
  }

  private static String getColor() {
    return colors[(int) (Math.random() * colors.length)];
  }
}

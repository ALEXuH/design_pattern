package pattern.structural.flyweight;

import java.util.HashMap;

/**
 * Created by ALEXuH on 2019/5/9 0009
 * 享元模式：共享对象，利用之前已有的对象减少内存消耗。在有大量对象时，有可能会造成内存溢出，我们把其中共同的部分抽象出来，如果有相同的业务请求，直接返回在内存中已有的对象，避免重新创建
 */
public class ShapeFactory {

  private static final HashMap<String, Shape> map = new HashMap<>();

  public static Shape getShape(String color) {
    Circle cir = (Circle) map.get(color);
    if (null == cir) {
      cir = new Circle(color);
      map.put(color, cir);
    }
    return cir;
  }
}

import pattern.bridge.Circle;
import pattern.bridge.GreenCircle;
import pattern.bridge.RedCircle;
import pattern.bridge.Shape;

/**
 * Created by ALEXuH on 2019/4/2
 */
public class BridgePatternTest {

    public static void main(String[] args) {
        Shape redCircle = new Circle(100, 200, 10, new RedCircle());
        Shape greenCircle = new Circle(200, 100, 10, new GreenCircle());
        redCircle.draw();
        greenCircle.draw();
    }
}

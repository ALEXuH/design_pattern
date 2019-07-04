package pattern.structural.bridge;

/**
 * Created by ALEXuH on 2019/4/2
 */
public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("GREEN CIRCLE | radius: "+ radius + " | x: "+ x + "| y： "+y);
    }
}

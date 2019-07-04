package pattern.structural.bridge;

/**
 * Created by ALEXuH on 2019/4/2
 */
public abstract class Shape {

    protected DrawAPI drawAPI;

    protected  Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}

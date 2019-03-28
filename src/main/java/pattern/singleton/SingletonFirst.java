package pattern.singleton;

/**
 * Created by ALEXuH on 2019/3/28
 */
public class SingletonFirst {

    private static SingletonFirst instance = new SingletonFirst();

    private SingletonFirst(){}

    public static SingletonFirst getInstance() {
        return instance;
    }
}

import pattern.adapter.*;

/**
 * Created by ALEXuH on 2018/12/25
 */
public class AdapterTest {
    public static void main(String[] args) {
        Target tar = new Adapter();
        tar.sayHello();
        tar.sayThanks();

        Target adp = new Adapter1(new Source());
        adp.sayThanks();
        adp.sayHello();

        Sourceable able = new Adapter2();
        able.method1();
        able.method2();
        able.method3();


    }
}

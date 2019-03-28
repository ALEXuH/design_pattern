package pattern.proxy;

/**
 * Created by ALEXuH on 2018/12/25
 * 代理模式：对原有的方法进行改进
 */
public class Proxy implements Source{

    private Source sor;

    public Proxy() {
        this.sor = new DataSource();
    }

    public void method1() {
        before();
        sor.method1();
        after();
    }

    public void method2() {
        throw new RuntimeException("do nor need implements");
    }

    private void before() {
        System.out.println("Before");
    }

    private void after() {
        System.out.println("After");
    }
}

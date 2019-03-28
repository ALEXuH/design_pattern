import pattern.factory.Sender;
import pattern.factory.SenderFactory;
import pattern.factory.SenderStaticFactory;

/**
 * Created by ALEXuH on 2018/12/24
 */
public class FactoryTest {

    public static void main(String[] args) {
        SenderFactory fac = new SenderFactory();
        Sender wb = fac.producer("WB");
        Sender wc = fac.producer("WC");
        wb.send();
        wc.send();

        System.out.println("================");
        SenderStaticFactory.producerWB().send();
        SenderStaticFactory.producerWC().send();
    }
}

import pattern.factory.SendPublicFactory;
import pattern.factory.Sender;
import pattern.factory.SenderFactory;
import pattern.factory.SenderStaticFactory;

/** Created by ALEXuH on 2018/12/24 */
public class FactoryTest {

  public static void main(String[] args) {
    // first method
    SenderFactory fac = new SenderFactory();
    Sender wb = fac.producer("WB");
    Sender wc = fac.producer("WC");
    wb.send();
    wc.send();

    System.out.println("----------------------");
    // second method
    SendPublicFactory facP = new SendPublicFactory();
    facP.producerWB().send();
    facP.producerWC().send();

    System.out.println("---------------------");
    // third method
    SenderStaticFactory.producerWB().send();
    SenderStaticFactory.producerWC().send();
  }
}

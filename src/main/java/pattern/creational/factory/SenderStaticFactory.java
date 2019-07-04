package pattern.creational.factory;

/** Created by ALEXuH on 2018/12/24 有大量类需要创建，并且拥有相同的接口 */
public class SenderStaticFactory {

  public static Sender producerWB() {
    return new WBSender();
  }

  public static Sender producerWC() {
    return new WCSender();
  }
}

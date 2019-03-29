package pattern.factory;

/** Created by ALEXuH on 2019/3/28 */
public class SendPublicFactory {

  public Sender producerWB() {
    return new WBSender();
  }

  public Sender producerWC() {
    return new WCSender();
  }
}

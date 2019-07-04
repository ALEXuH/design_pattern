package pattern.creational.factory;

/** Created by ALEXuH on 2018/12/24 */
public class SenderFactory {

  public Sender producer(String name) {
    if (name.equals("WB")) {
      return new WBSender();
    } else if (name.equals("WC")) {
      return new WCSender();
    } else {
      return null;
    }
  }
}

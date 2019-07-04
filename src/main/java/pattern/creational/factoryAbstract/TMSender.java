package pattern.creational.factoryAbstract;

import pattern.creational.factory.Sender;

/** Created by ALEXuH on 2018/12/24 */
public class TMSender implements Sender {

  @Override
  public void send() {
    System.out.println("send TM ...");
  }
}

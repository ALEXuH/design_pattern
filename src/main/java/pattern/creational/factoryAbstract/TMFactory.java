package pattern.creational.factoryAbstract;

import pattern.creational.factory.Sender;

/** Created by ALEXuH on 2018/12/24 */
public class TMFactory implements Provider {

  @Override
  public Sender produce() {
    return new TMSender();
  }
}

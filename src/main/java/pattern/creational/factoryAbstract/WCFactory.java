package pattern.creational.factoryAbstract;

import pattern.creational.factory.Sender;
import pattern.creational.factory.WCSender;

/** Created by ALEXuH on 2018/12/24 */
public class WCFactory implements Provider {

  @Override
  public Sender produce() {
    return new WCSender();
  }
}

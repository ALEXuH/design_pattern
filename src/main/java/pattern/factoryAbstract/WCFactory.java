package pattern.factoryAbstract;

import pattern.factory.Sender;
import pattern.factory.WCSender;

/**
 * Created by ALEXuH on 2018/12/24
 */
public class WCFactory implements Provider {

    @Override
    public Sender produce() {
        return new WCSender();
    }
}

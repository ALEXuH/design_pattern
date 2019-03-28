package pattern.factoryAbstract;

import pattern.factory.Sender;
import pattern.factory.WBSender;

/**
 * Created by ALEXuH on 2018/12/24
 */
public class WBFactory implements Provider {

    public Sender produce() {
        return new WBSender();
    }
}

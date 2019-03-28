package pattern.factoryAbstract;

import pattern.factory.Sender;

/**
 * Created by ALEXuH on 2018/12/24
 */
public class TMFactory implements Provider {

    public Sender produce() {
        return new TMSender();
    }
}

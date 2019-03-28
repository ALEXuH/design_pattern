package pattern.builder;

import pattern.factory.Sender;
import pattern.factory.WBSender;
import pattern.factory.WCSender;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ALEXuH on 2018/12/24
 * 建造者模式：创建复合对象,工厂关注当个对象
 */
public class Builder {

    List<Sender> list = new ArrayList<Sender>();

    public List<Sender> producerWB(Integer count) {
        for (int i = 0; i < count; i++) {
            list.add(new WBSender());
        }
        return list;
    }

    public List<Sender> producerWC(Integer count) {
        for (int i = 0; i < count; i++) {
            list.add(new WCSender());
        }
        return list;
    }
}

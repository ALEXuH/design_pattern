package pattern.creational.factoryAbstract;

import pattern.creational.factory.Sender;

/** Created by ALEXuH on 2018/12/24 对普通工厂类的提升，提高了图拓展性，当需要添加新的产品只需要添加一个实现类和一个工厂类 */
public interface Provider {

  public Sender produce();
}

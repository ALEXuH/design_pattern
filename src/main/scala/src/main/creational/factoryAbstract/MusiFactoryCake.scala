package main.creational.factoryAbstract
import main.creational.factory.{Cake, MusiCake}

/**
  * Created by ALEXuH on 2019/11/14 0014
  */
class MusiFactoryCake extends AbstractFactory {
  override def producerCake(): Cake = new MusiCake
}

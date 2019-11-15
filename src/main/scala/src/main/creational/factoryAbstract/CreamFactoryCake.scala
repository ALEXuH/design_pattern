package main.creational.factoryAbstract
import main.creational.factory.{Cake, CreamCake}

/**
  * Created by ALEXuH on 2019/11/14 0014
  */
class CreamFactoryCake extends AbstractFactory {
  override def producerCake(): Cake = new CreamCake
}

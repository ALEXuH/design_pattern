package main.creational.factoryAbstract

import main.creational.factory.Cake

/**
  * Created by ALEXuH on 2019/11/14 0014
  */
trait AbstractFactory {
  def producerCake(): Cake
}

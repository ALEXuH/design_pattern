package main.creational.factory

/**
  * Created by ALEXuH on 2019/11/14 0014
  */
object ProducerFactory {
  // 1.根据字符串判断
  def producerCake(name: String): Cake = {
    if (name.equals("musi")) {
       new MusiCake()
    } else if (name.equals("cream")) {
       new CreamCake()
    } else {
      null
    }
  }

  // 2. 根据方法名区别
  def produceMusi(): Cake = new MusiCake

  def produceCream() = new CreamCake

}

object Test {
  def main(args: Array[String]): Unit = {
    val musi = ProducerFactory.producerCake("musi")
    val cream = ProducerFactory.producerCake("cream")
    musi.producer()
    println()
    cream.producer()
    println()
    val musi1 = ProducerFactory.produceMusi();
    val cream1 = ProducerFactory.produceCream()
    musi1.producer()
    println()
    cream1.producer()
  }
}
package main.structural.decorator

/**
  * Created by ALEXuH on 2019/11/15 0015
  */
class NormalSource extends DataSource {
  override def sayHello(): Unit = println("say hello")

  override def syaThank(): Unit = println("say thank")
}

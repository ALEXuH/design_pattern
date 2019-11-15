package main.structural.decorator

/**
  * Created by ALEXuH on 2019/11/15 0015
  */
class TranslateDecorator(val source: DataSource) extends DataSourceDecorator {
  override def initWrap(): DataSource = {
    source
  }

  override def sayHello(): Unit = {
    println("decorator front")
    super.sayHello()
  }

  override def syaThank(): Unit = {
    super.syaThank()
    println("decorator after")
  }
}

package main.structural.decorator

/**
  * Created by ALEXuH on 2019/11/15 0015
  */
trait DataSourceDecorator extends DataSource {

  def initWrap(): DataSource

  override def sayHello(): Unit = initWrap().sayHello()

  override def syaThank(): Unit = initWrap().syaThank()
}

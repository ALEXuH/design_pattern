package main.structural.decorator

/**
  * Created by ALEXuH on 2019/11/15 0015
  */
object Test {
  def main(args: Array[String]): Unit = {
    val source: DataSource = new TranslateDecorator(new NormalSource())
    source.sayHello()
    println()
    source.syaThank()
  }

}

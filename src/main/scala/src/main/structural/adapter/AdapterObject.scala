package main.structural.adapter

/**
  * Created by ALEXuH on 2019/11/15 0015
  * 类和对象之间的适配器
  */
class AdapterObject(private val source: Source) extends Target {
  override def methed1(): Unit = source.methed1()

  override def mehted2(): Unit = println("mehted2")
}
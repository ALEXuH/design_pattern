package main.creational.singleton

/**
  * Created by ALEXuH on 2019/11/15 0015
  */
class SingletonFirst private{
}

object SingletonFirst {
  private final val singletonFirst: SingletonFirst = new SingletonFirst
  def getInstance(): SingletonFirst = singletonFirst
}

object Test {
  def main(args: Array[String]): Unit = {
    println(SingletonFirst.getInstance())
    println(SingletonFirst.getInstance())
  }
}

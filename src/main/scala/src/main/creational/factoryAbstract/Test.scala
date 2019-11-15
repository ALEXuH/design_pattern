package main.creational.factoryAbstract

/**
  * Created by ALEXuH on 2019/11/14 0014
  */
object Test {
  def main(args: Array[String]): Unit = {
    val musi =  new MusiFactoryCake().producerCake()
    val cream = new CreamFactoryCake().producerCake()
    musi.producer()
    println()
    cream.producer()
  }
}

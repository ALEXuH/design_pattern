package main.creational.build

import main.creational.build.ComputerType.ComputerType

/**
  * Created by ALEXuH on 2019/11/15 0015
  */
trait Build {
  def setType(computerType: ComputerType)
  def setWireLess(wireless: String)
  def setFans(count: Int)
  def setCpu(cpu: Cpu)
}

object ComputerType extends Enumeration {
  type ComputerType = Value
  val AURS,LENOVO,MINGJI = Value
}

class Computer(var computerType: ComputerType, var wireless: String, var fans: Int, var cpu: Cpu) {
  def setComputerType(value: ComputerType): Unit = {
    this.computerType = value
  }

  def setWireless(value: String): Unit = {
    this.wireless = value
  }

  def setFans(value: Int): Unit = {
    this.fans = value
  }

  def setCpu(value: Cpu): Unit = {
    this.cpu = value
  }

  override def toString: String = {
    s"$computerType::$wireless::$fans::$cpu"
  }
}

class Cpu(var brand: String, var size: Int) {

}


object aa {
  def main(args: Array[String]): Unit = {
    print(ComputerType.AURS)
  }
}
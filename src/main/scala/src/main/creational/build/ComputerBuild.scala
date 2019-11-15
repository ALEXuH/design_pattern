package main.creational.build
import main.creational.build.ComputerType.ComputerType

/**
  * Created by ALEXuH on 2019/11/15 0015
  */
class ComputerBuild extends Build {
  private[this] var computerType: ComputerType = _
  private[this] var wireless: String = _
  private[this] var count: Int = _
  private[this] var cpu: Cpu = _

  override def setType(computerType: ComputerType): Unit = {
    this.computerType = computerType
  }

  override def setWireLess(wireless: String): Unit = {
    this.wireless = wireless
  }

  override def setFans(count: Int): Unit = {
    this.count = count
  }

  override def setCpu(cpu: Cpu): Unit = {
    this.cpu = cpu
  }

  def getResult(): Computer = {
    new Computer(computerType, wireless, count, cpu)
  }
}

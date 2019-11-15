package main.creational.build

/**
  * Created by ALEXuH on 2019/11/15 0015
  */
object Director {

  def initAURS(build: Build): Unit = {
    build.setType(ComputerType.AURS)
    build.setFans(4)
    build.setWireLess(wireless.huawei)
    build.setCpu(new Cpu(brand.AMD, 100 ))
  }

  def initAURS2(build: Build): Unit = {
    build.setType(ComputerType.AURS)
    build.setFans(4)
    build.setWireLess("aaa")
    build.setCpu(new Cpu(brand.INTEL, 1000))
  }

  def initLENovo(build: Build): Unit = {
    build.setType(ComputerType.LENOVO)
    build.setFans(4)
    build.setWireLess(wireless.sung)
    build.setCpu(new Cpu(brand.INTEL, 1000))
  }

}

object brand {
  final val AMD = "amd"
  final val INTEL = "intel"
}

object wireless {
  final val huawei = "huawei"
  final val sung = "sung"
}

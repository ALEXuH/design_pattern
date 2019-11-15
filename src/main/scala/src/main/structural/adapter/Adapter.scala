package main.structural.adapter

/**
  * Created by ALEXuH on 2019/11/15 0015
  * 类适配器
  */
class Adapter extends Source with Target {
  override def mehted2(): Unit = {
    print("methed2")
  }
}

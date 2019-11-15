package main.creational.build

/**
  * Created by ALEXuH on 2019/11/15 0015
  */
object Test {
  def main(args: Array[String]): Unit = {
    val build: ComputerBuild = new ComputerBuild()
    Director.initAURS(build)
    println(build.getResult().toString)

    Director.initLENovo(build)
    println(build.getResult().toString)
  }
}

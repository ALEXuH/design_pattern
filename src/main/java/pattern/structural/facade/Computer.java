package pattern.structural.facade;

/** Created by ALEXuH on 2018/12/25 外观模式：解决了类的依赖问题.spring将类和类的关系放置在配置文件中，这个模式将他们的关系放在一个facade类中 */
public class Computer implements Behavior {

  Cpu cpu;
  Disk disk;

  public Computer() {
    this.cpu = new Cpu();
    this.disk = new Disk();
  }

  @Override
  public void start() {
    cpu.start();
    disk.start();
  }

  @Override
  public void stop() {
    cpu.stop();
    disk.stop();
  }
}

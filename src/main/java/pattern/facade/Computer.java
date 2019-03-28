package pattern.facade;

/**
 * Created by ALEXuH on 2018/12/25
 * 外观模式：解决了类的依赖问题
 */
public class Computer implements Behavior{

    Cpu cpu;
    Disk disk;

    public Computer() {
        this.cpu = new Cpu();
        this.disk = new Disk();
    }


    public void start() {
        cpu.start();
        disk.start();
    }

    public void stop() {
        cpu.stop();
        disk.stop();
    }
}

package pattern.structural.decorator;

/** Created by ALEXuH on 2018/12/18 装饰器模式：在不改变结构的情况下,动态的为对象附加功能[在委托对象的前面或者后面],比继承更加灵活 可以替代继承*/
public class DataSourceDecorator implements DataSource {

  private DataSource wrap;

  public DataSourceDecorator(DataSource dataSource) {
    this.wrap = dataSource;
  }

  public void writeData(String data) {
    wrap.writeData(data);
  }

  public String readData() {
    return wrap.readData();
  }
}

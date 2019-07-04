package pattern.structural.decorator;

/** Created by ALEXuH on 2018/12/18 */
public interface DataSource {

  void writeData(String data);

  String readData();
}

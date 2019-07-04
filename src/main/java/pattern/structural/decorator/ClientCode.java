package pattern.structural.decorator;

/** Created by ALEXuH on 2018/12/18 */
public class ClientCode {

  public static void main(String[] args) {
    String data = "test data";
    DataSourceDecorator dec =
        new CompressionDecorator(new EncryptionDecorator(new FileDataSource("./test.txt")));
    DataSource sor = new FileDataSource("./test1.txt");

    dec.writeData(data);
    System.out.println("-------------");
    System.out.println(dec.readData());
    System.out.println("-------------");

    sor.writeData(data);
    System.out.println(sor.readData());
  }
}

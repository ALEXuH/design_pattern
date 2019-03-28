package pattern.decorator;

/**
 * Created by ALEXuH on 2018/12/18
 */
public class EncryptionDecorator extends DataSourceDecorator{

    public EncryptionDecorator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void writeData(String data) {
        super.writeData(encode(data));
    }

    @Override
    public String readData() {
        return decode(super.readData());
    }

    private String  encode(String data) {
        System.out.println("write data is in encoding");
        return data;
    }

    private String decode(String data) {
        System.out.println("read data is in decoding");
        return data;
    }
}

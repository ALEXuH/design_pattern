package pattern.decorator;

/**
 * Created by ALEXuH on 2018/12/18
 */
public class CompressionDecorator extends DataSourceDecorator {

    public CompressionDecorator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void writeData(String data) {
        super.writeData(compress(data));
    }

    @Override
    public String readData() {
        return deCompress(super.readData());
    }

    private String compress(String data) {
        System.out.println("write is do some compress ...");
        return data;
    }

    private String deCompress(String data) {
        System.out.println("write is do some deCompress ...");
        return data;
    }
}

package pattern.factory;

/**
 * Created by ALEXuH on 2018/12/24
 */
public class WBSender implements Sender{

    @Override
    public void send() {
        System.out.println("WB send ... ");
    }
}

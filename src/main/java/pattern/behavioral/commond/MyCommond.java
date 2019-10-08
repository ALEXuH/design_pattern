package pattern.behavioral.commond;

/**
 * Created by ALEXuH on 2019/7/4 0004
 */
public class MyCommond implements Commond{

  private Reciver reciver;

  public MyCommond(Reciver reciver) {
    this.reciver = reciver;
  }

  @Override
  public void exec() {
    reciver.action();
  }
}

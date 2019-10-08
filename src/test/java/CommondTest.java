import pattern.behavioral.commond.Invoker;
import pattern.behavioral.commond.MyCommond;
import pattern.behavioral.commond.Reciver;

/**
 * Created by ALEXuH on 2019/7/4 0004
 */
public class CommondTest {

  public static void main(String[] args) {
      Reciver reciver = new Reciver();
      MyCommond commond = new MyCommond(reciver);
      Invoker in = new Invoker(commond);
      in.process();
  }

}

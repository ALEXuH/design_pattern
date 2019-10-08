package pattern.behavioral.commond;

/**
 * Created by ALEXuH on 2019/7/4 0004
 */
public class Invoker {

  private Commond commond;

  public Invoker(Commond commond) {
    this.commond = commond;
  }

  public void process() {
    commond.exec();
  }

}

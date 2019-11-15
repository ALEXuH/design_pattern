package pattern.behavioral.memento;

/**
 * Created by ALEXuH on 2019/11/15 0015
 * 备忘录模式:保存一个对象的某个状态，以便在适当的时候恢复对象
 */
public class Memento {
  public String getState() {
    return state;
  }

  public Memento(String state) {
    this.state = state;
  }
  private String state;

}

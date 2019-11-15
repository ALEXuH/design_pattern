package pattern.behavioral.memento;

import pattern.behavioral.iterator.Container;

/**
 * Created by ALEXuH on 2019/11/15 0015
 */
public class Originator {
  private String state;

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public void saveStateToContainer(MementoContainer container){
    if (container == null) {
      throw new RuntimeException("container can not be null");
    }else {
      container.add(new Memento(state));
    }
  }

  public void getStateFromContainer(Memento memento) {
    this.state = memento.getState();
  }
}

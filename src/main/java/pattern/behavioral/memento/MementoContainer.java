package pattern.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ALEXuH on 2019/11/15 0015
 */
public class MementoContainer {

  private List<Memento> container = new ArrayList<Memento>();

  public void add(Memento state) {
    container.add(state);
  }

  public Memento get(int index) {
    return container.get(index);
  }
}

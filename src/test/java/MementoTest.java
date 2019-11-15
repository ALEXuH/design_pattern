import pattern.behavioral.memento.MementoContainer;
import pattern.behavioral.memento.Originator;

/**
 * Created by ALEXuH on 2019/11/15 0015
 */
public class MementoTest {
  public static void main(String[] args) {
    MementoContainer container = new MementoContainer();
    Originator ori = new Originator();
    ori.setState("1");
    ori.saveStateToContainer(container);
    ori.setState("2");
    ori.saveStateToContainer(container);
    ori.setState("3");
    ori.saveStateToContainer(container);

    System.out.println("current state: " + ori.getState());
    ori.getStateFromContainer(container.get(0));
    System.out.println("first state: " + ori.getState());;
    ori.getStateFromContainer(container.get(1));
    System.out.println("first state: " + ori.getState());;
  }
}

package pattern.observer;

import java.util.ArrayList;
import java.util.List;

/** Created by ALEXuH on 2019/5/10 0010 */
public class Subject {

  private List<Observer> observers = new ArrayList<Observer>();
  private int state;

  public int getState() {
    return state;
  }

  public void setState(int state) {
    this.state = state;
    updateAllObserver();
  }

  public void attach(Observer observer) {
    observers.add(observer);
  }

  public void remove(Observer observer) {
    observers.remove(observer);
  }

  public void updateAllObserver() {
    for (Observer observer : observers) {
      observer.upate();
    }
  }
}

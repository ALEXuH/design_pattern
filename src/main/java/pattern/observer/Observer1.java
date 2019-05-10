package pattern.observer;

/** Created by ALEXuH on 2019/5/10 0010 */
public class Observer1 extends Observer {

  public Observer1(Subject subject) {
    this.subject = subject;
    this.subject.attach(this);
  }

  @Override
  public void upate() {
    System.out.println(" Observer1 update: " + this.subject.getState());
  }
}

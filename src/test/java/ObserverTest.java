import pattern.observer.Observer1;
import pattern.observer.Observer2;
import pattern.observer.Subject;

/** Created by ALEXuH on 2019/5/10 0010 */
public class ObserverTest {

  public static void main(String[] args) {
    Subject subject = new Subject();
    new Observer1(subject);
    new Observer2(subject);
    subject.setState(10);
  }
}

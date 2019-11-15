import pattern.behavioral.mediator.User;

/**
 * Created by ALEXuH on 2019/11/15 0015
 */
public class MediatorTest {
  public static void main(String[] args) {
      User a = new User("a");
      User b = new User("b");
      a.sendMessage("hi b");
      a.sendMessage("hi a");
  }
}

package pattern.behavioral.mediator;

import java.util.Date;

/**
 * Created by ALEXuH on 2019/11/15 0015
 * 中介这模式：是用来降低多个对象和类之间的通信复杂性
 */
public class ChatPlat {

  public static void sendMessage(User user, String message) {
    System.out.println(new Date().toString() + ";" + user.getName() + ": "+message);
  }
}

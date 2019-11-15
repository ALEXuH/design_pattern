package pattern.behavioral.mediator;

/**
 * Created by ALEXuH on 2019/11/15 0015
 */
public class User {
  private String name;

  public String getName() {
    return name;
  }

  public User(String name) {
    this.name = name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void sendMessage(String message) {
    ChatPlat.sendMessage(this, message);
  }
}

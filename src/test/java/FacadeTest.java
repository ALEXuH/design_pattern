import pattern.facade.Computer;

/** Created by ALEXuH on 2018/12/25 */
public class FacadeTest {

  public static void main(String[] args) {
    Computer com = new Computer();
    com.start();
    com.stop();
  }
}

package pattern.strategy;

/** Created by ALEXuH on 2019/5/10 0010 */
public class Add extends Strategy {

  @Override
  public int execute(int num, int num2) {
    setFlag("+");
    return num + num2;
  }
}

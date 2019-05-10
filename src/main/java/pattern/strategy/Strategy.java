package pattern.strategy;

/** Created by ALEXuH on 2019/5/10 0010 */
public abstract class Strategy {

  private String flag;

  public abstract int execute(int num, int num2);

  protected void setFlag(String flag) {
    this.flag = flag;
  }

  public String getFlag() {
    return flag;
  }
}

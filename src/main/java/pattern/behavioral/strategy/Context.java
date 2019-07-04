package pattern.behavioral.strategy;

/** Created by ALEXuH on 2019/5/10 0010  策略模式：动态改变对象的行为,主要解决定义一系列算法是他们可以互相替换*/
public class Context {

  private Strategy strategy;

  public Context(Strategy strategy) {
    this.strategy = strategy;
  }

  public void setStrategy(Strategy strategy) {
    this.strategy = strategy;
  }

  public String getStrategy() {
    if (null != strategy) {
      return strategy.getFlag();
    }
    return "null";
  }

  public int executeStrategy(int num1, int num2) {
    return strategy.execute(num1, num2);
  }
}

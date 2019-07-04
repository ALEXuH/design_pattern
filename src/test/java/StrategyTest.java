import pattern.behavioral.strategy.Add;
import pattern.behavioral.strategy.Context;
import pattern.behavioral.strategy.Multiply;
import pattern.behavioral.strategy.Substract;

/** Created by ALEXuH on 2019/5/10 0010 */
public class StrategyTest {
  public static void main(String[] args) {
    Context context = new Context(new Add());
    System.out.println(context.executeStrategy(10, 20));
    context.setStrategy(new Multiply());
    System.out.println(context.executeStrategy(10, 20));
    context.setStrategy(new Substract());
    System.out.println(context.executeStrategy(10, 20));
  }
}

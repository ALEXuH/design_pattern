import pattern.factoryAbstract.Provider;
import pattern.factoryAbstract.TMFactory;
import pattern.factoryAbstract.WBFactory;
import pattern.factoryAbstract.WCFactory;

/** Created by ALEXuH on 2018/12/24 */
public class AbstractFactoryTest {

  public static void main(String[] args) {
    Provider wb = new WBFactory();
    Provider wc = new WCFactory();
    Provider tm = new TMFactory();
    wb.produce().send();
    wc.produce().send();
    tm.produce().send();
  }
}

import pattern.behavioral.iterator.Iterator;
import pattern.behavioral.iterator.NameRepository;

/**
 * Created by ALEXuH on 2019/11/15 0015
 */
public class IteratorTest {
  public static void main(String[] args) {
      NameRepository names = new NameRepository();
      for (Iterator iter = names.getIterator(); iter.hasNext();) {
        String name = (String)iter.next();
        System.out.println("name:" + name);
      }
  }
}

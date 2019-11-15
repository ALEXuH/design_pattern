package pattern.behavioral.filter;

import java.util.ArrayList;
import java.util.List;

/** Created by ALEXuH on 2018/12/26 */
public class Filter1 implements Filter {

  @Override
  public List<Person> filter(List<Person> list) {
    List<Person> list1 = new ArrayList<Person>();
    for (Person per : list) {
      if (per.getMaritalStatus().equals("male")) {
        list1.add(per);
      }
    }
    return list1;
  }
}

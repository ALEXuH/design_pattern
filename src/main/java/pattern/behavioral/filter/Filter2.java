package pattern.behavioral.filter;

import java.util.ArrayList;
import java.util.List;

/** Created by ALEXuH on 2018/12/26 */
public class Filter2 implements Filter {
  @Override
  public List<Person> filter(List<Person> list) {
    List<Person> list1 = new ArrayList<Person>();
    for (Person person : list) {
      if (person.getGender().equals("sig")) {
        list1.add(person);
      }
    }
    return list1;
  }
}

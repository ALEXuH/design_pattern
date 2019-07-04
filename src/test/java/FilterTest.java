import pattern.behavioral.filter.*;

import java.util.ArrayList;
import java.util.List;

/** Created by ALEXuH on 2018/12/26 */
public class FilterTest {

  public static void main(String[] args) {
    Person person = new Person("fsd", "sig", "male");
    Person person1 = new Person("fsd1", "sig1", "male");
    Person person2 = new Person("fsd2", "sig", "male1");
    List<Person> list = new ArrayList<Person>();
    list.add(person);
    list.add(person1);
    list.add(person2);

    Filter fil = new Filter1();
    Filter fil2 = new Filter2();
    Filter fil3 = new Filter3(fil, fil2);

    for (Person per : fil.filter(list)) {
      System.out.println(per.getName());
    }

    System.out.println("-----------");
    for (Person per : fil2.filter(list)) {
      System.out.println(per.getName());
    }
    System.out.println("--------------");
    for (Person per : fil3.filter(list)) {
      System.out.println(per.getName());
    }
  }
}

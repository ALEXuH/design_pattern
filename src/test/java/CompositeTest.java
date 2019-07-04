import pattern.structural.composite.Employee;

/** Created by ALEXuH on 2019/5/9 0009 */
public class CompositeTest {
  public static void main(String[] args) {
    Employee ceo = new Employee("xiaoming", "CEO", 50000);
    Employee cto = new Employee("xiaohong", "CTO", 40000);
    Employee market = new Employee("xiaomi", "Market", 40000);
    Employee market1 = new Employee("xiaolang", "Market", 40000);

    ceo.add(cto);
    cto.add(market);
    cto.add(market1);

    // 所有员工
    for (Employee e : ceo.getList()) {
      System.out.println(e.toString());
    }
  }
}

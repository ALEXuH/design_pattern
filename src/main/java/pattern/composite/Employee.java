package pattern.composite;

import java.util.ArrayList;
import java.util.List;

/** Created by ALEXuH on 2019/5/9 0009 组合模式：创建了对象的树形结构，一个对象里包含其他对象可以是中点对象也可以是其他对象，一个根节点下游许多子节点*/
public class Employee {

  private String name;
  private String dept;
  private int salary;
  private List<Employee> list;

  public Employee(String name, String dept, int salary) {
    this.name = name;
    this.dept = dept;
    this.salary = salary;
    list = new ArrayList<Employee>();
  }

  public void add(Employee empl) {
    list.add(empl);
  }

  public void remove(Employee empl) {
    list.remove(empl);
  }

  public List<Employee> getList() {
    return this.list;
  }

  @Override
  public String toString() {
    return "Employee{"
        + "name='"
        + name
        + '\''
        + ", dept='"
        + dept
        + '\''
        + ", salary="
        + salary
        + ", list="
        + list
        + '}';
  }
}

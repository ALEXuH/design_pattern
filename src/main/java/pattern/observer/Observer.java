package pattern.observer;

/** Created by ALEXuH on 2019/5/10 0010  观察者模式: 对象存在一对多的关系。一个对象被修改时自动通知它的依赖对象*/
public abstract class Observer {
  protected Subject subject;
  public abstract void upate();
}

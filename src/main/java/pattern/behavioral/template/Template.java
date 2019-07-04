package pattern.behavioral.template;

/** Created by ALEXuH on 2019/5/10 0010 模板模式：定义好一个模板将具体执行延迟到子类中实现*/
public abstract class Template {

  public abstract void start();

  public abstract void in();

  public abstract void end();

  public void process() {
    start();
    end();
    in();
  }
}

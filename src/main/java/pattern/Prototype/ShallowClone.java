package pattern.Prototype;

/**
 * Created by ALEXuH on 2019/5/9 0009
 * 原型模式：通过复制该原型对象来创建一个新的对象,可以更加高效的创建对象，无需知道具体细节,应用在对象之间相同或者类似，只是个别几个属性不同[如奖状名字不同]
 */
public class ShallowClone implements Cloneable {

  public ShallowClone clone() throws CloneNotSupportedException {
    System.out.println("start create new clone object");
    return (ShallowClone) super.clone();
  }
}

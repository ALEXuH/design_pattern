package pattern.behavioral.iterator;

/**
 * Created by ALEXuH on 2019/11/15 0015
 */
public class NameRepository implements Container{

  String[] names = {"das", "xiaoming", "xiaohong"};

  @Override
  public Iterator getIterator() {
    return new NameIterator();
  }

  private class NameIterator implements Iterator {

    int index;

    @Override
    public boolean hasNext() {
      if (index < names.length) {
        return true;
      }
      return false;
    }

    @Override
    public Object next() {
      if (this.hasNext()) {
        return names[index++];
      }
      return null;
    }
  }
}

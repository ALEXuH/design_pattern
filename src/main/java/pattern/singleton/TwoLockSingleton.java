package pattern.singleton;

/**
 * Created by ALEXuH on 2019/5/28 0028
 * 双重校验锁
 */
public class TwoLockSingleton {

    // 禁止指令重排
    private volatile static TwoLockSingleton instance;

    private TwoLockSingleton(){}

    public TwoLockSingleton getInstance() {
        // 先判断一下
        if (null == instance) {
            // 后加锁
            synchronized (this) {
                if (null == instance) {
                    instance = new TwoLockSingleton();
                }
            }
        }
        return instance;
    }

}

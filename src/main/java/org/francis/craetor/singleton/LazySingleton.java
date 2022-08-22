package org.francis.craetor.singleton;

/**
 * @author Franc1s
 * @date 2022/8/21
 * @apiNote
 */
public class LazySingleton {
    private static LazySingleton INSTANCE;

    private LazySingleton() {
    }

    public static LazySingleton getInstance(){
        if (INSTANCE==null){
            synchronized (LazySingleton.class){
                if (INSTANCE==null){
                    INSTANCE=new LazySingleton();
                }
            }
        }
        return INSTANCE;
    }
}

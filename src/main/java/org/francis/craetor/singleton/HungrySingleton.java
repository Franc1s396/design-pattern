package org.francis.craetor.singleton;

/**
 * @author Franc1s
 * @date 2022/8/21
 * @apiNote
 */
public class HungrySingleton {
    private static HungrySingleton INSTANCE=new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getInstance(){
        return INSTANCE;
    }
}

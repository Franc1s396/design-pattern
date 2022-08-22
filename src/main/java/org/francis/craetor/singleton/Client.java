package org.francis.craetor.singleton;

/**
 * @author Franc1s
 * @date 2022/8/22
 * @apiNote
 */
public class Client {
    public static void main(String[] args) {
        System.out.println(LazySingleton.getInstance());
        System.out.println(LazySingleton.getInstance());
        System.out.println(LazySingleton.getInstance());
        System.out.println(LazySingleton.getInstance());
    }
}

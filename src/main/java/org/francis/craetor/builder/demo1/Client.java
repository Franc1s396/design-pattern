package org.francis.craetor.builder.demo1;

/**
 * @author Franc1s
 * @date 2022/8/19
 * @apiNote
 */
public class Client {
    public static void main(String[] args) {
        Director director = new Director(new MobileBuilder());
        System.out.println(director.construct());
    }
}

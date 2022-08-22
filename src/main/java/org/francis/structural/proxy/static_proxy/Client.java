package org.francis.structural.proxy.static_proxy;

/**
 * @author Franc1s
 * @date 2022/8/19
 * @apiNote
 */
public class Client {
    public static void main(String[] args) {
        new SellProxy(new TrainStation()).sell();
    }
}

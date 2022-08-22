package org.francis.structural.proxy.cglib_proxy;

/**
 * @author Franc1s
 * @date 2022/8/19
 * @apiNote
 */
public class Client {
    public static void main(String[] args) {
        ProxyFactory factory = new ProxyFactory(new TrainStation());
        TrainStation station = (TrainStation) factory.getProxy();
        station.sell();
    }
}

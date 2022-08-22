package org.francis.structural.proxy.static_proxy;

/**
 * @author Franc1s
 * @date 2022/8/19
 * @apiNote
 */
public class TrainStation implements SellTicket{
    @Override
    public void sell() {
        System.out.println("售卖");
    }
}

package org.francis.structural.proxy.static_proxy;

/**
 * @author Franc1s
 * @date 2022/8/19
 * @apiNote
 */
public class SellProxy implements SellTicket{

    private SellTicket target;

    public SellProxy(SellTicket target) {
        this.target = target;
    }

    @Override
    public void sell() {
        System.out.println("前置");
        target.sell();
        System.out.println("后置");
    }
}

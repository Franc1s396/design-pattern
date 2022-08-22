package org.francis.structural.proxy.cglib_proxy;

import net.sf.cglib.proxy.Enhancer;

/**
 * @author Franc1s
 * @date 2022/8/19
 * @apiNote
 */
public class ProxyFactory {

    TrainStation station;

    public ProxyFactory(TrainStation station) {
        this.station = station;
    }

    public Object getProxy() {
        Enhancer enhancer=new Enhancer();
        enhancer.setSuperclass(TrainStation.class);
        enhancer.setCallback(new TrainStationInterceptor(station));
        return enhancer.create();
    }
}

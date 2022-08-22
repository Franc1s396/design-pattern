package org.francis.structural.proxy.cglib_proxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author Franc1s
 * @date 2022/8/19
 * @apiNote
 */
public class TrainStationInterceptor implements MethodInterceptor {
    TrainStation station;

    public TrainStationInterceptor(TrainStation station) {
        this.station = station;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("前置");
        return method.invoke(station);
    }
}

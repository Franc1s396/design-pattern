package org.francis.structural.facade;

/**
 * @author Franc1s
 * @date 2022/8/21
 * @apiNote
 */
public class SmartAppliancesFacade {
    private TV tv;
    private Light light;
    private AirCondition airCondition;

    public SmartAppliancesFacade() {
        this.tv=new TV();
        this.light=new Light();
        this.airCondition=new AirCondition();
    }

    private void on(){
        tv.on();
        airCondition.on();
        light.on();
    }

    private void off(){
        //...
    }
}

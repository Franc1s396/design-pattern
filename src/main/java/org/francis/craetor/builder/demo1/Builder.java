package org.francis.craetor.builder.demo1;

/**
 * @author Franc1s
 * @date 2022/8/19
 * @apiNote
 */
public abstract class Builder {

    protected Bike bike=new Bike();

    public abstract void buildFrame();

    public abstract void buildSeat();

    public abstract Bike createBike();
}

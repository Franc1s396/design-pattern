package org.francis.craetor.builder.demo1;

/**
 * @author Franc1s
 * @date 2022/8/19
 * @apiNote
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Bike construct(){
        builder.buildFrame();
        builder.buildSeat();
        return builder.createBike();
    }
}

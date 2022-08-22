package org.francis.craetor.builder.demo1;

/**
 * @author Franc1s
 * @date 2022/8/19
 * @apiNote
 */
public class OfoBuilder extends Builder{
    @Override
    public void buildFrame() {
        bike.setFrame("铝合金车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("橡胶车座");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}

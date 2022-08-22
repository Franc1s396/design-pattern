package org.francis.craetor.builder.demo1;

/**
 * @author Franc1s
 * @date 2022/8/19
 * @apiNote
 */
public class MobileBuilder extends Builder{
    @Override
    public void buildFrame() {
        bike.setFrame("碳纤维车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("真皮车座");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}

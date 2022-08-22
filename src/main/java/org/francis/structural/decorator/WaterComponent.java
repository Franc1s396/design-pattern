package org.francis.structural.decorator;

/**
 * @author Franc1s
 * @date 2022/8/19
 * @apiNote
 */
public class WaterComponent implements DrinkComponent{
    @Override
    public void operation() {
        System.out.println("water drink");
    }
}

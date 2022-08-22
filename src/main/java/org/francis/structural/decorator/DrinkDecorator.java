package org.francis.structural.decorator;

/**
 * @author Franc1s
 * @date 2022/8/19
 * @apiNote
 */
public class DrinkDecorator implements DrinkComponent{

    DrinkComponent drinkComponent;

    public DrinkDecorator(DrinkComponent drinkComponent) {
        super();
        this.drinkComponent = drinkComponent;
    }

    @Override
    public void operation() {
        drinkComponent.operation();
    }
}

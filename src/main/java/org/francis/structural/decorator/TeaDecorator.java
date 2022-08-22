package org.francis.structural.decorator;

/**
 * @author Franc1s
 * @date 2022/8/19
 * @apiNote
 */
public class TeaDecorator extends DrinkDecorator{
    public TeaDecorator(DrinkComponent drinkComponent) {
        super(drinkComponent);
    }

    @Override
    public void operation() {
        drinkComponent.operation();
        System.out.println("加茶叶");
    }
}

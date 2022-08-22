package org.francis.structural.decorator;

/**
 * @author Franc1s
 * @date 2022/8/19
 * @apiNote
 */
public class Client {
    public static void main(String[] args) {
        DrinkComponent drinkComponent=new WaterComponent();
        SugarDecorator sugarDecorator = new SugarDecorator(drinkComponent);
        TeaDecorator teaDecorator = new TeaDecorator(sugarDecorator);
        teaDecorator.operation();
    }
}

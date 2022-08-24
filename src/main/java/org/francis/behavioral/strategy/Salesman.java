package org.francis.behavioral.strategy;

/**
 * @author Franc1s
 * @date 2022/8/23
 * @apiNote
 */
public class Salesman {
    private Strategy strategy;

    public Salesman(Strategy strategy) {
        this.strategy = strategy;
    }

    public void salesmanShow(){
        strategy.show();
    }

}

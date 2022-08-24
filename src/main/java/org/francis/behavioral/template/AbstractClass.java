package org.francis.behavioral.template;

/**
 * @author Franc1s
 * @date 2022/8/23
 * @apiNote
 */
public abstract class AbstractClass {

    public final void cookProcess() {
        pourOil();
        heatOil();
        pourVegetable();
        pourSauce();
        fly();
    }

    public void pourOil() {
        System.out.println("倒油");
    }

    public void heatOil() {
        System.out.println("热油");
    }

    abstract void pourVegetable();

    abstract void pourSauce();

    public void fly() {
        System.out.println("炒");
    }
}

package org.francis.structural.flyweight;

/**
 * @author Franc1s
 * @date 2022/8/22
 * @apiNote
 */
public abstract class AbstractBox {
    abstract String getShape();

    public void display(String color){
        System.out.println(getShape()+"-"+color);
    }
}

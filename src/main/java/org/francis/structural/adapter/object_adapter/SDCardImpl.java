package org.francis.structural.adapter.object_adapter;

/**
 * @author Franc1s
 * @date 2022/8/19
 * @apiNote
 */
public class SDCardImpl implements ISDCard {
    @Override
    public String readSDCard() {
        return "SDCard read msg: hello world SDCard";
    }

    @Override
    public void writeSDCard() {
        System.out.println("SDCard is written");
    }
}

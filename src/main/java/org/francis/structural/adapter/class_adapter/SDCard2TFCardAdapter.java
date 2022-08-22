package org.francis.structural.adapter.class_adapter;

/**
 * @author Franc1s
 * @date 2022/8/19
 * @apiNote
 */
public class SDCard2TFCardAdapter extends TFCardImpl implements ISDCard {
    @Override
    public String readSDCard() {
        System.out.println("adapter read tf card");
        return this.readTFCard();
    }

    @Override
    public void writeSDCard() {
        System.out.println("adapter write tf card");
        this.writeTFCard();
    }
}

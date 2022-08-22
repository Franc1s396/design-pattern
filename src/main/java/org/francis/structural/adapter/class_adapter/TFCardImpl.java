package org.francis.structural.adapter.class_adapter;

/**
 * @author Franc1s
 * @date 2022/8/19
 * @apiNote
 */
public class TFCardImpl implements ITFCard {
    @Override
    public String readTFCard() {
        return "TFCard read msg: hello world TFCard";
    }

    @Override
    public void writeTFCard() {
        System.out.println("TFCard is written");
    }
}

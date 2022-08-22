package org.francis.structural.adapter.class_adapter;

/**
 * @author Franc1s
 * @date 2022/8/19
 * @apiNote
 */
public class Computer {
    public String readCard(ISDCard isdCard) {
        if (isdCard == null) {
            throw new NullPointerException("SDCard is null");
        }
        return isdCard.readSDCard();
    }
}

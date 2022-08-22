package org.francis.structural.adapter.object_adapter;

/**
 * @author Franc1s
 * @date 2022/8/19
 * @apiNote
 */
public class SDCard2TFCardAdapter implements ISDCard {
    ITFCard itfCard;

    public SDCard2TFCardAdapter(ITFCard itfCard) {
        this.itfCard = itfCard;
    }

    @Override
    public String readSDCard() {
        System.out.println("adapter read tf card");
        return itfCard.readTFCard();
    }

    @Override
    public void writeSDCard() {
        System.out.println("adapter write tf card");
        itfCard.writeTFCard();
    }
}

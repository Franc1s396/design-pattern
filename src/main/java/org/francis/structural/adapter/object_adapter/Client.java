package org.francis.structural.adapter.object_adapter;

/**
 * @author Franc1s
 * @date 2022/8/19
 * @apiNote
 */
public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        ISDCard sdCard=new SDCardImpl();
        System.out.println(computer.readCard(sdCard));

        System.out.println(computer.readCard(new SDCard2TFCardAdapter(new TFCardImpl())));
    }
}

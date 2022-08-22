package org.francis.structural.brige;

/**
 * @author Franc1s
 * @date 2022/8/21
 * @apiNote
 */
public class Client {
    public static void main(String[] args) {
        OpratingSystem system=new WindowsSystem(new AVIFile());
        system.play("IPX-368");
    }
}

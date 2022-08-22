package org.francis.craetor.builder.demo2;

/**
 * @author Franc1s
 * @date 2022/8/19
 * @apiNote
 */
public class Client {
    public static void main(String[] args) {
        Phone phone=new Phone.Builder()
                .cpu("cpu")
                .mainBoard("主板")
                .memory("内存")
                .screen("屏幕")
                .build();
        System.out.println(phone);
    }
}

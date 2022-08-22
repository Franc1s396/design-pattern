package org.francis.structural.brige;

/**
 * @author Franc1s
 * @date 2022/8/21
 * @apiNote
 */
public class AVIFile implements VideoFile{
    @Override
    public void decode(String fileName) {
        System.out.println(fileName+".avi");
    }
}

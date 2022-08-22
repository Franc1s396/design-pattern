package org.francis.structural.brige;

/**
 * @author Franc1s
 * @date 2022/8/21
 * @apiNote
 */
public class RMVBFile implements VideoFile{
    @Override
    public void decode(String fileName) {
        System.out.println(fileName+".rmvb");
    }
}

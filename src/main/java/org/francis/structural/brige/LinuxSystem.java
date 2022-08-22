package org.francis.structural.brige;

/**
 * @author Franc1s
 * @date 2022/8/21
 * @apiNote
 */
public class LinuxSystem extends OpratingSystem{
    public LinuxSystem(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        System.out.println("Linux系统进行播放");
        videoFile.decode(fileName);
    }
}

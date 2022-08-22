package org.francis.structural.brige;

/**
 * @author Franc1s
 * @date 2022/8/21
 * @apiNote
 */
public abstract class OpratingSystem {
    protected VideoFile videoFile;

    public OpratingSystem(VideoFile videoFile) {
        this.videoFile = videoFile;
    }

    public abstract void play(String fileName);
}

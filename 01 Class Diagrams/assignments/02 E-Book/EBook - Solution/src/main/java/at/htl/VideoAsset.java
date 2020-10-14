package at.htl;

public class VideoAsset extends PictureAsset {
    private int duration;

    public VideoAsset(String name, int pixelWidth, int pixelHeight, int duration) {
        super(name, pixelWidth, pixelHeight);
        this.duration = duration;
    }
}

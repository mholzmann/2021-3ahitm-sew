package at.htl;

public class AudioAsset extends MediaAsset {
    private int duration;

    public AudioAsset(String name, int duration) {
        super(name);
        this.duration = duration;
    }

    @Override
    public float getPageCount() {
        return 0;
    }
}

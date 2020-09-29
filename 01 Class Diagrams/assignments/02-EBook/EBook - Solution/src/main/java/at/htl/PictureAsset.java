package at.htl;

public class PictureAsset extends MediaAsset {
    private int width;
    private int height;

    public PictureAsset(String name, int width, int height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    @Override
    public float getPageCount() {
        float scaledHeight =  height * (960f / width);
        return (scaledHeight > 600) ? 1f : 0.5f;
    }
}

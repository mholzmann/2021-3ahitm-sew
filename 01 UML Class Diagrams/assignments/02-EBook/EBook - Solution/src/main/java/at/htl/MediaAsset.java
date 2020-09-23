package at.htl;

public abstract class MediaAsset {
    private String fileName;

    public MediaAsset(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String toString() {
        return fileName + " (" + getPageCount() + " pages)";
    }

    public abstract float getPageCount();
}

package at.htl;

public class TextAsset extends MediaAsset {
    int characterCount;

    public TextAsset(String name, int characterCount) {
        super(name);
        this.characterCount = characterCount;
    }

    @Override
    public float getPageCount() {
        return characterCount / 2000f;
    }
}

package at.htl;

import java.util.ArrayList;
import java.util.Collection;

public class EBook {
    private String title;
    private String author;
    private int year;
    private Collection<MediaAsset> assets = new ArrayList<>();

    public EBook(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public void addAsset(MediaAsset asset) {
        assets.add(asset);
    }

    public int getTotalPageCount() {
        float totalPageCount = 0;
        for (MediaAsset asset : assets) {
            totalPageCount += asset.getPageCount();
        }
        return (int) Math.ceil(totalPageCount);
    }

    @Override
    public String toString() {
        String output = "E-Book: " + title + "\n" +
                "Author: " + author + "\n" +
                "Pages: " + getTotalPageCount() + "\n" +
                "--------\n";
        for (MediaAsset asset : assets) {
            output += asset + "\n";
        }
        return output;
    }
}

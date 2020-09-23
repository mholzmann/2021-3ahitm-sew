package at.htl;

public class Main {

    public static void main(String[] args) {
        EBook eBook = new EBook("Learn Java in one day", "Jane Doe", 2020);
        eBook.addAsset(new TextAsset("introduction.pdf", 3441));
        eBook.addAsset(new AudioAsset("audio-description.mp4", 95 * 60));
        eBook.addAsset(new VideoAsset("video-tutorial.mp4", 800, 800, 20 * 60));
        eBook.addAsset(new PictureAsset("class-diagram.png", 2000, 600));
        eBook.addAsset(new TextAsset("glossary.pdf", 7655));
        System.out.println(eBook);
    }
}

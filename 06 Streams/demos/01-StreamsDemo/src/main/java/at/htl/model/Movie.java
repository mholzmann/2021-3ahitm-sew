package at.htl.model;

public class Movie {
    private final String title;
    private final int likes;

    public Movie(String title, int likes) {
        this.title = title;
        this.likes = likes;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", likes=" + likes +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public int getLikes() {
        return likes;
    }
}

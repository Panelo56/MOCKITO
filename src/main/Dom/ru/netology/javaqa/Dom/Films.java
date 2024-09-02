package ru.netology.javaqa.Dom;

public class Films {
    private int id;
    private String title;
    private String productGenre;
    private String releaseDate;

    public Films(int id, String title, String productGenre, String releaseDate) {
        this.id = id;
        this.title = title;
        this.productGenre = productGenre;
        this.releaseDate = releaseDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getProductGenre() {
        return productGenre;
    }

    public void setProductGenre(String productGenre) {
        this.productGenre = productGenre;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }
}
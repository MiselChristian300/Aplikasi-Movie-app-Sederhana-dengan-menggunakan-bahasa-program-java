package Models;

public class Movies {
    private String title;
    private String deskripsi;
    private int thumnail;
    private String studios;
    private String rating;
    private String streamLink;
    private int photoCover;

    public Movies(String title, int thumnail) {
        this.title = title;
        this.thumnail = thumnail;
    }

    public Movies(String title, int thumnail, int photoCover) {
        this.title = title;
        this.thumnail = thumnail;
        this.photoCover = photoCover;
    }


    public Movies(String title, String deskripsi, int thumnail, String studios, String rating, String streamLink) {
        this.title = title;
        this.deskripsi = deskripsi;
        this.thumnail = thumnail;
        this.studios = studios;
        this.rating = rating;
        this.streamLink = streamLink;
    }

    public int getPhotoCover() {
        return photoCover;
    }

    public void setPhotoCover(int photoCover) {
        this.photoCover = photoCover;
    }

    public String getTitle() {
        return title;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public int getThumnail() {
        return thumnail;
    }

    public String getStudios() {
        return studios;
    }

    public String getRating() {
        return rating;
    }

    public String getStreamLink() {
        return streamLink;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public void setThumnail(int thumnail) {
        this.thumnail = thumnail;
    }

    public void setStudios(String studios) {
        this.studios = studios;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public void setStreamLink(String streamLink) {
        this.streamLink = streamLink;
    }
}

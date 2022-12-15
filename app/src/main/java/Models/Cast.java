package Models;

public class Cast {
    String name_cast;
    int img_link;

    public Cast(String name_cast, int img_link) {
        this.name_cast = name_cast;
        this.img_link = img_link;
    }

    public String getName_cast() {
        return name_cast;
    }

    public void setName_cast(String name_cast) {
        this.name_cast = name_cast;
    }

    public int getImg_link() {
        return img_link;
    }

    public void setImg_link(int img_link) {
        this.img_link = img_link;
    }
}

package Models;

import java.lang.reflect.Constructor;

public class slides_itm {
    private int Image;
    private String Title;

    public slides_itm(int image,String title){
        Image=image;
        Title=title;

    }

    public int getImage() {
        return Image;
    }

    public String getTitle() {
        return Title;
    }

    public void setImage(int image) {
        Image = image;
    }

    public void setTitle(String title) {
        Title = title;
    }
}

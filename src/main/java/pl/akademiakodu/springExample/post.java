package pl.akademiakodu.springExample;

import java.util.ArrayList;
import java.util.List;

public class post {

    private  String title;
    private  String description;
    private  String autor;

    private static List<post> posts = new ArrayList<>();

    public static List<post>findAll() {
        return posts;
    }

    public post (){}

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitle() {

        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getAutor() {
        return autor;
    }


    public post(String title, String description, String autor) {

        this.title = title;
        this.description = description;
        this.autor = autor;
        posts.add(this);
    }

    public post(String title) {
        this.title = title;
    }

    public String toString() {
        return getAutor()+" "+getTitle()+" "+getDescription();
    }
}

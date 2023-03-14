import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Author {
    protected int id;
    protected String author;





    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }


    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }


    public Author(){

    }

    public Author(int id, String author){
        this.id = id;
        this.author = author;
    }


}

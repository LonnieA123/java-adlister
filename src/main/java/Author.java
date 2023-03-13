import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Author {
    protected int id;
    protected String author;

    protected ArrayList<Quote> quotes;

    public ArrayList<Quote> getQuotes() {
        return quotes;
    }

    public void setQuotes(ArrayList<Quote> quotes) {
        this.quotes = quotes;
    }

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

    public Author(int id, String author, ArrayList<Quote> quotes){
        this.id = id;
        this.author = author;
        this.quotes = quotes;
    }


}

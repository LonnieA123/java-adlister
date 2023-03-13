public class Quote {
    protected int id;
    protected String quote;
    protected int author;




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }


    public int getAuthor() {
        return author;
    }

    public void setAuthor(int author) {
        this.author = author;
    }


    public Quote(){

    }

    public Quote(int id, String quote, int author){
        this.id = id;
        this.quote = quote;
        this.author = author;
    }
}

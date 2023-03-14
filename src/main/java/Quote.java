public class Quote {
    protected int id;
    protected String quote;
    protected Author author;




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


    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }


    public Quote(){

    }

    public Quote(int id, String quote, Author author){
        this.id = id;
        this.quote = quote;
        this.author = author;
    }
}

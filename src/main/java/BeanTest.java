import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BeanTest {
    public static void main(String[] args) {


        Album a1 = new Album(1,"bladee","icedancer","2019",100000,"cloud rap");
        Album a2 = new Album(1,"narrow head","satisfaction","2021",100000,"shoegaze");
        Album a3 = new Album(1,"the garden","KSMBR","2020",100000,"punk");

        Author au1 = new Author(1,"me");
        Author au2 = new Author(2,"said");
        Author au3 = new Author(3,"song");

        Quote q1 = new Quote(1,"I love deadlines. I love the whooshing noise they make as they go by.",au1);
        Quote q2 = new Quote(2,"Don't Panic.",au1);
        Quote q3 = new Quote(3,"Time is an illusion. Lunchtime doubly so.",au1);
        Quote q4 = new Quote(4,"Clothes make the man. Naked people have little or no influence on society.",au2);
        Quote q5 = new Quote(5,"The universe is a big place, perhaps the biggest.",au3);



        ArrayList<Quote> quotes = new ArrayList<>(Arrays.asList(q1,q2,q3,q4,q5));

        for (Quote quote : quotes){
            System.out.println(quote.getQuote() + " -" + quote.author.getAuthor());

        }
    }
}

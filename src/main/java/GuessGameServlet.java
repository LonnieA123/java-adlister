import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

import static java.lang.Integer.parseInt;

@WebServlet("/guess")
public class GuessGameServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/guessgame.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Random random = new Random();
        int randomNumber = random.nextInt(3) + 1;

       String answer = req.getParameter("guess");
       int numAnswer = parseInt(answer);


       if (numAnswer == randomNumber){
           resp.sendRedirect("/right");
       } else {
           resp.sendRedirect("/wrong");
       }



    }
}

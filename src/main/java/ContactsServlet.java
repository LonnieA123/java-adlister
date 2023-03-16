import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/contacts")
public class ContactsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            Contacts contactsDao = ContactDaoFactory.getContactDao();
            req.setAttribute("contacts",contactsDao.all());
            req.getRequestDispatcher("contacts.jsp").forward(req,resp);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }



}

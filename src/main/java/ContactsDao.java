import com.mysql.jdbc.Driver;

import java.net.URL;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ContactsDao implements Contacts {
    private Connection connection;

    public ContactsDao() throws SQLException {

        DriverManager.registerDriver(new Driver());
        Config info = new Config();
        connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/codeup_test_db?allowPublicKeyRetrieval=true&useSSL=false",
                Config.giveUSER(),
                Config.givePSWD()
        );
    }

    @Override
    public List<Contact> all() throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery("SELECT * FROM contacts");
        List<Contact> contacts = new ArrayList<>();

        while (result.next()){

            Contact contact = new Contact(
                    result.getString("name"),
                    result.getString("number")
            );
            contacts.add(contact);

        }
        return contacts;
    }
}

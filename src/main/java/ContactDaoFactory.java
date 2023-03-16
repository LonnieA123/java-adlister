import java.sql.SQLException;

public class ContactDaoFactory {

    private static Contacts contactDao;

    public static Contacts getContactDao() throws SQLException {
        if (contactDao == null){
            contactDao = new ContactsDao();
        }
        return contactDao;
    }
}

import java.sql.SQLException;
import java.util.List;

public interface Contacts {

    public List<Contact> all() throws SQLException;

}

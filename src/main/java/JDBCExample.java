import com.mysql.cj.protocol.Resultset;
import com.mysql.jdbc.Driver;

import java.sql.*;

public class JDBCExample {
    public static void main(String[] args) throws SQLException {
        DriverManager.registerDriver(new Driver());
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/codeup_test_db?allowPublicKeyRetrieval=true&useSSL=false",
                "root",
                "codeup"
        );


        System.out.println(connection);
        Statement statement = connection.createStatement();
        String query = "select * from albums";

        ResultSet rs = statement.executeQuery(query);

        if(rs.next()){
            System.out.println(rs.getString("artist"));
        }


    }
}

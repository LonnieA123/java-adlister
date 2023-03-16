import com.mysql.jdbc.Driver;

import java.sql.*;

public class JDBCEmployees {
    public static void main(String[] args) throws SQLException {
        DriverManager.registerDriver(new Driver());
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/employees?allowPublicKeyRetrieval=true&useSSL=false",
                "root",
                "codeup"
        );


        Statement statement = connection.createStatement();
        String query = "SELECT * FROM employees";
        ResultSet rs = statement.executeQuery(query);

        for (int i = 1; i <= 10; i++ ){
            rs.next();
            System.out.println(rs.getString("first_name"));
        }
    }
}

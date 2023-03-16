import com.mysql.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads{
    private Statement statement;
    private Connection connection;
    public MySQLAdsDao(Config config){
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    Config.giveURL(),
                    Config.giveUSER(),
                    Config.givePSWD()
            );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Ad> all() throws SQLException {

        statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM ads");

        List<Ad> adsList = new ArrayList<>();

        while (resultSet.next()){
            adsList.add(
                    new Ad(
                            resultSet.getInt("id"),
                            resultSet.getInt("user_id"),
                            resultSet.getString("title"),
                            resultSet.getString("description")
                    ));
        }
        return adsList;
    }


    @Override
    public Long insert(Ad ad) throws SQLException {

        String query = String.format(
                "INSERT into ads (user_id, title, description) VALUES ('%d', '%s', '%s')",
                1,
                ad.getTitle(),
                ad.getDescription()
        );


        statement = connection.createStatement();
        return (long) statement.executeUpdate(query,Statement.RETURN_GENERATED_KEYS);

    }
}

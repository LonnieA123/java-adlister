import com.mysql.cj.jdbc.Driver;
import models.Album;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCLecture {

    public static void main(String[] args) {
        try {

            // ======================== CREATING THE DRIVER and CONNECTION OBJECTS

            DriverManager.registerDriver(new Driver());

            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost/codeup_test_db?serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true",
                    "root",
                    "codeup"
            );


            // ======================== CREATING A STATEMENT OBJECT

            Statement statement = conn.createStatement();


            // ======================== GETTING A SINGLE AND LIST OF RESULTS

//            String query = "SELECT * FROM albums";
            //
//            ResultSet rs = statement.executeQuery(query);

//            rs.next();
            //
//            System.out.println(rs.getString(1));
//            System.out.println(rs.getString(2));
//            System.out.println(rs.getString(3));
//            System.out.println(rs.getString(4));
//            System.out.println(rs.getString(5));
//            System.out.println(rs.getString(6));
//
//            rs.beforeFirst(); // also rs.previous()
//
//            while (rs.next()) {
//                System.out.println("===================");
//                System.out.println(rs.getString("id"));
//                System.out.println(rs.getString("artist"));
//                System.out.println(rs.getString("name"));
//                System.out.println(rs.getString("release_date"));
//                System.out.println(rs.getString("sales"));
//                System.out.println(rs.getString("genre"));
//            }

            // ======================== GETTING METADATA

//            ResultSetMetaData rsmd = rs.getMetaData();
//            int colCount = rsmd.getColumnCount();
//            for (int i = 1; i <= colCount; i += 1) {
//                System.out.println(rsmd.getColumnName(i));
//            }

            // ======================== ALBUM MODEL

             String query = "SELECT * FROM albums";
             ResultSet rs = statement.executeQuery(query);
             List<Album> albums = new ArrayList<>();

             while(rs.next()) {
                 Album album = new Album(rs.getLong("id"),
                    rs.getString("artist"),
                    rs.getString("name"),
                    rs.getInt("release_date"),
                    rs.getDouble("sales"),
                    rs.getString("genre")
                 );
                 albums.add(album);
             }
             for (Album album : albums) {
                 System.out.println(album);
                 System.out.println("===============================");
             }


            // ======================== UPDATE A RECORD

            // Album updateAlbum = new Album(
            //         2,
            //         "Prince",
            //         "Purple Rain",
            //         1984,
            //         50,
            //         "amazing"
            // );
            //
            // String updateQuery = String.format("UPDATE albums SET artist = '%s', name = '%s', release_date = %d, sales = %f, genre = '%s' WHERE id = %d",
            //         updateAlbum.getArtist(),
            //         updateAlbum.getName(),
            //         updateAlbum.getReleaseDate(),
            //         updateAlbum.getSales(),
            //         updateAlbum.getGenre(),
            //         updateAlbum.getId()
            // );

            // System.out.println(updateQuery);

            // int numberOfRowsEffected = statement.executeUpdate(updateQuery);
            // System.out.println("Records effected..." + numberOfRowsEffected);

//            // ======================== INSERTING A RECORD
//
//            // album to save
//            Album brandNewAlbum = new Album(
//                "The Cure",
//                "Disintegration",
//                1989,
//                15,
//                "alt, goth, rock"
//            );
//
//            // create insert query
//            String insertQuery = String.format("INSERT INTO albums (artist, name, release_date, sales, genre) VALUES ('%s', '%s', %d, %f, '%s')",
//                brandNewAlbum.getArtist(),
//                brandNewAlbum.getName(),
//                brandNewAlbum.getReleaseDate(),
//                brandNewAlbum.getSales(),
//                brandNewAlbum.getGenre()
//            );
//
//            // verify insert query looks correct
//            System.out.println(insertQuery);
//
//            // inserts album in db
//            statement.executeUpdate(insertQuery, Statement.RETURN_GENERATED_KEYS);
//
//
//
//
//
//            // ONLY NEEDED IF WANTING AUTO GENERATED ID...
//
//            // pull out the primary that was created
//            ResultSet rs = statement.getGeneratedKeys();
//
//            // extract the primary key from the result set
//            if (rs.next()) {
//                System.out.println("Inserted id is: " + rs.getLong(1));
//            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
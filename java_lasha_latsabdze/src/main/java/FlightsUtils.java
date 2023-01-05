import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FlightsUtils {

    private FlightsUtils() {
    }

    public static void createTable() {

        String createSql = "CREATE TABLE Flights (" +
                "Direction VARCHAR(255), " +
                "Flight_Year INTEGER NOT NULL," +
                "Seats_Number INTEGER NOT NULL," +
                "Flight_Price INTEGER NOT NULL,";

        try {
            JDBCUtill.getStatement().executeUpdate(createSql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Created table in given database...");

    }

    public static void insert(Flights flights) {

        String insertSql = "INSERT INTO Flights(Direction,Flight_Year,Seats_Number,Flight_Price) VALUES(" +
                "'" + "paris" + "', " +
                "'" + 2023 + "', " +
                "'" + 200 + ")"+
                "'" + 500 +")";
                ;

        try {
            JDBCUtill.getStatement().executeUpdate(insertSql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public static void updateFlights(String newDirection) {

        String updateSql = "UPDATE Flights SET Direction = '" + "berlin" + "' WHERE Direction = " + "Paris";

        try {
            JDBCUtill.getStatement().executeUpdate(updateSql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public static void deleteStudent(long id) {

        String deleteAll = "DELETE FROM Flights WHERE Direction = " + "Paris";
        try {
            JDBCUtill.getStatement().executeUpdate(deleteAll);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseFileUpdate {
    public static void databaseUpdate(String urlDb) {

        try (Connection connection = Database.getInstance().getConnection();
             Statement st = connection.createStatement()) {
            st.executeUpdate(FileReaderDB.getFileReadDB(urlDb));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

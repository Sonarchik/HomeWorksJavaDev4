import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseFileUpdate {
    public static void databaseUpdate(String urlDb) {

        try (Statement st = Database
                .getInstance()
                .getConnection()
                .createStatement()) {
            st.executeUpdate(FileReaderDB.getFileReadDB(urlDb));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

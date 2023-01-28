public class DatabaseInitService {
    private static final String INIT_DB_FILE = "sql/init_db.sql";

    public static void main(String[] args) {
        DatabaseFileUpdate.databaseUpdate(INIT_DB_FILE);
    }
}

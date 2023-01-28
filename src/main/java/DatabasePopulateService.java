public class DatabasePopulateService {
    private static final String INIT_DB_FILE = "sql/populate_db.sql";

    public static void main(String[] args) {
        DatabaseFileUpdate.databaseUpdate(INIT_DB_FILE);
    }
}

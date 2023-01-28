import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileReaderDB {
    static String getFileReadDB(String urlDb) {
        String fileReadDB;
        try {
            fileReadDB = String.join(
                    "\n",
                    Files.readAllLines(Paths.get(urlDb))
            );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return fileReadDB;
    }
}

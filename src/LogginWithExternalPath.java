import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LogginWithExternalPath
{

    private static final Logger logger = Logger.getLogger("LogginWithExternalPath");

    public static void main(String[] args) throws IOException {

            String path = "C:/Users/Lenovo/Desktop/SpringIntelije/LogginInJava/log.txt";

            // log file - for log info
            FileHandler fileHandler = new FileHandler(path , true);

            // set formatter
            fileHandler.setFormatter(new SimpleFormatter());

            //add file handler in logger
           logger.addHandler(fileHandler);

           // set level
          logger.setLevel(Level.ALL);

          logger.info("Project is starting to running");
          logger.warning("Project in running please not interrupt");
          logger.severe("Error occur");

    }
}

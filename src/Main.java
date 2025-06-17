import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Main {
    private static final Logger logger = Logger.getLogger("TestLoggin");

    public static void main(String[] args) throws IOException {

        //1: file jisme log store honge
        FileHandler fileHandler = new FileHandler("readme.md", true);

        //2: formatter set karo - log file format ke liye
        fileHandler.setFormatter(new SimpleFormatter());

        //3:Filehangler ko logger me add karo
        logger.addHandler(fileHandler);

        //4: sabhi level ke log capture honge
        logger.setLevel(Level.ALL);

        //5: console se duplicate log remove karna ho to (Optional)
        //logger.setUseParentHandlers(true);


           logger.warning("Don't Stop When Starting");
           logger.info("Program is Executing");
           logger.severe("This is error message");
    }
}
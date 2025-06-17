import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LogginWithMoreLogFile {

    private static final Logger logger  = Logger.getLogger("LogginWithMoreLogFile");
    public static void main(String[] args) {
         try{

             FileHandler fileHandler = new FileHandler("logFile%g.log",1024,2,true);

             fileHandler.setFormatter(new SimpleFormatter());

             logger.addHandler(fileHandler);

             logger.setLevel(Level.ALL);

             for (int i = 0; i < 2000; i++) {
                 logger.info("Logging message " + i);
             }
         }
         catch (Exception e){
             System.out.println(e);
         }
    }
}

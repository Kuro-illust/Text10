import java.util.logging.*;

public class LoggingApp {

    private static Logger logger = Logger.getLogger(LoggingApp.class.getName());

    public static void main(String[] args) {
        logger.setLevel(Level.ALL);
        try {
            logger.info("fine");
            Integer.parseInt(args[0]);
        } catch (Exception e) {
            logger.severe("catch");
        } finally {
            logger.finest("finally");
        }
    }
}
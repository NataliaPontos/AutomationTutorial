package loggerUtility;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerUtility {
    private static final Logger logger = LogManager.getLogger();

    //Start test
    //Finish test
    //Info log
    public static void startTest(String testName){
        logger.info("===== EXECUTION STARTED: " + testName+ "=====");
    }
    public static void finishTest(String testName){
        logger.info("===== EXECUTION FINISHED: " + testName+ "=====");
    }
    public static void infoTest(String message){
        logger.info(message);
    }
}

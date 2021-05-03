package main.education.com.epam.taskone.validator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LineValidator {
    static final Logger logger = LogManager.getLogger();
    private final  String CONTENT_SPLITER = "\\n";
    private final String DIGIT_FINDER = "[[\\d-\\s] |[\\d-\\p{Punct}]]+";

    public boolean hasString(String content) {
        boolean firstFlag = false;
        if (content != null){
            String[] stringArray = content.split(CONTENT_SPLITER);
            for (String str : stringArray){
                if (str.matches(DIGIT_FINDER) && !firstFlag){
                    firstFlag = true;
                    logger.info("Valid string was find " + str);
                }
            }
            if (!firstFlag){
                logger.info("Valid string was not find");
            }
        }else {
            logger.info("Provided null");
        }
        return firstFlag;
    }
}

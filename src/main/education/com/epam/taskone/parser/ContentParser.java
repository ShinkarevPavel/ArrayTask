package main.education.com.epam.taskone.parser;
/*This class do content parsing for extracting valid string*/

import main.education.com.epam.taskone.exception.CustomException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ContentParser {
    static final Logger logger = LogManager.getLogger();
    private final  String CONTENT_SPLITER = "\\n";
    private final String DIGIT_FINDER = "[[\\d-\\s] |[\\d-\\p{Punct}]]+";

    public String stringParser(String content) throws CustomException {
        String correctLine = null;
        if (content != null){
            boolean flag = false;
            String[] stringArray = content.split(CONTENT_SPLITER);
            for (String str : stringArray){
                if (str.matches(DIGIT_FINDER) && !flag){
                    correctLine = str;
                    flag = true;
                    logger.info("Successful. String was find");
                }
            }
            if (!flag){
                logger.info("Valid string was not found");
            }
        } else {
            throw new CustomException("Provided null");
        }
        return correctLine;
    }
}

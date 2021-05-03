package main.education.com.epam.taskone.parser;

import main.education.com.epam.taskone.exception.CustomException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayParser {
    static final Logger logger = LogManager.getLogger();
    private final String CONTENT_SPLITER = "[[\\s] |[\\p{Punct}&&[^-]]]+";

    public int[] arrayCreator(String content) throws CustomException {
        int[] arrayDigits;
        if (content != null){
            String[] digitsString = content.split(CONTENT_SPLITER);
            arrayDigits = new int[digitsString.length];
            for (int i = 0; i < digitsString.length; i++) {
                try {
                    arrayDigits[i] = Integer.parseInt(digitsString[i]);
                }catch (NumberFormatException e){
                    throw new CustomException("Error. In provided string was found not valid char");
                }
            }
            logger.info("Successful. Array was created");
        } else {
            throw new CustomException("Provided null");
        }
        return arrayDigits;
    }
}

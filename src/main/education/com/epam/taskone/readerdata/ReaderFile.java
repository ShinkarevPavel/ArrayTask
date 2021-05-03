package main.education.com.epam.taskone.readerdata;

import main.education.com.epam.taskone.exception.CustomException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class ReaderFile {
    static final Logger logger = LogManager.getLogger();

    public String readAllStrings(String path) throws CustomException {
        if (path == null){
            throw new CustomException("Provided null");
        }
        String content = "";
        try {
            content = new String(Files.readAllBytes(Paths.get(path)));
            logger.info("Successful. File was read");
        }catch (IOException e){
            throw new CustomException("Issue with provided path");
        }
        return content;
    }
}

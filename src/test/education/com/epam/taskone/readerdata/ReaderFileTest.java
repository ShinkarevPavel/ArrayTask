package education.com.epam.taskone.readerdata;

import main.education.com.epam.taskone.exception.CustomException;
import main.education.com.epam.taskone.readerdata.ReaderFile;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ReaderFileTest {
    private ReaderFile readerFile;
    private final String CORRECT_PATH = "src/test/resources/file.txt";
    private final String NOT_CORRECT_PATH = "src/test/resources/wrongFile.txt";
    private final String CONTENT = "4 п 7   45 6 ю , 8 7\n" +
            "7 12 0, 6 - -1б \n" +
            "0 ж\n" +
            "78 -2 1 2 -77 8 4   0 14 7 0   -98\n" +
            "   \tн\n" +
            "14 0 word 8";

    @BeforeMethod
    public void setUp() {
        this.readerFile = new ReaderFile();
    }

    @Test
    public void testReadAllStrings() throws CustomException {
        String actual = this.readerFile.readAllStrings(this.CORRECT_PATH);
        String expected = this.CONTENT;
        assertEquals(actual, expected);
    }
    @Test (expectedExceptions = CustomException.class)
    public void testReadWrongStrings() throws CustomException {
        String actual = this.readerFile.readAllStrings(this.NOT_CORRECT_PATH);
    }
}
package education.com.epam.taskone.parser;

import main.education.com.epam.taskone.exception.CustomException;
import main.education.com.epam.taskone.parser.ContentParser;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContentParserTest {
    private ContentParser contentParser;
    private final String VALID_CONTENT = "4 п 7   45 6 ю , 8 7\n7 12 0, 6 - -1б \n0 ж\n78 -2 1 2 -77 8 4" +
            "   0 14 7 0   -98\n   \tн\n14 0 word 8";
    private final String NOT_VALID_CONTENT = "4 п 7   45 6 ю , 8 7\n7 12 0, 6 - -1б \n0 ж\n78 -2 1r 2 -77w 8 4" +
            "   0 14q 7 0   -98\n   \tн\n14 0 word 8";
    private final String NULL_STRING = null;

    @BeforeClass
    public void setContentParser(){
        this.contentParser = new ContentParser();
    }

    @Test
    public void testStringParser() throws CustomException {
        String actual = this.contentParser.stringParser(this.VALID_CONTENT);
        String expected = "78 -2 1 2 -77 8 4   0 14 7 0   -98";
        assertEquals(actual, expected);
    }

    @Test
    public void testWrongStringParser() throws CustomException{
        String actual = this.contentParser.stringParser(this.NOT_VALID_CONTENT);
        String expected = null;
        assertEquals(actual, expected);
    }

    @Test(expectedExceptions = CustomException.class)
    public void testNullStringParser()throws CustomException {
        this.contentParser.stringParser(this.NULL_STRING);
    }
}
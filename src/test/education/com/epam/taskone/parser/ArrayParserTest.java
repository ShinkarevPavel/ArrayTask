package education.com.epam.taskone.parser;

import main.education.com.epam.taskone.exception.CustomException;
import main.education.com.epam.taskone.parser.ArrayParser;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ArrayParserTest {
    private ArrayParser arrayParser;
    private final String CORRECT_STRING = "5   -8 -12   0 97 14   225";
    private final String NOT_CORRECT_STRING = "5a   -8 12   0 97 14";
    private final String NULL_STRING = null;

    @BeforeClass
    public void setArrayParser(){
        this.arrayParser = new ArrayParser();
    }
    @Test
    public void testStringParser() throws CustomException {
        int[] actual = this.arrayParser.arrayCreator(this.CORRECT_STRING);
        int[] expected = {5, -8, -12, 0, 97, 14, 225};
        assertEquals(actual, expected);
    }

    @Test(expectedExceptions = CustomException.class)
    public void testNullStringParser() throws CustomException{
        this.arrayParser.arrayCreator(this.NULL_STRING);
    }

    @Test(expectedExceptions = CustomException.class)
    public void testWrongStringParser() throws CustomException{
        this.arrayParser.arrayCreator(this.NOT_CORRECT_STRING);
    }
}
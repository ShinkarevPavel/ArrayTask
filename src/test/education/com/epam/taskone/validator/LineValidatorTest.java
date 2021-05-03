package education.com.epam.taskone.validator;

import main.education.com.epam.taskone.validator.LineValidator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class LineValidatorTest {
    private LineValidator validator;

    private final String VALID_CONTENT = "4 п 7   45 6 ю , 8 7\n7 12 0, 6 - -1б \n0 ж\n78 -2 1 2 -77 8 4" +
            "   0 14 7 0   -98\n   \tн\n14 0 word 8";
    private final String NOT_VALID_CONTENT = "4 п 7   45 6 ю , 8 7\n7 12 0, 6 - -1б \n0 ж\n78 -2 1r 2 -77w 8 4" +
            "   0 14q 7 0   -98\n   \tн\n14 0 word 8";

    @BeforeClass
    public void setValidator(){
        this.validator = new LineValidator();
    }
    @Test
    public void testHasString() {
        boolean actual = this.validator.hasString(this.VALID_CONTENT);
        assertTrue(actual);
    }

    @Test
    public void testHasNotString(){
        boolean actual = this.validator.hasString(this.NOT_VALID_CONTENT);
        assertFalse(actual);
    }
}
package education.com.epam.taskone.service.impl;

import main.education.com.epam.taskone.entity.CustomArray;
import main.education.com.epam.taskone.service.impl.StreamSortImpl;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class StreamSortImplTest {

    private final StreamSortImpl streamSort = new StreamSortImpl();
    CustomArray customArray;

    @BeforeClass
    public void setCustomArray(){
        this.customArray = new CustomArray(new int[]{25, 15, 4, 1, 0, 0, -1, -7});
    }

    @Test
    public void testBubbleSort() {
        int[] actual = this.streamSort.bubbleSort(this.customArray);
        int[] expected = {25, 15, 4, 1, 0, 0, -1, -7};
        assertEquals(actual, expected);
    }

    @Test
    public void testStreamSort() {
        int[] actual = this.streamSort.streamSort(this.customArray);
        int[] expected = {-7, -1, 0, 0, 1, 4, 15, 25};
        assertEquals(actual, expected);
    }

    @AfterClass
    public void tierDown(){
        this.customArray = null;
    }
}
package holiday.tasks;

import holiday.tasks.BubbleSort;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BubbleSortTest {

    @Test
    public void bubbleSortTest() {
        int [] nums = {2, 18, 9, 4, 23, 6, 28, 27, 25};
        BubbleSort bubble = new BubbleSort();
        int [] numsInOrder = {2, 4, 6, 9, 18, 23, 25, 27, 28};
        int [] numsResult = bubble.sortArray(nums);
        assertArrayEquals(numsInOrder, numsResult);
    }
}

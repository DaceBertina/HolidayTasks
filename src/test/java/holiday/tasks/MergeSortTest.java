package holiday.tasks;

import holiday.tasks.MergeSort;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergeSortTest {

    @Test
    public void mergeSortTest() {
        int [] nums = {2, 18, 9, 4, 23, 6, 28, 27, 25};
        MergeSort merge = new MergeSort();
        int [] numsInOrder = {2, 4, 6, 9, 18, 23, 25, 27, 28};
        int [] numsResult = merge.sort(nums);
        assertArrayEquals(numsInOrder, numsResult);
    }
}

package holiday.tasks;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ArrayListTest {

    @Mock
    private ArrayList myList;

    @BeforeEach
    public void init(){
        myList = mock(ArrayList.class);
    }

    @Test
    public void addTest() {

        doNothing().when(myList).add(26); //default
        myList.add(26);

        verify(myList, times(1)).add(26);
    }

    @Test
    public void addByIndexTest() {

        myList.addByIndex(1, 7);

        verify(myList, times(1)).addByIndex(1, 7);
    }

    @Test
    public void getByIndexTest() {

        when(myList.getByIndex(anyInt())).thenReturn(1);

        int expected = 1;
        int actual = myList.getByIndex(3);

        assertEquals(expected, actual);
    }

    @Test
    public void deleteByIndexTest() {

        myList.deleteByIndex(1);

        verify(myList, times(1)).deleteByIndex(1);
    }
}

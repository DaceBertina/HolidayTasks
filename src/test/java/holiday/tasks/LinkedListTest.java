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
public class LinkedListTest {

    @Mock
    private LinkedList myList;

    @BeforeEach
    public void init(){
        myList = mock(LinkedList.class);
    }

    @Test
    public void insertTest() {

        doNothing().when(myList).insert(23); //default
        myList.insert(23);

        verify(myList, times(1)).insert(23);
    }

    @Test
    public void insertNthTest() {

        doNothing().when(myList).insertNth(13, 4);
        myList.insertNth(13, 4);

        verify(myList, times(1)).insertNth(13, 4);
    }

    @Test
    public void deleteByIndexTest() {

        doNothing().when(myList).deleteByIndex(4);
        myList.deleteByIndex( 4);

        verify(myList, times(1)).deleteByIndex( 4);
    }

    @Test
    public void getByIndexTest() {

        when(myList.getByIndex(anyInt())).thenReturn(1);

        int expected = 1;
        int actual = myList.getByIndex(3);

        assertEquals(expected, actual);
    }
}

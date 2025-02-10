
import Model.IntList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;


public class IntListTest {
    int[] array1;
    int[] array2;
    int[] array3;
    IntList intList;
    IntList intListMock;

    @BeforeEach
    void setUp() {
        intList = new IntList();
        array1 = new int[]{1,1,1,1,1};
        array2 = new int[]{1,1,1,1,1};
        array3 = new int[]{5,5,5};

    }


    @Test
    void compareListTest() {
        intListMock = mock(IntList.class);
        double average1 = intList.averageList(array2);
        double average2 = intList.averageList(array1);

        intListMock.compareList(average1,average2);

        verify(intListMock).compareList(average1,average2);
    }


    @Test
    void averageArrayTest() {

        assertThat(intList.averageList(array3)).isEqualTo(5.0);

    }
}

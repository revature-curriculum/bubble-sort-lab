import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BubbleSortTest {

    @Test
    public void whenGivenListOfIntegersOfLength5SortsAscending(){
        Integer[] result = BubbleSort.sort(new Integer[]{4,2,1,5,3});
        assertEquals(1, result[0]);
        assertEquals(2, result[1]);
        assertEquals(3, result[2]);
        assertEquals(4, result[3]);
        assertEquals(5, result[4]);
    }

    @Test
    public void whenGivenListOfIntegersOfLength20SortsAscending(){
        Integer[] result = BubbleSort.sort(new Integer[]{
                4,2,1,5,3,20,17,19,6,7,14,11,8,10,9,13,12,18,15,13
        });

        assertEquals(1, result[0]);
        assertEquals(20, result[19]);
    }
}

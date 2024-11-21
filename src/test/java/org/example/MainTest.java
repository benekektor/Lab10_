import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MainTest {

    @Test
    public void testArrayInitializationAndSorting() {
        int[] ints = new int[10];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = 10 - i;
        }

        int[] expectedInitializedArray = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        assertArrayEquals(expectedInitializedArray, ints, "Масив ініціалізований некоректно");
        java.util.Arrays.sort(ints);
        int[] expectedSortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertArrayEquals(expectedSortedArray, ints, "Масив відсортований некоректно");
    }
}

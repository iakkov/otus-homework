package hello.world.pack.testing.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    @DisplayName("Метод 1")
    void arrayFromTheLastOne() {
        int[] expectedArray = new int[] {2, 2};
        int[] actualArray = Main.arrayFromTheLastOne(new int[] {1, 2, 1, 2, 2});
        Assertions.assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    @DisplayName("Метод 2")
    void isCorrectArray() {
        int[] array1 = new int[] {1, 2};
        int[] array2 = new int[] {1, 1};
        int[] array3 = new int[] {1, 3};
        int[] array4 = new int[] {1, 2, 2, 1};

        Assertions.assertTrue(Main.isCorrectArray(array1));
        Assertions.assertFalse(Main.isCorrectArray(array2));
        Assertions.assertFalse(Main.isCorrectArray(array3));
        Assertions.assertTrue(Main.isCorrectArray(array4));
    }
}
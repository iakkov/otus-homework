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
    @DisplayName("Метод 2 c true")
    void isCorrectArrayTrue() {
        int[] array1 = new int[] {1, 2};
        int[] array4 = new int[] {1, 2, 2, 1};

        boolean trueArray1 = Main.isCorrectArray(array1);
        boolean trueArray2 = Main.isCorrectArray(array4);

        Assertions.assertTrue(trueArray1);
        Assertions.assertTrue(trueArray2);
    }
    @Test
    @DisplayName("Метод 2 с false")
    void isCorrectArrayFalse() {
        int[] array2 = new int[] {1, 1};
        int[] array3 = new int[] {1, 3};

        boolean falseArray1 = Main.isCorrectArray(array2);
        boolean falseArray2 = Main.isCorrectArray(array3);

        Assertions.assertFalse(falseArray1);
        Assertions.assertFalse(falseArray2);
    }
}
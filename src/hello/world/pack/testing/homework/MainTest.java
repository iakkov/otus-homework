package hello.world.pack.testing.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class MainTest {
    static Stream<Arguments> providerOfTrueArrays() {
        return Stream.of(
                Arguments.of(new int[] {1, 2}, true),
                Arguments.of(new int[] {1, 2, 2, 1}, true)
        );
    }
    static Stream<Arguments> providerOfFalseArrays() {
        return Stream.of(
                Arguments.of(new int[] {1, 1}, false),
                Arguments.of(new int[] {1, 3}, false)
        );
    }

    @Test
    @DisplayName("Метод 1")
    void arrayFromTheLastOne() {
        int[] expectedArray = new int[] {2, 2};

        int[] actualArray = Main.arrayFromTheLastOne(new int[] {1, 2, 1, 2, 2});

        Assertions.assertArrayEquals(expectedArray, actualArray);
    }

    @ParameterizedTest
    @MethodSource("providerOfTrueArrays")
    @DisplayName("Метод 2 c true")
    void isCorrectArrayTrue(int[] array, boolean expected) {
        boolean trueArray = Main.isCorrectArray(array);

        Assertions.assertTrue(trueArray);
    }
    @ParameterizedTest
    @MethodSource("providerOfFalseArrays")
    @DisplayName("Метод 2 c false")
    void isCorrectArrayFalse(int[] array, boolean expected) {
        boolean falseArray = Main.isCorrectArray(array);

        Assertions.assertFalse(falseArray);
    }
}
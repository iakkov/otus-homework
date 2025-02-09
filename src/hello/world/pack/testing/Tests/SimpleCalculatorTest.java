package hello.world.pack.testing.Tests;

import hello.world.pack.testing.SimpleCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SimpleCalculatorTest {
    // Подход AAA (Arrange-Act-Assert)
    // Arrange - подготовка данных и окружения для теста
    private SimpleCalculator simpleCalculator;
    // Act - выполнение тестируемого кода
    // Assert - проверка результата
    @Test
    @DisplayName("Это метод сложения!")
    void testAdd() {
        simpleCalculator = new SimpleCalculator();
        Assertions.assertEquals(2, simpleCalculator.add(1, 1));
    }

    @Test
    void subtract() {
        simpleCalculator = new SimpleCalculator();
        Assertions.assertEquals(5, simpleCalculator.subtract(10, 5));
    }

    @Test
    void multiply() {
        simpleCalculator = new SimpleCalculator();
        Assertions.assertEquals(16, simpleCalculator.multiply(4, 4));
    }

    @Test
    void divide() {
        simpleCalculator = new SimpleCalculator();
        Assertions.assertEquals(4, simpleCalculator.divide(8, 2));
    }
}
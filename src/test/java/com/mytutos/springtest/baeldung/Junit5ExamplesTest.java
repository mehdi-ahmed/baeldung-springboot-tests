package com.mytutos.springtest.baeldung;

import org.junit.jupiter.api.*;

import java.util.List;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

public class Junit5ExamplesTest {

    private static final Logger logger = Logger.getLogger(Junit5ExamplesTest.class.getName());

    @BeforeAll
    public static void setup() {
        logger.info("@BeforeEach - executes before each test method in test class");
    }

    @AfterAll
    static void done() {
        logger.info("@AfterAll - executed after all test methods.");
    }

    @BeforeEach
    void init() {
        logger.info("@BeforeEach - executes before each test method in this class");
    }

    @DisplayName("Single test successful")
    @Test
    void testSingleSuccessTest() {
        logger.info("Success");
    }

    @AfterEach
    void tearDown() {
        logger.info("@AfterEach - executed after each test method.");
    }

    @Test
    @Disabled("Not yet Implemented")
    void testShowSomething() {
    }


    @Test
    void testLambdaExpression() {
        List<Integer> numbers = List.of(1, 2, 3, 4);
        assertTrue(numbers.stream()
                .mapToInt(Integer::intValue)
                .sum() > 5, "Sum Should be greater than 5");
    }

    @Test
    void testGroupAssertion() {
        int[] numbers = {1, 2, 3, 4, 5};
        assertAll("numbers",
                () -> assertEquals(numbers[0], 1),
                () -> assertEquals(numbers[1], 2),
                () -> assertEquals(numbers[2], 3)
        );
    }

    @Test
    void trueAssumption() {
        assumeTrue(5 > 1);
        assertEquals(5 + 2, 7);
    }

    @Test
    void falseAssumption() {
        assumeFalse(5 < 1);
        assertEquals(5 + 2, 7);
    }

    @Test
    void assumptionThat() {
        String someString = "Just a string";
        assumingThat(
                someString.equals("Just a string"),
                () -> assertEquals(2 + 2, 4)
        );
    }

    @Test
    void shouldThrowException() {
        Throwable exception = assertThrows(UnsupportedOperationException.class, () -> {
            throw new UnsupportedOperationException("Not Supported");
        });
        assertEquals("Not Supported", exception.getMessage());
    }

    @Test
    void assertThrowException() {
        String str = null;
        assertThrows(IllegalArgumentException.class, () -> {
            Integer.valueOf(str);
        });
    }

}



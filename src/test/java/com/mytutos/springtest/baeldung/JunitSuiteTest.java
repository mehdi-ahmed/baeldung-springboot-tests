package com.mytutos.springtest.baeldung;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

public class JunitSuiteTest {

    private static final Logger logger = Logger.getLogger(Junit5ExamplesTest.class.getName());

    @DisplayName("Single test successful")
    @Test
    void testSingleSuccessTest() {
        logger.info("Success");
    }
}

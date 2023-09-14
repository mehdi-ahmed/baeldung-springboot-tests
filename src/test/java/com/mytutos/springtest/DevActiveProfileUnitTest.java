package com.mytutos.springtest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = ActiveProfileExampleApplication.class)
public class DevActiveProfileUnitTest {

    @Value("${profile.property.value}")
    private String propertyString;

    @Test
    public void whenDevIsActive_ThenValueShouldBeKeptFromApplicationYaml() {
        Assertions.assertEquals("This the the application.yaml file", propertyString);

    }
}



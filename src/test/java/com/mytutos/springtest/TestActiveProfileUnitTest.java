package com.mytutos.springtest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest(classes = ActiveProfileExampleApplication.class)
@ActiveProfiles(value = "prod")
public class TestActiveProfileUnitTest {

    @Value("${profile.property.value}")
    private String propertyString;

    @Test
    public void whenDevIsActive_ThenValueShouldBeKeptFromApplicationYaml() {
        Assertions.assertEquals("This the the application-prod.yaml file", propertyString);
    }
}

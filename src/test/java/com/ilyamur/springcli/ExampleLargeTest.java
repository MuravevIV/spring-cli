package com.ilyamur.springcli;

import com.ilyamur.springcli.configuration.ApplicationProfile;
import com.ilyamur.springcli.configuration.TestConfiguration;
import com.ilyamur.springcli.service.ExampleService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@Import(TestConfiguration.class)
@ActiveProfiles(ApplicationProfile.TEST)
public class ExampleLargeTest {

    @Autowired
    private ExampleService exampleService;

    @Test
    public void bigTestExample() {
        int result = exampleService.run("testInput", "testOutput");

        assertEquals(1, result);
    }
}

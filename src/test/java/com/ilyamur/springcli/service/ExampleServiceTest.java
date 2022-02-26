package com.ilyamur.springcli.service;

import com.ilyamur.springcli.repository.ApplicationRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class ExampleServiceTest {

    @Mock
    private ApplicationRepository applicationRepository;

    @InjectMocks
    private ExampleService exampleService;

    @Test
    public void testExample() {
        doReturn(1).when(applicationRepository).load("testInput");

        int result = exampleService.run("testInput", "testOutput");

        verify(applicationRepository).load("testInput");
        assertEquals(1, result);
    }
}

package com.example.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.example.models.ExampleModel;
import com.example.repositories.ExampleRepository;

public class ExampleServiceTest {

    @Mock
    private ExampleRepository exampleRepository;

    @InjectMocks
    private ExampleService exampleService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetAllExamples() {
        List<ExampleModel> exampleList = new ArrayList<>();
        exampleList.add(new ExampleModel(1L, "Example 1"));
        exampleList.add(new ExampleModel(2L, "Example 2"));

        when(exampleRepository.findAll()).thenReturn(exampleList);

        List<ExampleModel> result = exampleService.getAllExamples();

        assertEquals(exampleList.size(), result.size());
        assertEquals(exampleList.get(0).getId(), result.get(0).getId());
        assertEquals(exampleList.get(0).getName(), result.get(0).getName());
        assertEquals(exampleList.get(1).getId(), result.get(1).getId());
        assertEquals(exampleList.get(1).getName(), result.get(1).getName());
    }

    // Add more test cases here
}
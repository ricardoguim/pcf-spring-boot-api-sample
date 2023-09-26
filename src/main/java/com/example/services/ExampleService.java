package com.example.services;

import com.example.models.ExampleModel;
import com.example.repositories.ExampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExampleService {

    @Autowired
    private ExampleRepository exampleRepository;

    public List<ExampleModel> getAllExamples() {
        return exampleRepository.findAll();
    }

    public ExampleModel getExampleById(Long id) {
        return exampleRepository.findById(id).orElse(null);
    }

    public ExampleModel createExample(ExampleModel example) {
        return exampleRepository.save(example);
    }

    public ExampleModel updateExample(Long id, ExampleModel example) {
        ExampleModel existingExample = exampleRepository.findById(id).orElse(null);
        if (existingExample != null) {
            existingExample.setName(example.getName());
            return exampleRepository.save(existingExample);
        }
        return null;
    }

    public boolean deleteExample(Long id) {
        ExampleModel existingExample = exampleRepository.findById(id).orElse(null);
        if (existingExample != null) {
            exampleRepository.delete(existingExample);
            return true;
        }
        return false;
    }
}
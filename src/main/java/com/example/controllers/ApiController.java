package com.example.controllers;

import com.example.models.ExampleModel;
import com.example.services.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired
    private ExampleService exampleService;

    @GetMapping("/example/{id}")
    public ResponseEntity<ExampleModel> getExample(@PathVariable Long id) {
        ExampleModel example = exampleService.getExampleById(id);
        if (example == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(example, HttpStatus.OK);
    }

    @PostMapping("/example")
    public ResponseEntity<ExampleModel> createExample(@RequestBody ExampleModel example) {
        ExampleModel createdExample = exampleService.createExample(example);
        return new ResponseEntity<>(createdExample, HttpStatus.CREATED);
    }

    @PutMapping("/example/{id}")
    public ResponseEntity<ExampleModel> updateExample(@PathVariable Long id, @RequestBody ExampleModel example) {
        ExampleModel updatedExample = exampleService.updateExample(id, example);
        if (updatedExample == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(updatedExample, HttpStatus.OK);
    }

    @DeleteMapping("/example/{id}")
    public ResponseEntity<Void> deleteExample(@PathVariable Long id) {
        boolean deleted = exampleService.deleteExample(id);
        if (!deleted) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
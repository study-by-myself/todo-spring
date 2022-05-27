package org.example.controller;

import lombok.AllArgsConstructor;
import org.example.model.TodoResponse;
import org.example.service.TodoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@AllArgsConstructor
@RestController
@RequestMapping
public class TodoController {
    private final TodoService service;

    @PostMapping
    public ResponseEntity<TodoResponse> create() {
        System.out.println("Create");
        return null;
    }

    @GetMapping("{id}")
    public ResponseEntity<TodoResponse> readOne() {
        System.out.println("Read One");
        return null;
    }

    @GetMapping
    public ResponseEntity<List<TodoResponse>> readAll() {
        System.out.println("Read All");
        return null;
    }

    @PatchMapping("{id}")
    public ResponseEntity<TodoResponse> update() {
        System.out.println("Update");
        return null;
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteOne() {
        System.out.println("Delete");
        return null;
    }

    @DeleteMapping
    public ResponseEntity<?> deleteAll() {
        System.out.println("Delete All");
        return null;
    }

}

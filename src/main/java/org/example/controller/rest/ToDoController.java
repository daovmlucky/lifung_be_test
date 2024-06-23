package org.example.controller.rest;

import org.example.controller.dto.ToDoRequest;
import org.example.controller.dto.ToDoResponse;
import org.example.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Size;
import java.util.List;

@RestController
@RequestMapping("/api/todo")
@Validated
public class ToDoController {

    @Autowired
    private ToDoService toDoService;

    @PostMapping
    public ResponseEntity<ToDoResponse> createToDoItem(@RequestBody @Valid ToDoRequest toDoItem) {
        ToDoResponse createdToDoItem = toDoService.createToDoItem(toDoItem);
        return ResponseEntity.ok(createdToDoItem);
    }

    @GetMapping("/{userId}")
    public ResponseEntity<List<ToDoResponse>> getToDoItemsByUserId(@PathVariable @Size(max = 50) String userId) {
        List<ToDoResponse> toDoItems = toDoService.getToDoItemsByUserId(userId);
        return ResponseEntity.ok(toDoItems);
    }
}

package org.example.service.impl;

import org.example.controller.dto.ToDoRequest;
import org.example.controller.dto.ToDoResponse;
import org.example.infra.repository.ToDoItemRepository;
import org.example.infra.repository.entity.ToDoItem;
import org.example.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ToDoServiceImpl implements ToDoService {

    @Autowired
    private ToDoItemRepository toDoItemRepository;

    @Override
    @Transactional
    public ToDoResponse createToDoItem(ToDoRequest request) {
        var toDoItem = ToDoItem.builder()
                .userId(request.getUserId())
                .description(request.getDescription())
                .completed(request.isCompleted())
                .build();
        var toDoItemCreated = toDoItemRepository.save(toDoItem);
        return ToDoResponse.builder()
                .userId(toDoItemCreated.getUserId())
                .description(toDoItemCreated.getDescription())
                .completed(toDoItemCreated.isCompleted())
                .build();
    }

    @Override
    public List<ToDoResponse> getToDoItemsByUserId(String userId) {
        List<ToDoItem> toDoList = toDoItemRepository.findByUserId(userId);
        return toDoList.stream()
                .map(todo -> ToDoResponse.builder().userId(todo.getUserId()).description(todo.getDescription()).completed(todo.isCompleted()).build())
                .collect(Collectors.toList());
    }


}

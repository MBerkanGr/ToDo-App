package com.mehmetberkan.ToDoApp.service;

import com.mehmetberkan.ToDoApp.model.Todo;

import java.util.List;

public interface TodoService {
    List<Todo> getAllTodo();
    Todo getTodoById(int id);
    Todo addTodo(Todo todo);
    void deleteTodo(int id);
}

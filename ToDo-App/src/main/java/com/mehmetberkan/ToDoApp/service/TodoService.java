package com.mehmetberkan.ToDoApp.service;

import com.mehmetberkan.ToDoApp.model.Todo;

import java.util.List;

public interface TodoService {
    List<Todo> getAllTodo();
    Todo getTodoById(int id);
    Todo addTodo(Todo todo);
    Todo updateTodo(int id, Todo todo);
    String deleteTodo(int id);
    List<Todo> getAllDone();
    List<Todo> getAllNotdone();
    Todo changeStatus(int id, Boolean status);
    Todo changeContent(int id, String content);
}

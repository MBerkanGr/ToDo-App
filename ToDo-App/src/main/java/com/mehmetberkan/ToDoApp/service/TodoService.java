package com.mehmetberkan.ToDoApp.service;

import com.mehmetberkan.ToDoApp.model.Todo;

import java.util.List;

public interface TodoService {
    public List<Todo> getAll();
    public Todo getById(int id);
}

package com.mehmetberkan.ToDoApp.service;

import com.mehmetberkan.ToDoApp.model.Todo;
import com.mehmetberkan.ToDoApp.repository.TodoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoManager implements TodoService {

    private TodoDao todoDao;

    @Autowired
    public TodoManager(TodoDao todoDao) {
        super();
        this.todoDao = todoDao;
    }

    @Override
    public List<Todo> getAll() {
        return todoDao.findAll();

    }

    @Override
    public Todo getById(int id) {
         return todoDao.findAll().get(id);
    }
}

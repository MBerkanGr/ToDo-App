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
    public List<Todo> getAllTodo() {
        return todoDao.findAll();

    }

    @Override
    public Todo getTodoById(int id) {
         return todoDao.findById(id).get();
    }

    @Override
    public Todo addTodo(Todo todo) {
        return todoDao.save(todo);
    }

    @Override
    public Todo updateTodo(int id, Todo todoDto) {
        Todo todo = todoDto;
        todo.setId(id);
        return todoDao.save(todo);
    }

    @Override
    public String deleteTodo(int id) {
        try {
            todoDao.deleteById(id);
            return "Successfully deleted";
        }catch (Exception e) {
            return "Unsuccessful ( " + e.getMessage() + " )";
        }
    }

    @Override
    public List<Todo> getAllDone() {
       return todoDao.findAllByStatusTrue();
    }

    @Override
    public List<Todo> getAllNotdone() {
        return todoDao.findAllByStatusFalse();
    }

    @Override
    public List<Todo> getAllByUserId(int id) {
        return todoDao.findAllByUserId(id);
    }

    @Override
    public Todo changeStatus(int id, Boolean status) {
        Todo todo = todoDao.getById(id);
        todo.setStatus(status);
        return todoDao.save(todo);
    }

    @Override
    public Todo changeContent(int id, String content) {
        Todo todo = todoDao.getById(id);
        todo.setContent(content);
        return todoDao.save(todo);
    }
}

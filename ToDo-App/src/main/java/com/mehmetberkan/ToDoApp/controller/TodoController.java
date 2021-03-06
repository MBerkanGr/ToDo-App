package com.mehmetberkan.ToDoApp.controller;

import com.mehmetberkan.ToDoApp.model.Todo;
import com.mehmetberkan.ToDoApp.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Todo")
public class TodoController {
    private TodoService todoService;

    @Autowired
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping("/getAll")
    public List<Todo> getAllTodo(){
        return todoService.getAllTodo();
    }

    @GetMapping("/getById")
    public Todo getTodoById(@RequestParam("Id") int id){
        return todoService.getTodoById(id);
    }

    @PostMapping("/add")
    public Todo addTodo(@RequestBody Todo todo){
        return todoService.addTodo(todo);
    }

    @PutMapping("/update")
    public Todo updateTodo(@RequestParam("Id") int id, @RequestBody Todo todo){
        return todoService.updateTodo(id,todo);
    }

    @DeleteMapping("/delete")
    public String deleteTodo(@RequestParam("Id") int id){
         return todoService.deleteTodo(id);
    }

    @GetMapping("/getAllDone")
    public List<Todo> getAllDone(){
        return todoService.getAllDone();
    }

    @GetMapping("/getAllNotdone")
    public List<Todo> getAllNotdone(){
        return todoService.getAllNotdone();
    }

    @GetMapping("/getAllByUserId")
    public List<Todo> getTodoByUserId(@RequestParam("Id") int id){
        return todoService.getAllByUserId(id);
    }

    @PutMapping("/changeStatus")
    public Todo changeStatus(@RequestParam("Id") int id,@RequestParam("status") Boolean status){
        return todoService.changeStatus(id,status);
    }

    @PutMapping("/changeContent")
    public Todo changeContent(@RequestParam("Id") int id,@RequestParam("content") String content){
        return todoService.changeContent(id,content);
    }
}

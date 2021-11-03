package com.mehmetberkan.ToDoApp.repository;

import com.mehmetberkan.ToDoApp.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TodoDao extends JpaRepository<Todo,Integer> {
    List<Todo> findAllByStatusTrue();
    List<Todo> findAllByStatusFalse();
}

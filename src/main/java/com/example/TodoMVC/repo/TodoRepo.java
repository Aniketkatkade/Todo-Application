package com.example.TodoMVC.repo;

import com.example.TodoMVC.entity.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TodoRepo {

    @Autowired
    List<Todo> todoList;

    public List<Todo> getTodoList() {
        return todoList;
    }

}

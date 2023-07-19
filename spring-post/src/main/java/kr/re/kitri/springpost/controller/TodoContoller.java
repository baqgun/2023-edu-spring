package kr.re.kitri.springpost.controller;

import kr.re.kitri.springpost.model.Todo;
import kr.re.kitri.springpost.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoContoller {

    @Autowired
    private TodoService todoService;

    @GetMapping("todos")
    public List<Todo> getAllTodo(){
        return todoService.getAllTodo();
    }

    @GetMapping("todos/{todoId}")
    public Todo getTodoById(@PathVariable long todoId){
        return todoService.getAllTodo(todoId);
    }

    @PostMapping("todos")
    public Todo registTodo(@RequestBody Todo todo){
        return todoService.registTodo(todo);
    }

    @PutMapping("todos/{todoId}")
    public Todo modifyTodo(@RequestBody Todo todo){
        return todoService.modifyTodo(todo);
    }

    @DeleteMapping("todos/{todoId}")
    public Todo deleteTodo(@PathVariable int todoId){
        return todoService.deleteTodo(todoId);
    }




}

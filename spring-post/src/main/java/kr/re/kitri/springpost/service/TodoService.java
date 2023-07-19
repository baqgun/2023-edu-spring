package kr.re.kitri.springpost.service;

import kr.re.kitri.springpost.model.Todo;
import kr.re.kitri.springpost.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    @Autowired
    private TodoRepository repository;

    public List<Todo> getAllTodo() {

        return repository.selectAllTodo();
    }

    public Todo getAllTodo(long todoId) {
        return repository.selectTodoByid(todoId);
    }

    public Todo registTodo(Todo todo) {
        return repository.insertTodo(todo);
    }

    public Todo modifyTodo(Todo todo) {
        return repository.updateTodo(todo);
    }

    public Todo deleteTodo(int todoId) {
        return repository.deleteTodo(todoId);
    }
}

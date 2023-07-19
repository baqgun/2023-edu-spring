package kr.re.kitri.springpost.repository;

import kr.re.kitri.springpost.model.Todo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@Mapper
public interface TodoRepository {
    List<Todo> selectAllTodo();

    Todo selectTodoByid(long todoId);

    Todo insertTodo(Todo todo);

    Todo updateTodo(Todo todo);

    Todo deleteTodo(int todoId);
}

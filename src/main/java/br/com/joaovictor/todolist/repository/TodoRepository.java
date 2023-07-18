package br.com.joaovictor.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.joaovictor.todolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}

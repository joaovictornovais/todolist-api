package br.com.joaovictor.todolist;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.joaovictor.todolist.entity.Todo;

@SpringBootTest
class TodolistApplicationTests {

	@Test
	void testCreateTodoSuccess() {
		var todo = new Todo("todo 1", "todo 1 desc", false, 2);
	}
	
	@Test
	void testCreateTodoFailure() {
		
	}

}

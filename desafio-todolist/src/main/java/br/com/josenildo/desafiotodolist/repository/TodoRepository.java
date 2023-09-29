package br.com.josenildo.desafiotodolist.repository;

import br.com.josenildo.desafiotodolist.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}

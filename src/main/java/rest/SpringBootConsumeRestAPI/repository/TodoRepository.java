package rest.SpringBootConsumeRestAPI.repository;

import org.springframework.data.repository.CrudRepository;
import rest.SpringBootConsumeRestAPI.model.Todo;

public interface TodoRepository extends CrudRepository<Todo, Integer> {
}

package rest.SpringBootConsumeRestAPI;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import rest.SpringBootConsumeRestAPI.model.Todo;
import rest.SpringBootConsumeRestAPI.srevice.JsonPlaceholderService;

import java.util.List;
import java.util.logging.Logger;

@SpringBootApplication
public class SpringBootConsumeRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootConsumeRestApiApplication.class, args);
	}

	@Bean
	RestTemplate restTemplate(){
		return new RestTemplate();
	}

	@Bean
	CommandLineRunner commandLineRunner(JsonPlaceholderService jsonPlaceholderService){
		return args -> {
			//When application loads get Todos from RestApi
			List<Todo> todos = jsonPlaceholderService.getTodos();
			for(Todo todo : todos){
				System.out.println(todo.toString());
			}
		};
	}
}

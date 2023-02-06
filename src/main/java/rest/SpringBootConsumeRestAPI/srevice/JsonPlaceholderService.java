package rest.SpringBootConsumeRestAPI.srevice;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import rest.SpringBootConsumeRestAPI.model.Todo;

import java.util.List;

@Service
public class JsonPlaceholderService {
    private final String URL = "https://jsonplaceholder.typicode.com/todos";
    private final RestTemplate restTemplate;

    public JsonPlaceholderService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<Todo> getTodos(){
        ResponseEntity<List<Todo>> todoList = restTemplate.exchange(URL, HttpMethod.GET, null, new ParameterizedTypeReference<List<Todo>>() {});

        return todoList.getBody();
    }
}

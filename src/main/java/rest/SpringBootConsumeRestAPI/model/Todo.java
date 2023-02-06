package rest.SpringBootConsumeRestAPI.model;

import org.springframework.data.annotation.Id;

public record Todo(@Id Integer id, Integer user_id, String title, boolean completed) {

}

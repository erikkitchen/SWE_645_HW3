package Erik.Kitchen.studentsurvey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class StudentSurveyApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentSurveyApplication.class, args);
	}

}
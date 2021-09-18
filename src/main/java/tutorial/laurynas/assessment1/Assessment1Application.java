package tutorial.laurynas.assessment1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tutorial.laurynas.assessment1.sum.DoSum;

@SpringBootApplication
public class Assessment1Application {

	public static void main(String[] args) {
		SpringApplication.run(Assessment1Application.class, args);
	}

}


package xv.training.SpringBootentity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import xv.training.SpringBootentity.entities.Student;
import xv.training.SpringBootentity.repositories.StudentRepository;

@SpringBootApplication
public class SpringBootentityApplication {
	// inject student repository in main class

	@Autowired
	private StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootentityApplication.class, args);
		System.out.println("hi hello");
	}

	// add command line runner outside main method
	// add some student data
	@Bean
	CommandLineRunner runner() {
		return args -> {
			// save student data
			studentRepository.save(new Student("gowthami", "female", "b.tech", 21));
			studentRepository.save(new Student("suresh", "male", "b.tech", 27));
			studentRepository.save(new Student("gowtham", "male", "b.tech", 22));
			studentRepository.save(new Student("karthik", "male", "b.tech", 20));

		};

	}

}

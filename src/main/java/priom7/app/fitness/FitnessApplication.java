package priom7.app.fitness;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import test.bar.TestClass;

@SpringBootApplication
public class FitnessApplication {

	public static void main(String[] args) {

		var testText = new TestClass();
		SpringApplication.run(FitnessApplication.class, args);
		System.out.println("Fitness Application started");
		System.out.println(testText.testMethod());
	}

}

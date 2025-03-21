package ma.amine.charite_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChariteAppApplication  implements CommandLineRunner {
@Autowired

    public static void main(String[] args) {
        SpringApplication.run(ChariteAppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}

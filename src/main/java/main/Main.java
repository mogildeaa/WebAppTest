package main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//dbRestController", "entities", "mvc", "repository
@SpringBootApplication
@EnableJpaRepositories("repository")
@ComponentScan({ "resources", "webapp", "dbRestController", "mvc", "main","services","security" })
@EntityScan("entities")
public class Main extends SpringBootServletInitializer{
	
	@Override
    protected SpringApplicationBuilder configure (SpringApplicationBuilder application) {
        return application.sources(Main.class);
    }

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}
}

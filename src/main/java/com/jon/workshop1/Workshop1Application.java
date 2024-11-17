package com.jon.workshop1;

import java.util.Collections;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.DefaultApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class Workshop1Application {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Workshop1Application.class);


		//CLI
		//mvn spring-boot:run -Dspring-boot.run.arguments="--server.port=8082"
        // mvn spring-boot:run -Dspring-boot.run.arguments="--server.port=8082 --file=abc.txt"
		//java -jar target/workshop1-0.0.1-SNAPSHOT.jar --server.port=8082
		

		//ENV
		//PORT=8083 mvn spring-boot:run
		//PORT=8083 java -jar target/workshop1-0.0.1-SNAPSHOT.jar

        // Determine port based on CLI arguments or environment variable
        String port = "6000"; // Default port
        ApplicationArguments cliOpts = new DefaultApplicationArguments(args);

        // Check CLI option "--port"
        if (cliOpts.containsOption("port")) {
            port = cliOpts.getOptionValues("port").get(0);
        } else {
            // Check environment variable "PORT"
            String envPort = System.getenv("PORT");
            if (envPort != null) {
                port = envPort;
            }
        }
        String dirFile = "";
        if (cliOpts.containsOption("file")) {
            dirFile = cliOpts.getOptionValues("file").get(0);
            System.out.println("Directory file: " + dirFile );
        }

        // Set the port as a default property
        app.setDefaultProperties(Collections.singletonMap("server.port", port));

        // Run the application
        ConfigurableApplicationContext context = app.run(args);

        // Retrieve and print the actual port the application is running on
        String actualPort = context.getEnvironment().getProperty("server.port");
        System.out.printf("Application has started on port %s\n", actualPort);

    
    }
}

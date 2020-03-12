package pt.angelopingo.examples;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import pt.angelopingo.examples.bean.App;

@Slf4j
@SpringBootApplication
public class MainApp {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(MainApp.class, args);
        App app = applicationContext.getBean(App.class);
        app.run();

        applicationContext.registerShutdownHook();
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            log.warn("Shutting down application graciously...");
            log.info("Application terminated.");
        }));
    }

}

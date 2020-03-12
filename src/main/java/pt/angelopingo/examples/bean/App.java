package pt.angelopingo.examples.bean;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pt.angelopingo.examples.config.Configurations;

@Slf4j
@Component
public class App {

    private final Configurations configurations;

    @Autowired
    public App(Configurations configurations) {
        this.configurations = configurations;
    }

    public void run() {
        log.debug("Application started.");
        System.out.println("Hello World");
        System.out.println("Encoding: " + configurations.getEncoding());
        System.out.println("BigQuery Dataset: " + configurations.getBigQuery().getDataset());
        System.out.println("BigQuery Table: " + configurations.getBigQuery().getTable());
    }

}

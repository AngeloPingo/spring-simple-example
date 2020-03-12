package pt.angelopingo.examples.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Component
@ConfigurationProperties(prefix = "app", ignoreUnknownFields = false)
@Validated
@Data
public class Configurations {

    @Value("${encoding:UTF-8}")
    private String encoding;

    private BigQuery bigQuery;

    @Data
    public static class BigQuery {
        private String dataset;
        private String table;
    }

}

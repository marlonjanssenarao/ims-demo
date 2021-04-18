package tech.arao.ims;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import tech.arao.ims.model.*;

import java.io.File;

@SpringBootApplication
public class ImsRestConsumerApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(ImsRestConsumerApplication.class);


    public static void main(String[] args) {
        SpringApplication.run(ImsRestConsumerApplication.class, args);
    }


    @Bean
    public RestTemplate build(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    public CommandLineRunner run(RestTemplate template) {
        return args -> {
//            Subscriber subscriber = template.getForObject("http://localhost:8080/ims/subscribers",
//                                                          Subscriber.class);
//            LOGGER.info(subscriber.toString());

            ObjectMapper mapper = new ObjectMapper();
            mapper.enableDefaultTyping();
            Subscriber subscriber = new Subscriber("18675181010")
                    .setUsername("16045906403")
                    .setPassword("p@ssw0rd!")
                    .setDomain("ims.mnc660.mcc302.3gppnetwork.org")
                    .setStatus(Status.ACTIVE)
                    .setFeature(new CallForwardNoReply(true, "tel:+18675182800"));
            mapper.writeValue(new File("target/test.json"), subscriber);
        };
    }
}

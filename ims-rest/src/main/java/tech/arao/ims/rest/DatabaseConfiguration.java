package tech.arao.ims.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tech.arao.ims.rest.persistence.model.StandardFeature;
import tech.arao.ims.rest.persistence.model.Subscriber;
import tech.arao.ims.rest.persistence.repository.SubscriberRepository;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class DatabaseConfiguration {

    private static final Logger LOGGER = LoggerFactory.getLogger(DatabaseConfiguration.class);


    @Bean
    CommandLineRunner initDatabase(SubscriberRepository repository) {
        return args -> {
            List<StandardFeature> features = new ArrayList<>(1);

            features.add(new StandardFeature(true, "tel:+18675182800"));
            LOGGER.info("Preloading " + repository.save(new Subscriber("18675181010")
                                                                .setUsername("16045906403")
                                                                .setPassword("p@ssw0rd!")
                                                                .setDomain("ims.mnc660.mcc302.3gppnetwork.org")
                                                                .setStatus("ACTIVE")
                                                                //.setFeatures(features)
                                                       ));
            features.add(new StandardFeature(true, "tel:+18675182777"));
            LOGGER.info("Preloading " + repository.save(new Subscriber("18675181021")
                                                                .setUsername("16045906414")
                                                                .setPassword("p@ssw0rd!")
                                                                .setDomain("ims.mnc660.mcc302.3gppnetwork.org")
                                                                .setStatus("ACTIVE")
                                                                //.setFeatures(features)
                                                       ));
        };
    }
}

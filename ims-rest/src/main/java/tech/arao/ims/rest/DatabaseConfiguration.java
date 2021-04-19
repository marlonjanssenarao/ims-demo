package tech.arao.ims.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tech.arao.ims.rest.persistence.model.CallForwardNoReply;
import tech.arao.ims.rest.persistence.model.Feature;
import tech.arao.ims.rest.persistence.model.Status;
import tech.arao.ims.rest.persistence.model.Subscriber;
import tech.arao.ims.rest.persistence.repository.FeatureRepository;
import tech.arao.ims.rest.persistence.repository.SubscriberRepository;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class DatabaseConfiguration {

    private static final Logger LOGGER = LoggerFactory.getLogger(DatabaseConfiguration.class);


    @Bean
    CommandLineRunner initSubscriber(SubscriberRepository repository) {
        return args -> {
            LOGGER.info("PRELOADING Subscribers");

            LOGGER.info("Preloading Subscriber #1 >>> " +
                    repository.save(new Subscriber("18675181010")
                            .setUsername("16045906403")
                            .setPassword("p@ssw0rd!")
                            .setDomain("ims.mnc660.mcc302.3gppnetwork.org")
                            .setStatus(Status.ACTIVE)));
            LOGGER.info("Preloading Subscriber #2 >>> " +
                    repository.save(new Subscriber("18675181021")
                            .setUsername("16045906414")
                            .setPassword("p@ssw0rd!")
                            .setDomain("ims.mnc660.mcc302.3gppnetwork.org")
                            .setStatus(Status.ACTIVE)));
        };
    }

    @Bean
    CommandLineRunner initFeatures(FeatureRepository repository) {
        return args -> {
            LOGGER.info("PRELOADING Subscribers\' CallForwardNoReply");

            LOGGER.info("Preloading CallForwardNoReply #1 >>> " +
                    repository.save(new CallForwardNoReply(new Subscriber("18675181010")
                                                                   .setUsername("16045906403")
                                                                   .setPassword("p@ssw0rd!")
                                                                   .setDomain("ims.mnc660.mcc302.3gppnetwork.org")
                                                                   .setStatus(Status.ACTIVE),
                                                  "tel:+18675182800")));
            LOGGER.info("Preloading CallForwardNoReply #2 >>> " +
                    repository.save(new CallForwardNoReply(new Subscriber("18675181021")
                                                                   .setUsername("16045906414")
                                                                   .setPassword("p@ssw0rd!")
                                                                   .setDomain("ims.mnc660.mcc302.3gppnetwork.org")
                                                                   .setStatus(Status.ACTIVE),
                                                 "tel:+18675182800")));
        };
    }
}

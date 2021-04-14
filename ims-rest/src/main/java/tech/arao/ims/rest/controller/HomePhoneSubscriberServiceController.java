package tech.arao.ims.rest.controller;

import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.*;
import tech.arao.ims.rest.exception.SubscriberNotFoundException;
import tech.arao.ims.rest.model.Subscriber;
import tech.arao.ims.rest.repository.SubscriberRepository;

import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
public class HomePhoneSubscriberServiceController {

    private final SubscriberRepository repository;

    public HomePhoneSubscriberServiceController(SubscriberRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/ims/subscribers")
    public CollectionModel<EntityModel<Subscriber>> getAll() {

        List<EntityModel<Subscriber>> subscribers = repository.findAll().stream()
                .map(subscriber -> EntityModel.of(subscriber,
                                                  linkTo(methodOn(HomePhoneSubscriberServiceController.class).getOne(subscriber.getPhoneNumber())).withSelfRel(),
                                                  linkTo(methodOn(HomePhoneSubscriberServiceController.class).getAll()).withRel("subscribers")))
                .collect(Collectors.toList());

        return CollectionModel.of(subscribers, linkTo(methodOn(HomePhoneSubscriberServiceController.class).getAll()).withSelfRel());
    }

    @PostMapping("/ims/subscribers")
    public Subscriber create(@PathVariable Subscriber newSubscriber) {
        return repository.save(newSubscriber);
    }

    @GetMapping("/ims/subscribers/{phoneNumber}")
    public EntityModel<Subscriber> getOne(@PathVariable String phoneNumber) {
        Subscriber subscriber = repository.findById(phoneNumber)
                .orElseThrow(() -> new SubscriberNotFoundException(phoneNumber));

        return EntityModel.of(subscriber,
                linkTo(methodOn(HomePhoneSubscriberServiceController.class).getOne(phoneNumber)).withSelfRel(),
                linkTo(methodOn(HomePhoneSubscriberServiceController.class).getAll()).withRel("subscribers"));
    }

    @PutMapping("/ims/subscriber/{phoneNumber}")
    public Subscriber update(@RequestBody Subscriber newSubscriber, @PathVariable String phoneNumber) {
        return repository.findById(phoneNumber)
                         .map(subscriber -> {
                             subscriber.setPhoneNumber(newSubscriber.getPhoneNumber());
                             subscriber.setUsername(newSubscriber.getUsername());
                             subscriber.setPassword(newSubscriber.getPassword());
                             subscriber.setDomain(newSubscriber.getDomain());
                             subscriber.setStatus(newSubscriber.getStatus());
                             //subscriber.setFeatures(newSubscriber.getFeatures());

                             return repository.save(subscriber);
                         })
                         .orElseGet(() -> {
                             newSubscriber.setPhoneNumber(phoneNumber);
                             
                             return repository.save(newSubscriber);
                         });
    }

    @DeleteMapping("/ims/subscriber/{phoneNumber}")
    public void delete(@PathVariable String phoneNumber) {
        repository.deleteById(phoneNumber);
    }
}

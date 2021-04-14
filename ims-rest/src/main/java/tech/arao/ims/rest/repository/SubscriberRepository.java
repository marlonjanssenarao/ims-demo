package tech.arao.ims.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.arao.ims.rest.model.Subscriber;

public interface SubscriberRepository extends JpaRepository<Subscriber, String> {

}

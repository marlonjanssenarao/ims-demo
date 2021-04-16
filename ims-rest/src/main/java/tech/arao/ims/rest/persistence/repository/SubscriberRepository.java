package tech.arao.ims.rest.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.arao.ims.rest.persistence.model.Subscriber;

public interface SubscriberRepository extends JpaRepository<Subscriber, String> {

}

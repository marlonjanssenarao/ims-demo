package tech.arao.ims.rest.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.arao.ims.rest.persistence.model.Feature;

public interface FeatureRepository extends JpaRepository<Feature, Long> {
}

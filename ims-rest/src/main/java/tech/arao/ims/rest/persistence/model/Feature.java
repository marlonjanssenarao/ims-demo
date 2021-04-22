package tech.arao.ims.rest.persistence.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity(name = "Feature")
@Table(name = "FEATURE")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
        discriminatorType = DiscriminatorType.INTEGER,
        name = "feature_type_id",
        columnDefinition = "TINYINT(1)"
)
public abstract class Feature<F extends Feature> {

    @Id
    @GeneratedValue
    private Long id;
    private boolean provisioned;
    @ManyToOne(fetch = FetchType.LAZY)
    @NotNull(message = "\'Subscriber\' cannot be null.")
    private Subscriber subscriber;


    public Feature() {  }

    public Feature(boolean isProvisioned, Subscriber subscriber) {
        this.provisioned = isProvisioned;
        this.subscriber = subscriber;
    }


    public Long getId() {
        return id;
    }

    public Feature<F> setId(Long id) {
        this.id = id;
        return this;
    }

    public boolean isProvisioned() {
        return provisioned;
    }

    public Feature<F> setProvisioned(boolean provisioned) {
        this.provisioned = provisioned;
        return this;
    }

    public Subscriber getSubscriber() {
        return subscriber;
    }

    public Feature<F> setSubscriber(Subscriber subscriber) {
        this.subscriber = subscriber;
        return this;
    }
}

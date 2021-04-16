package tech.arao.ims.rest.persistence.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity(name = "Features")
@Table(name = "FEATURES")
public class StandardFeature {

    @Id
    @GeneratedValue
    private Long id;
    private boolean provisioned;
    private String destination;


    public StandardFeature() {  }

    public StandardFeature(boolean isProvisioned, String destination) {
        this.setProvisioned(isProvisioned);
        this.destination = destination;
    }


    public String getDestination() {
        return destination;
    }

    public StandardFeature setDestination(String destination) {
        this.destination = destination;
        return this;
    }

    public boolean isProvisioned() {
        return provisioned;
    }

    public StandardFeature setProvisioned(boolean provisioned) {
        this.provisioned = provisioned;
        return this;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StandardFeature)) return false;
        StandardFeature that = (StandardFeature) o;
        return provisioned == that.provisioned &&
                id.equals(that.id) &&
                destination.equals(that.destination);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, provisioned, destination);
    }

    @Override
    public String toString() {
        return "StandardFeature{" +
                "id=" + id +
                ", provisioned=" + provisioned +
                ", destination='" + destination + '\'' +
                '}';
    }
}

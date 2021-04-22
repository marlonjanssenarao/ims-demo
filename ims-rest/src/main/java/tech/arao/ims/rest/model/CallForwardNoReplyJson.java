package tech.arao.ims.rest.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;

public class CallForwardNoReplyJson extends FeatureJson {

    @NotBlank(message = "\'Destination\' must neither be null, empty nor blank!")
    private String destination;


    @JsonCreator
    public CallForwardNoReplyJson(@JsonProperty("destination") String destination) {
        super(true);
        this.destination = destination;
    }

    @JsonCreator
    public CallForwardNoReplyJson(@JsonProperty("provisioned") boolean isProvisioned,
                                  @JsonProperty("destination") String destination) {
        super(isProvisioned);
        this.destination = destination;
    }


    public String getDestination() {
        return destination;
    }

    public CallForwardNoReplyJson setDestination(String destination) {
        this.destination = destination;
        return this;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CallForwardNoReplyJson)) return false;

        CallForwardNoReplyJson that = (CallForwardNoReplyJson) o;

        return isProvisioned() == that.isProvisioned() &&
               destination.equals(that.destination);
    }

    @Override
    public int hashCode() {
        return 83 * Boolean.hashCode(isProvisioned()) +
                    destination.hashCode();
    }

    @Override
    public String toString() {
        return "CallForwardNoReplyJson{" +
                "provisioned=" + isProvisioned() +
                ", destination=\"" + destination + '\"' +
                '}';
    }
}

package tech.arao.ims.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;


public class CallForwardNoReply extends Feature {

    @NotBlank(message = "\'Destination\' must neither be null, empty nor blank!")
    private String destination;


    @JsonCreator
    public CallForwardNoReply(@JsonProperty("provisioned") boolean isProvisioned,
                              @JsonProperty("destination") CharSequence destination) {
        super(isProvisioned);
        this.destination = destination.toString();
    }


    public String getDestination() {
        return destination;
    }

    public CallForwardNoReply setDestination(CharSequence destination) {
        this.destination = destination.toString();
        return this;
    }
}

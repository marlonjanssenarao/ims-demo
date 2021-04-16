package tech.arao.ims.rest.persistence.model;

public class CallForwardNoReply extends Feature {

    private String destination;


    public CallForwardNoReply() {  }

    public CallForwardNoReply(boolean isProvisioned, String destination) {
        this.setProvisioned(isProvisioned);
        this.destination = destination;
    }


    public String getDestination() {
        return destination;
    }

    public CallForwardNoReply setDestination(String destination) {
        this.destination = destination;
        return this;
    }
}

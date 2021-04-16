package tech.arao.ims.model;

import java.io.Serializable;

public class CallForwardNoReply implements Serializable {

    private boolean provisioned;
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

    public boolean isProvisioned() {
        return provisioned;
    }

    public CallForwardNoReply setProvisioned(boolean provisioned) {
        this.provisioned = provisioned;
        return this;
    }
}

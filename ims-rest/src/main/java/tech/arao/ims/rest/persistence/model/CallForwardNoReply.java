package tech.arao.ims.rest.persistence.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "CallForwardNoReply")
@Table(name = "CALL_FORWARD_NO_REPLY")
@DiscriminatorValue("1")
public class CallForwardNoReply extends Feature {

    private String destination;


    public CallForwardNoReply() {  }

    public CallForwardNoReply(Subscriber subscriber, String destination) {
        super(true, subscriber);
        this.destination = destination;
    }


    public String getDestination() {
        return destination;
    }

    public CallForwardNoReply setDestination(String destination) {
        this.destination = destination;
        return this;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CallForwardNoReply)) return false;

        CallForwardNoReply that = (CallForwardNoReply) o;

        return destination.equals(that.destination);
    }

    @Override
    public int hashCode() {
        return destination.hashCode();
    }

    @Override
    public String toString() {
        return "CallForwardNoReply{" +
                "id=" + this.getId() +
                ", provisioned=" + this.isProvisioned() +
                ", destination=\"" + destination + '\"' +
                ", subscriber=" + this.getSubscriber() +
                "} ";
    }
}

package tech.arao.ims.model;

import java.io.Serializable;
import java.util.Objects;

public class Feature implements Serializable {

    private CallForwardNoReply callForwardNoReply;


    public Feature() {  }


    public CallForwardNoReply getCallForwardNoReply() {
        return callForwardNoReply;
    }

    public Feature setCallForwardNoReply(CallForwardNoReply cfnr) {
        this.callForwardNoReply = cfnr;
        return this;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Feature)) return false;
        Feature feature = (Feature) o;
        return Objects.equals(callForwardNoReply, feature.callForwardNoReply);
    }

    @Override
    public int hashCode() {
        return Objects.hash(callForwardNoReply);
    }

    @Override
    public String toString() {
        return "Feature{" +
                "callForwardNoReply=" + callForwardNoReply +
                '}';
    }
}

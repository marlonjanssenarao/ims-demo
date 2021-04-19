package tech.arao.ims.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Objects;

public class Subscriber {

    @NotBlank(message = "\'Phone Number\' can neither be null, blank nor empty!")
    private String phoneNumber;
    private String username;
    private String password;
    private String domain;
    private Status status;
    @NotNull(message = "\'Feature\' cannot be null!")
    private Feature feature;


    public Subscriber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Subscriber() {  }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Subscriber setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public Subscriber setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Subscriber setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getDomain() {
        return domain;
    }

    public Subscriber setDomain(String domain) {
        this.domain = domain;
        return this;
    }

    public Status getStatus() {
        return status;
    }

    public Subscriber setStatus(Status status) {
        this.status = status;
        return this;
    }

    public Feature getFeature() {
        return feature;
    }

    public Subscriber setFeature(Feature feature) {
        this.feature = feature;
        return this;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Subscriber)) return false;
        Subscriber that = (Subscriber) o;
        return phoneNumber.equals(that.phoneNumber) && username.equals(that.username) && password.equals(that.password) && domain.equals(that.domain) && status == that.status && feature.equals(that.feature);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneNumber, username, password, domain, status, feature);
    }
}

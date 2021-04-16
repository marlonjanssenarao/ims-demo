package tech.arao.ims.model;

import java.io.Serializable;
import java.util.Objects;

public class Subscriber implements Serializable {

    private String phoneNumber;
    private String username;
    private String password;
    private String domain;
    private String status;
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

    public String getStatus() {
        return status;
    }

    public Subscriber setStatus(String status) {
        this.status = status;
        return this;
    }

    public Feature getFeature() {
        return feature;
    }

    public Subscriber setFeature(Feature feature) {
        if (feature != null) this.feature = feature;
        return this;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Subscriber)) return false;
        Subscriber that = (Subscriber) o;
        return phoneNumber.equals(that.phoneNumber) &&
                username.equals(that.username) &&
                password.equals(that.password) &&
                domain.equals(that.domain) &&
                status.equals(that.status) &&
                feature.equals(that.feature);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneNumber, username, password, domain, status, feature);
    }

    @Override
    public String toString() {
        return "Subscriber{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", domain='" + domain + '\'' +
                ", status='" + status + '\'' +
                ", feature=" + feature +
                '}';
    }
}

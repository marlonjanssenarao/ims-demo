package tech.arao.ims.rest.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.List;

@Entity
public class Subscriber implements Serializable {

    private @Id String phoneNumber;
    private String username;
    private String password;
    private String domain;
    private String status;
    //private List<Feature> features;


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

    /*public List<Feature> getFeatures() {
        return features;
    }

    public Subscriber setFeatures(List<Feature> features) {
        if (features != null) this.features = features;
        return this;
    }*/
}
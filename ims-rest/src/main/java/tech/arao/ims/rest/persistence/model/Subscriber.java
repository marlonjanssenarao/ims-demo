package tech.arao.ims.rest.persistence.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity(name = "Subscriber")
@Table(name = "SUBSCRIBERS")
public class Subscriber implements Serializable {

    @Id
    private String phoneNumber;
    private String username;
    private String password;
    private String domain;
    private Status status;


    public Subscriber() {  }

    public Subscriber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Subscriber)) return false;

        Subscriber that = (Subscriber) o;

        return phoneNumber.equals(that.phoneNumber) &&
                username.equals(that.username) &&
                password.equals(that.password) &&
                domain.equals(that.domain) &&
                status == that.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneNumber, username, password, domain, status);
    }

    @Override
    public String toString() {
        return "Subscriber{" +
                "phoneNumber=\"" + phoneNumber + '\"' +
                ", username=\"" + username + '\"' +
                ", password=\"" + password + '\"' +
                ", domain=\"" + domain + '\"' +
                ", status=" + status +
                '}';
    }
}

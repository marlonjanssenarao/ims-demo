package tech.arao.ims.rest.persistence.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Objects;

@Entity(name = "Subscriber")
@Table(name = "SUBSCRIBERS")
public class Subscriber implements Serializable {

    @Id
    @NotBlank(message = "\'Phone Number\'can netiher be null, empty nor blank.")
    private String phoneNumber;
    @NotBlank(message = "\'Usernmae\'can netiher be null, empty nor blank.")
    private String username;
    @NotBlank(message = "\'Password\'can netiher be null, empty nor blank.")
    private String password;
    @NotBlank(message = "\'Domain\'can netiher be null, empty nor blank.")
    private String domain;
    @NotNull(message = "\'Status\' cannot be null!")
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

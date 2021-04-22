package tech.arao.ims.rest.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class SubscriberJson {

    @NotBlank(message = "\'Phone Number\'can netiher be null, empty nor blank.")
    private String phoneNumber;
    @NotBlank(message = "\'Username\'can netiher be null, empty nor blank.")
    private String username;
    @NotBlank(message = "\'Password\'can netiher be null, empty nor blank.")
    private String password;
    @NotBlank(message = "\'Domain\'can netiher be null, empty nor blank.")
    private String domain;
    @NotNull(message = "\'Status\' cannot be null!")
    private StatusJson status;

    private FeatureJson feature;


    @JsonCreator
    public SubscriberJson(@JsonProperty("phoneNumber") String phoneNumber,
                          @JsonProperty("username") String username,
                          @JsonProperty("password") String password,
                          @JsonProperty("domain") String domain,
                          @JsonProperty("status") StatusJson status) {
        this.phoneNumber = phoneNumber;
        this.username = username;
        this.password = password;
        this.domain = domain;
        this.status = status;
    }

    public SubscriberJson(@JsonProperty("phoneNumber") String phoneNumber,
                          @JsonProperty("username") String username,
                          @JsonProperty("password") String password,
                          @JsonProperty("domain") String domain) {
        this.phoneNumber = phoneNumber;
        this.username = username;
        this.password = password;
        this.domain = domain;
        status = StatusJson.ACTIVE;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public SubscriberJson setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public SubscriberJson setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public SubscriberJson setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getDomain() {
        return domain;
    }

    public SubscriberJson setDomain(String domain) {
        this.domain = domain;
        return this;
    }

    public StatusJson getStatus() {
        return status;
    }

    public SubscriberJson setStatus(StatusJson status) {
        this.status = status;
        return this;
    }

    public FeatureJson getFeature() {
        return feature;
    }

    public SubscriberJson setFeature(FeatureJson feature) {
        this.feature = feature;
        return this;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SubscriberJson)) return false;

        SubscriberJson that = (SubscriberJson) o;

        return phoneNumber.equals(that.phoneNumber) &&
               username.equals(that.username) &&
               password.equals(that.password) &&
               domain.equals(that.domain) &&
               status == that.status &&
               feature.equals(that.feature);
    }

    @Override
    public int hashCode() {
        int result = phoneNumber.hashCode();
        result = 67 * result + username.hashCode();
        result = 67 * result + password.hashCode();
        result = 67 * result + domain.hashCode();
        result = 67 * result + status.hashCode();
        result = 67 * result + feature.hashCode();
        return result;
    }
}

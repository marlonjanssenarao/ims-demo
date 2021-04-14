package tech.arao.ims.rest.exception;

public class SubscriberNotFoundException extends RuntimeException {

    public SubscriberNotFoundException(String phoneNumber) {
        super("Could Not Find Subscriber With PhoneNumber '" + phoneNumber + '\'');
    }
}

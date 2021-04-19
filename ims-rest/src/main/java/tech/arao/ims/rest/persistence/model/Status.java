package tech.arao.ims.rest.persistence.model;

public enum Status {

    ACTIVE("ACTIVE"), INACTIVE("INACTIVE");


    private String status;


    Status(String status) {
        this.status = status;
    }


    public String get() {
        return status;
    }
}

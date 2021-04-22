package tech.arao.ims.rest.model;

public enum StatusJson {

    ACTIVE("ACTIVE"), INACTIVE("INACTIVE");


    private String status;


    StatusJson(String status) {
        this.status = status;
    }


    public String get() {
        return status;
    }
}

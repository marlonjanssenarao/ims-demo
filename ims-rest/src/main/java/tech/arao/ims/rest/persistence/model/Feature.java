package tech.arao.ims.rest.persistence.model;

public abstract class Feature<T extends Feature> {

    private boolean provisioned;


    protected Feature(boolean isProvisioned) {
        provisioned = isProvisioned;
    }


    public boolean isProvisioned() {
        return provisioned;
    }

    public T setProvisioned(boolean provisioned) {
        this.provisioned = provisioned;
        return (T) this;
    }
}

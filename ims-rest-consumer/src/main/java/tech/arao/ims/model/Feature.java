package tech.arao.ims.model;

public abstract class Feature<T extends Feature> {

    private boolean provisioned;


    protected Feature(boolean isProvisioned) {
        provisioned = isProvisioned;
    }


    public boolean isProvisioned() {
        return provisioned;
    }

    public void setProvisioned(boolean provisioned) {
        this.provisioned = provisioned;
    }
}

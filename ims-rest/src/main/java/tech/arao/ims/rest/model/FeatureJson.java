package tech.arao.ims.rest.model;

public abstract class FeatureJson<F extends FeatureJson> {

    private boolean provisioned;


    protected FeatureJson(boolean isProvisioned) {
        provisioned = isProvisioned;
    }


    public boolean isProvisioned() {
        return provisioned;
    }

    public FeatureJson<F> setProvisioned(boolean provisioned) {
        this.provisioned = provisioned;
        return this;
    }
}

package hallo;

public class ExtractParameterBuilder {
    private String hee;
    private boolean keuze;

    public ExtractParameterBuilder setHee(String hee) {
        this.hee = hee;
        return this;
    }

    public ExtractParameterBuilder setKeuze(boolean keuze) {
        this.keuze = keuze;
        return this;
    }

    public ExtractParameter createExtractParameter() {
        return new ExtractParameter(hee, keuze);
    }
}
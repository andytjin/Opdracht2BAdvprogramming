package hallo;

public class ExtractParameter {
    private final String hee;
    private final boolean keuze;

    public ExtractParameter(String hee, boolean keuze) {
        this.hee = hee;
        this.keuze = keuze;
    }

    public String getHee() {
        return hee;
    }

    public boolean isKeuze() {
        return keuze;
    }
}

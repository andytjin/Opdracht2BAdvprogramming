import hallo.HalloInterface;

public class HalloDelegate implements HalloInterface {
    protected String hee;
    protected boolean keuze;

    public HalloDelegate() {
    }

    @Override
    public void setHee(String hee) {
        this.hee = hee;
    }

    @Override
    public boolean isKeuze() {
        return keuze;
    }

    @Override
    public void setKeuze(boolean keuze) {
        this.keuze = keuze;
    }

    @Override
    public void printText() {
        System.out.println("hallo");
    }
}
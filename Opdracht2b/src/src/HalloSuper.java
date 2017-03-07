/**
 * Created by andy on 27-2-2017.
 */
public class HalloSuper implements hallo.HalloInterface {
    protected final HalloDelegate halloDelegate = new HalloDelegate();

    public HalloSuper() {

    }

    @Override
    public void setHee(String hee) {
        halloDelegate.setHee(hee);
    }

    @Override
    public boolean isKeuze() {
        return halloDelegate.isKeuze();
    }

    @Override
    public void setKeuze(boolean keuze) {
        halloDelegate.setKeuze(keuze);
    }

    @Override
    public void printText(){
        halloDelegate.printText();
    }
}

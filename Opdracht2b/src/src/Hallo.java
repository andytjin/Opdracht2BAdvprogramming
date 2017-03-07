import hallo.ExtractParameter;
import hallo.ExtractParameterBuilder;

/**
 * Created by andy on 27-2-2017.
 */
public class Hallo extends HalloSuper {


    public static final String S = "hallo";

    private Hallo(ExtractParameter extractParameter){
        super();
    }

    public static Hallo createHallo(ExtractParameter extractParameter) {
        return new Hallo(extractParameter);
    }

    public static void main(String[] args){
        System.out.println("hallo");
        Hallo hallo = createHallo(new ExtractParameterBuilder().setHee("hallo").setKeuze(true).createExtractParameter());
        getText(hallo);
        hallo.setHee("hall");
        String s = S;

        ExtractParameter extractParameter = new ExtractParameterBuilder().setHee("sdaf").setKeuze(true).createExtractParameter();

        String s1 = extractParameter.getHee();


    }

    private static void getText(Hallo hallo) {
        new NewGetText(hallo).invoke();
    }

    private static class NewGetText {
        private Hallo hallo;

        public NewGetText(Hallo hallo) {
            this.hallo = hallo;
        }

        public void invoke() {
            hallo.printText();
        }
    }
}

import objekty.IObjekt;
import objekty.Lod;
import objekty.Raketa;

public class DemoObjekty {
    public static void main(String[] args) {

        System.out.println("Hello džavo!");

        System.out.println("Co je to?");

        IObjekt raketa = new Raketa();
        IObjekt lod = new Lod();

        raketa.palivo();
        raketa.pohyb();

        lod.palivo();
        lod.pohyb();

    }
}
package objekty;

public class Lod implements IObjekt {


    @Override
    public void palivo() {
        System.out.print("Doplním naftu");
    }

    @Override
    public void pohyb() {
        System.out.println(" a popluji do Karibiku.");
    }
}

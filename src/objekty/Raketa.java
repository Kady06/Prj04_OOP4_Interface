package objekty;

public class Raketa implements IObjekt{
    @Override
    public void palivo() {
        System.out.print("Potřebuju letecký benzín");
    }

    @Override
    public void pohyb() {
        System.out.println(" a poletím na Mars.");
    }
}

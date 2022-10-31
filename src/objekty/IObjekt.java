package objekty;

public interface IObjekt {

    void palivo();
    //void pohyb();
    default void pohyb() {
        System.out.println("");
    }




}

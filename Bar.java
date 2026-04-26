public class Bar extends Stanza {

    public Bar() {
        super(0, "Bar", "A dimly lit bar filled with bottles and strange aromas");

        aggiungiOggetto(new BottigliaRotta());
        aggiungiOggetto(new BicchiereDiAssenzio());
        aggiungiOggetto(new ElisirAlMontenegro());
    }

    @Override
    public void entra() {
        super.entra();
        System.out.println("The sharp smell of absinthe permeates the air.");
    }
}

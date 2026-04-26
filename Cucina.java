public class Cucina extends Stanza {

    public Cucina() {
        super(0, "Kitchen", "A large industrial kitchen smelling of burnt food and old grease");

        aggiungiOggetto(new Mannaia());
        aggiungiOggetto(new PadellaDiFerro());
        aggiungiOggetto(new ZuppaIndiana());
    }

    @Override
    public void entra() {
        super.entra();
        System.out.println("The stoves are still on. Someone was here not long ago.");
    }
}

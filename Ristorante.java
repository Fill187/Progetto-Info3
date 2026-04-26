public class Ristorante extends Stanza {

    public Ristorante() {
        super(0, "Restaurant", "A large dining room with laid tables and silverware scattered all around", new TheEternalDiner());

        aggiungiOggetto(new ColtelloDArgento());
        aggiungiOggetto(new TovaglioloMacchiato());
        aggiungiOggetto(new VinoTavernello());
    }

    @Override
    public void entra(){
        super.entra();
        System.out.println("A skeleton in a tuxedo stares at you with empty eyes. He does not appreciate being interrupted at dinner.");
    }
}

public class Suite extends Stanza {

    public Suite() {
        super(2, "Suite", "A luxurious suite with silk sheets and a suspicious perfume lingering in the air", new LaVigliacca());

        aggiungiOggetto(new Pugnale());
        aggiungiOggetto(new AnelloNuziale());
        aggiungiOggetto(new MascherinaPerDormire());
        aggiungiOggetto(new ProfumoDaMalessereNapoletano());
    }

    @Override
    public void entra(){
        super.entra();
        System.out.println("A seductive figure smiles at you sweetly. Do not trust that smile.");
    }
}

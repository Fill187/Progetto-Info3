public class Biblioteca extends Stanza {

    public Biblioteca() {
        super(1, "Library", "A silent library filled with dusty books and ancient magical knowledge", new RossettoLoStudiosoPazzo());

        aggiungiOggetto(new Bibbia());
        aggiungiOggetto(new OcchialiDaLettura());
        aggiungiOggetto(new InchiostroDellaConoscenza());
    }

    @Override
    public void entra() {
        super.entra();
        System.out.println("A monk watches you from behind an ancient tome. He seems to already know what you are about to do.");
    }
}

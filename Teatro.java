public class Teatro extends Stanza {

    public Teatro() {
        super(1, "Theatre", "A dusty theatre with faded curtains and an eerie silence on the stage");

        aggiungiOggetto(new Manganello());
        aggiungiOggetto(new MascheraDellaTragedia());
        aggiungiOggetto(new Struccante());
    }

    @Override
    public void entra(){
        super.entra();
        System.out.println("The floorboards creak under your feet. Something is hiding behind the curtains.");
    }
}

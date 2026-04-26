public class Palestra extends Stanza {

    public Palestra() {
        super(1, "Gym", "A training room full of equipment and the stench of rancid sweat", new Andriola());

        aggiungiOggetto(new ManubrioCinqueKG());
        aggiungiOggetto(new Asciugamano());
        aggiungiOggetto(new Cuffiette());
        aggiungiOggetto(new FrullatoDiTestosterone());
    }

    @Override
    public void entra(){
        super.entra();
        System.out.println("A cast-iron creature blocks your path. Its muscles seem forged from metal.");
    }
}

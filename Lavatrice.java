public class Lavatrice extends OggettoGenerico {

    public Lavatrice() {
        super("Washing Machine", "A noisy machine filled with chaotic energy", "Disorients enemies", false);
    }

    public void centrifuga(Nemico n) {
        n.setSbilanciato(true);
        System.out.println("The Washing Machine shakes violently, disorienting the enemy.");
    }

    @Override
    public void usa(Giocatore g, Nemico n) {
        centrifuga(n);
    }

    @Override
    public String stampaDescrizione() {
        return "Name: " + getNome() + ", Description: " + getDescrizione() + ", Utility: " + getUtilita();
    }
}

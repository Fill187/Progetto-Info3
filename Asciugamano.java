public class Asciugamano extends OggettoGenerico {

    public Asciugamano() {
        super("Towel", "A soft towel infused with faint protective magic", "Grants a small defense boost", true);
    }

    public void proteggi(Giocatore g) {
        g.setDifesa(g.getDifesa() + 1);
        System.out.println("The Towel increases your defense by 1.");
    }

    @Override
    public void usa(Giocatore g, Nemico n) {
        proteggi(g);
    }

    @Override
    public String stampaDescrizione() {
        return "Name: " + getNome() + ", Description: " + getDescrizione() + ", Utility: " + getUtilita();
    }
}

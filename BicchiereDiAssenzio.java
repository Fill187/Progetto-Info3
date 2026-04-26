public class BicchiereDiAssenzio extends OggettoGenerico {

    public BicchiereDiAssenzio() {
        super("Absinthe Glass", "A mysterious glass that glows with illusion‑breaking energy", "Reveals hidden enemies", false);
    }

    public void rivela(Nemico n) {
        System.out.println("The Absinthe Glass reveals hidden illusions around " + n.getNome() + ".");
    }

    @Override
    public void usa(Giocatore g, Nemico n) {
        rivela(n);
    }

    @Override
    public String stampaDescrizione() {
        return "Name: " + getNome() + ", Description: " + getDescrizione() + ", Utility: " + getUtilita();
    }
}

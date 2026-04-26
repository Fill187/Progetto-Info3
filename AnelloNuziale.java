public class AnelloNuziale extends OggettoGenerico {

    public AnelloNuziale() {
        super("Wedding Ring", "A ring filled with emotional power", "Boosts inner resolve", true);
    }

    public void rafforza(Giocatore g) {
        g.setDifesa(g.getDifesa() + 1);
        System.out.println("The Wedding Ring strengthens your resolve, increasing defense.");
    }

    @Override
    public void usa(Giocatore g, Nemico n) {
        rafforza(g);
    }

    @Override
    public String stampaDescrizione() {
        return "Name: " + getNome() + ", Description: " + getDescrizione() + ", Utility: " + getUtilita();
    }
}

public class Sdraio extends OggettoGenerico {

    public Sdraio() {
        super("Beach Chair", "A relaxing chair radiating soothing energy", "Restores health", false);
    }

    public void rilassa(Giocatore g) {
        g.setVita(g.getVita() + 5);
        System.out.println("The Beach Chair deeply relaxes you, restoring 5 HP.");
    }

    @Override
    public void usa(Giocatore g, Nemico n) {
        rilassa(g);
    }

    @Override
    public String stampaDescrizione() {
        return "Name: " + getNome() + ", Description: " + getDescrizione() + ", Utility: " + getUtilita();
    }
}

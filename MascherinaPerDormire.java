public class MascherinaPerDormire extends OggettoGenerico {

    public MascherinaPerDormire() {
        super("Sleeping Mask", "A soft mask that induces deep rest", "Restores health", false);
    }

    public void riposa(Giocatore g) {
        g.setVita(g.getVita() + 4);
        System.out.println("The Sleeping Mask grants deep rest, restoring 4 HP.");
    }

    @Override
    public void usa(Giocatore g, Nemico n) {
        riposa(g);
    }

    @Override
    public String stampaDescrizione() {
        return "Name: " + getNome() + ", Description: " + getDescrizione() + ", Utility: " + getUtilita();
    }
}

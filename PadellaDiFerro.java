public class PadellaDiFerro extends OggettoGenerico {

    public PadellaDiFerro() {
        super("Iron Pan", "A sturdy iron pan used for cooking or blocking attacks", "Provides temporary defense", true);
    }

    public void blocca(Giocatore g) {
        g.setDifesa(g.getDifesa() + 2);
        System.out.println("The Iron Pan blocks incoming attacks, increasing defense by 2.");
    }

    @Override
    public void usa(Giocatore g, Nemico n) {
        blocca(g);
    }

    @Override
    public String stampaDescrizione() {
        return "Name: " + getNome() + ", Description: " + getDescrizione() + ", Utility: " + getUtilita();
    }
}

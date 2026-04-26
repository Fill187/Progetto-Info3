public class LanternaAOlio extends OggettoGenerico {

    public LanternaAOlio() {
        super("Oil Lantern", "A lantern filled with bright magical fire", "Blinds enemies temporarily", false);
    }

    public void acceca(Nemico n) {
        n.setStordito(true);
        System.out.println("The Oil Lantern emits a blinding flash, stunning the enemy.");
    }

    @Override
    public void usa(Giocatore g, Nemico n) {
        acceca(n);
    }

    @Override
    public String stampaDescrizione() {
        return "Name: " + getNome() + ", Description: " + getDescrizione() + ", Utility: " + getUtilita();
    }
}

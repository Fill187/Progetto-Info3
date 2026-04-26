public class ChiaviDellElicottero extends OggettoGenerico {

    public ChiaviDellElicottero() {
        super("Helicopter Keys", "A set of coded keys required to start the helicopter", "Unlocks helicopter access", false);
    }

    public boolean requisitoElicottero() {
        return true;
    }

    @Override
    public void usa(Giocatore g, Nemico n) {
        System.out.println("The Helicopter Keys enable access to the aircraft systems.");
    }

    @Override
    public String stampaDescrizione() {
        return "Name: " + getNome() + ", Description: " + getDescrizione() + ", Utility: " + getUtilita();
    }
}

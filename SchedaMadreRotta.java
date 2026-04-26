public class SchedaMadreRotta extends OggettoGenerico {

    public SchedaMadreRotta() {
        super("Broken Motherboard", "A damaged circuit board emitting unstable sparks", "Emits static pulses", false);
    }

    public void impulso(Nemico n) {
        n.setStordito(true);
        System.out.println("The Broken Motherboard releases a static pulse, stunning the enemy.");
    }

    @Override
    public void usa(Giocatore g, Nemico n) {
        impulso(n);
    }

    @Override
    public String stampaDescrizione() {
        return "Name: " + getNome() + ", Description: " + getDescrizione() + ", Utility: " + getUtilita();
    }
}

public class MascheraDellaTragedia extends OggettoGenerico {

    public MascheraDellaTragedia() {
        super("Mask of Tragedy", "A dramatic mask radiating sorrowful energy", "Weakens enemy morale", false);
    }

    public void intimorisce(Nemico n) {
        System.out.println("The Mask of Tragedy weakens " + n.getNome() + "'s morale.");
    }

    @Override
    public void usa(Giocatore g, Nemico n) {
        intimorisce(n);
    }

    @Override
    public String stampaDescrizione() {
        return "Name: " + getNome() + ", Description: " + getDescrizione() + ", Utility: " + getUtilita();
    }
}

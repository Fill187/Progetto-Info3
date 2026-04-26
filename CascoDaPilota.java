public class CascoDaPilota extends OggettoGenerico {

    public CascoDaPilota() {
        super("Pilot Helmet", "A certified pilot helmet required for aircraft operation", "Allows piloting authorization", true);
    }

    public boolean requisitoElicottero() {
        return true;
    }

    @Override
    public void usa(Giocatore g, Nemico n) {
        System.out.println("The Pilot Helmet grants authorization to operate aircraft.");
    }

    @Override
    public String stampaDescrizione() {
        return "Name: " + getNome() + ", Description: " + getDescrizione() + ", Utility: " + getUtilita();
    }
}

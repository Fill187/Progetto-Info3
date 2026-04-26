public class TovaglioloMacchiato extends OggettoGenerico {

    public TovaglioloMacchiato() {
        super("Stained Napkin", "A napkin carrying faint cleansing magic", "Removes minor debuffs", false);
    }

    public void purifica(Giocatore g) {
        System.out.println("The Stained Napkin cleanses minor negative effects.");
    }

    @Override
    public void usa(Giocatore g, Nemico n) {
        purifica(g);
    }

    @Override
    public String stampaDescrizione() {
        return "Name: " + getNome() + ", Description: " + getDescrizione() + ", Utility: " + getUtilita();
    }
}

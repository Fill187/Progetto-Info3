public class Cuffiette extends OggettoGenerico {

    public Cuffiette() {
        super("Earbuds", "Enchanted earbuds that play calming melodies", "Reduces stress and restores focus", false);
    }

    public void calma(Giocatore g) {
        System.out.println("The Earbuds play a calming melody, restoring your focus.");
    }

    @Override
    public void usa(Giocatore g, Nemico n) {
        calma(g);
    }

    @Override
    public String stampaDescrizione() {
        return "Name: " + getNome() + ", Description: " + getDescrizione() + ", Utility: " + getUtilita();
    }
}

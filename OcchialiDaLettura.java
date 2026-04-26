public class OcchialiDaLettura extends OggettoGenerico {

    public OcchialiDaLettura() {
        super("Reading Glasses", "A pair of enchanted glasses that sharpen perception", "Improves accuracy and insight", false);
    }

    public void migliora(Giocatore g) {
        System.out.println("The Reading Glasses enhance your perception and accuracy.");
    }

    @Override
    public void usa(Giocatore g, Nemico n) {
        migliora(g);
    }

    @Override
    public String stampaDescrizione() {
        return "Name: " + getNome() + ", Description: " + getDescrizione() + ", Utility: " + getUtilita();
    }
}

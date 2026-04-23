public class TagliaCarte extends Arma {

    private double probabilitaCritico = 0.20;
    private int bonusAffilatura = 0;

    public TagliaCarte() {
        super("Card Cutter", "A very sharp and finely honed card-cutting blade", 3, 1, 0);
    }

    public String stampaDescrizione() {
        return getNome() + ", Description: " + getDescrizione() + ", Damage: " + getDanno() + ", Range: " + getRaggioAzione() + ", Wear: " + getUsura() + ", Sharpen Bonus: " + bonusAffilatura + ", Crit Chance: " + (int)(probabilitaCritico * 100) + "%";
    }

    public boolean colpoCritico() {
        return Math.random() < probabilitaCritico;
    }

    public void affila() {
        bonusAffilatura++;
        setDanno(getDanno() + 1);
        System.out.println(getNome() + " has been sharpened. Damage increased to " + getDanno());
    }

    public void special(Nemico n) {
        if (eRotta()) {
            System.out.println(getNome() + " is too damaged to perform the special move.");
            return;
        }

        int dannoSpeciale = (getDanno() + bonusAffilatura) * 2;
        System.out.println("Special move! The Card Cutter performs a rapid strike dealing " + dannoSpeciale + " damage.");
        n.setVita(n.getVita() - dannoSpeciale);
        setUsura(getUsura() + 15);

        if (eRotta()) {
            System.out.println(getNome() + " broke after the special move!");
        }
    }

    @Override
    public void usa(Nemico n) {
        if (eRotta()) {
            System.out.println(getNome() + " is broken and cannot be used.");
            return;
        }

        int dannoTotale = getDanno() + bonusAffilatura;

        if (colpoCritico()) {
            dannoTotale *= 2;
            System.out.println("Critical hit! Damage doubled.");
        }

        System.out.println("You strike " + n.getNome() + " with the " + getNome() + " dealing " + dannoTotale + " damage.");
        n.setVita(n.getVita() - dannoTotale);
        setUsura(getUsura() + 8);

        if (eRotta()) {
            System.out.println(getNome() + " broke!");
        }
    }

    public boolean eRotta() {
        return getUsura() >= 100;
    }

    @Override
    public String toString() {
        return stampaDescrizione();
    }
}

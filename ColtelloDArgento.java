public class ColtelloDArgento extends Arma {

    private double probabilitaCritico = 0.25;
    private int bonusAffilatura = 0;

    public ColtelloDArgento() {
        super("Silver Knife", "A sharp silver blade ideal for close combat and effective against dark creatures", 5, 1, 0);
    }

    public boolean colpoCritico() {
        return Math.random() < probabilitaCritico;
    }

    public void affila() {
        bonusAffilatura++;
        setDanno(getDanno() + 1);
        System.out.println(getNome() + " has been sharpened. Damage increased to " + getDanno());
    }

    public void dannoOscurita(Nemico n) {
        if (n.getNome().toLowerCase().contains("dark") || n.getNome().toLowerCase().contains("ghost")) {
            System.out.println("The Silver Knife glows! Extra holy damage inflicted.");
            n.setVita(n.getVita() - 4);
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
            System.out.println("Critical strike! Damage doubled.");
        }
        System.out.println("You slash " + n.getNome() + " with the Silver Knife dealing " + dannoTotale + " damage.");
        n.setVita(n.getVita() - dannoTotale);
        dannoOscurita(n);
        setUsura(getUsura() + 7);
        if (eRotta()) {
            System.out.println(getNome() + " broke!");
        }
    }

    @Override
    public String stampaDescrizione() {
        return getNome() + ", Description: " + getDescrizione() + ", Damage: " + getDanno() + ", Range: " + getRaggioAzione() + ", Wear: " + getUsura() + ", Sharpen Bonus: " + bonusAffilatura + ", Crit Chance: " + (int)(probabilitaCritico * 100) + "%";
    }

    @Override
    public String toString() {
        return stampaDescrizione();
    }
}

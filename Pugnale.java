public class Pugnale extends Arma {

    private double probabilitaCritico = 0.30;
    private int bonusAffilatura = 0;

    public Pugnale() {
        super("Dagger", "A fast and deadly close‑range weapon ideal for quick strikes", 5, 1, 0);
    }

    public boolean colpoCritico() {
        return Math.random() < probabilitaCritico;
    }

    public void affila() {
        bonusAffilatura++;
        setDanno(getDanno() + 1);
        System.out.println(getNome() + " has been sharpened. Damage increased to " + getDanno());
    }

    public void backstab(Nemico n) {
        if (eRotta()) {
            System.out.println(getNome() + " is too damaged to perform a backstab.");
            return;
        }
        int danno = (getDanno() + bonusAffilatura) * 3;
        System.out.println("Backstab! The Dagger deals " + danno + " massive damage.");
        n.setVita(n.getVita() - danno);
        setUsura(getUsura() + 15);
        if (eRotta()) {
            System.out.println(getNome() + " broke after the backstab!");
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
        System.out.println("You stab " + n.getNome() + " with the Dagger dealing " + dannoTotale + " damage.");
        n.setVita(n.getVita() - dannoTotale);
        setUsura(getUsura() + 6);
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

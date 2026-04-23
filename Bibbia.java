public class Bibbia extends Arma {

    private double probabilitaCritico = 0.15;

    public Bibbia() {
        super("Holy Bible", "A sacred book used as a blunt weapon or thrown with divine force", 4, 2, 0);
    }

    public boolean colpoCritico() {
        return Math.random() < probabilitaCritico;
    }

    public void benedizione(Nemico n) {
        if (eRotta()) {
            System.out.println(getNome() + " is too damaged to unleash a blessing.");
            return;
        }

        int danno = getDanno() + 3;
        System.out.println("A holy light bursts from the Bible! Deals " + danno + " extra damage.");
        n.setVita(n.getVita() - danno);
        setUsura(getUsura() + 12);
    }

    @Override
    public void usa(Nemico n) {
        if (eRotta()) {
            System.out.println(getNome() + " is broken and cannot be used.");
            return;
        }

        int dannoTotale = getDanno();

        if (colpoCritico()) {
            dannoTotale *= 2;
            System.out.println("Holy critical hit! Damage doubled.");
        }

        System.out.println("You strike " + n.getNome() + " with the Holy Bible dealing " + dannoTotale + " damage.");
        n.setVita(n.getVita() - dannoTotale);
        setUsura(getUsura() + 7);

        if (eRotta()) {
            System.out.println(getNome() + " broke!");
        }
    }

    @Override
    public String stampaDescrizione() {
        return getNome() + ", Description: " + getDescrizione() + ", Damage: " + getDanno() + ", Range: " + getRaggioAzione() + ", Wear: " + getUsura() + ", Crit Chance: " + (int)(probabilitaCritico * 100) + "%";
    }

    @Override
    public String toString() {
        return stampaDescrizione();
    }
}

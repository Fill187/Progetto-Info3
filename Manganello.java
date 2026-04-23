public class Manganello extends Arma {

    private double probabilitaStordimento = 0.35;

    public Manganello() {
        super("Police Baton", "A solid police baton used for close combat and capable of stunning enemies", 6, 1, 0);
    }

    public void stordisci(Nemico n) {
        if (Math.random() < probabilitaStordimento) {
            System.out.println("The Police Baton stuns the enemy! They lose their next turn.");
            n.setStordito(true);
        }
    }

    @Override
    public void usa(Nemico n) {
        if (eRotta()) {
            System.out.println(getNome() + " is broken and cannot be used.");
            return;
        }
        int dannoTotale = getDanno();
        System.out.println("You strike " + n.getNome() + " with the Police Baton dealing " + dannoTotale + " damage.");
        n.setVita(n.getVita() - dannoTotale);
        stordisci(n);
        setUsura(getUsura() + 10);
        if (eRotta()) {
            System.out.println(getNome() + " broke!");
        }
    }

    @Override
    public String stampaDescrizione() {
        return getNome() + ", Description: " + getDescrizione() + ", Damage: " + getDanno() + ", Range: " + getRaggioAzione() + ", Wear: " + getUsura() + ", Stun Chance: " + (int)(probabilitaStordimento * 100) + "%";
    }

    @Override
    public String toString() {
        return stampaDescrizione();
    }
}

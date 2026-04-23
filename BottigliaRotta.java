public class BottigliaRotta extends Arma {

    private double probabilitaSanguinamento = 0.30;

    public BottigliaRotta() {
        super("Broken Bottle", "A shattered glass bottle with sharp edges capable of causing bleeding", 4, 5, 0);
    }

    public void sanguinamento(Nemico n) {
        if (Math.random() < probabilitaSanguinamento) {
            System.out.println("The Broken Bottle causes bleeding! The enemy loses 3 extra HP.");
            n.setVita(n.getVita() - 3);
        }
    }

    @Override
    public void usa(Nemico n) {
        if (eRotta()) {
            System.out.println(getNome() + " is too damaged to be used.");
            return;
        }
        int dannoTotale = getDanno();
        System.out.println("You slash " + n.getNome() + " with the Broken Bottle dealing " + dannoTotale + " damage.");
        n.setVita(n.getVita() - dannoTotale);
        sanguinamento(n);
        setUsura(getUsura() + 12);
        if (eRotta()) {
            System.out.println(getNome() + " shattered completely!");
        }
    }

    @Override
    public String stampaDescrizione() {
        return getNome() + ", Description: " + getDescrizione() + ", Damage: " + getDanno() + ", Range: " + getRaggioAzione() + ", Wear: " + getUsura() + ", Bleed Chance: " + (int)(probabilitaSanguinamento * 100) + "%";
    }

    @Override
    public String toString() {
        return stampaDescrizione();
    }
}

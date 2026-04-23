public class Manubrio extends Arma {

    private double probabilitaSbilanciamento = 0.30;

    public Manubrio() {
        super("Dumbbell", "A 5kg dumbbell usable as a heavy melee weapon or throwable object", 4, 3, 0);
    }

    public void sbilancia(Nemico n) {
        if (Math.random() < probabilitaSbilanciamento) {
            System.out.println("The Dumbbell knocks the enemy off balance! Their accuracy is reduced.");
            n.setSbilanciato(true);
        }
    }

    @Override
    public void usa(Nemico n) {
        if (eRotta()) {
            System.out.println(getNome() + " is broken and cannot be used.");
            return;
        }
        int dannoTotale = getDanno();
        System.out.println("You swing the Dumbbell at " + n.getNome() + " dealing " + dannoTotale + " damage.");
        n.setVita(n.getVita() - dannoTotale);
        sbilancia(n);
        setUsura(getUsura() + 12);
        if (eRotta()) {
            System.out.println(getNome() + " broke!");
        }
    }

    @Override
    public String stampaDescrizione() {
        return getNome() + ", Description: " + getDescrizione() + ", Damage: " + getDanno() + ", Range: " + getRaggioAzione() + ", Wear: " + getUsura() + ", Off-Balance Chance: " + (int)(probabilitaSbilanciamento * 100) + "%";
    }

    @Override
    public String toString() {
        return stampaDescrizione();
    }
}

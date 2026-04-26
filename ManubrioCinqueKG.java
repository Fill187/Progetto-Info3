public class ManubrioCinqueKG extends Arma {

    private double probabilitaSbilanciamento = 0.30;

    public ManubrioCinqueKG() {
        super("5kg Dumbbell", "A heavy dumbbell used as a brutal melee weapon", 4, 3, 0);
    }

    public void heavySmash(Nemico n) {
        int extra = 3;
        n.setVita(n.getVita() - extra);
        System.out.println("Heavy Smash deals " + extra + " extra damage.");
    }

    public void sbilancia(Nemico n) {
        if (Math.random() < probabilitaSbilanciamento) n.setSbilanciato(true);
    }

    @Override
    public void usa(Nemico n) {
        if (eRotta()) return;
        n.setVita(n.getVita() - getDanno());
        heavySmash(n);
        sbilancia(n);
        setUsura(getUsura() + 12);
    }

    @Override
    public String stampaDescrizione() {
        return getNome() + ", Description: " + getDescrizione() + ", Damage: " + getDanno() + ", Range: " + getRaggioAzione() + ", Wear: " + getUsura() + ", Off-Balance Chance: " + (int)(probabilitaSbilanciamento * 100) + "%";
    }
}

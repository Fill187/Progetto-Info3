public class Ciabatta extends Arma {

    private double probabilitaStordimento = 0.25;

    public Ciabatta() {
        super("Flying Slipper", "A surprisingly accurate thrown slipper capable of stunning enemies", 3, 5, 0);
    }

    public void stordisci(Nemico n) {
        if (Math.random() < probabilitaStordimento) {
            System.out.println("The Flying Slipper stuns the enemy! They lose their next turn.");
            n.setStordito(true);
        }
    }

    @Override
    public void usa(Nemico n) {
        if (eRotta()) {
            System.out.println(getNome() + " is too damaged to be used.");
            return;
        }
        int dannoTotale = getDanno();
        System.out.println("You throw the Flying Slipper at " + n.getNome() + " dealing " + dannoTotale + " damage.");
        n.setVita(n.getVita() - dannoTotale);
        stordisci(n);
        setUsura(getUsura() + 5);
        if (eRotta()) {
            System.out.println(getNome() + " tore apart!");
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

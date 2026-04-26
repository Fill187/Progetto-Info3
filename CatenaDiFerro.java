public class CatenaDiFerro extends Arma {

    private double probabilitaStordimento = 0.25;

    public CatenaDiFerro() {
        super("Iron Chain", "A heavy chain used as a flexible melee weapon", 5, 3, 0);
    }

    public void frustata(Nemico n) {
        if (Math.random() < probabilitaStordimento) {
            n.setStordito(true);
            System.out.println("The Iron Chain whip stuns the enemy.");
        }
    }

    @Override
    public void usa(Nemico n) {
        if (eRotta()) return;
        n.setVita(n.getVita() - getDanno());
        frustata(n);
        setUsura(getUsura() + 10);
    }

    @Override
    public String stampaDescrizione() {
        return getNome() + ", Description: " + getDescrizione() + ", Damage: " + getDanno() + ", Range: " + getRaggioAzione() + ", Wear: " + getUsura() + ", Stun Chance: " + (int)(probabilitaStordimento * 100) + "%";
    }
}

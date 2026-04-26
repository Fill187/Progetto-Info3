public class Mikrotik extends Arma {

    public Mikrotik() {
        super("MikroTik Device", "A compact device overloaded with unstable energy", 5, 2, 0);
    }

    public void pacchetti(Nemico n) {
        int extra = 4;
        n.setVita(n.getVita() - extra);
        System.out.println("Packet Storm deals " + extra + " electric damage.");
    }

    @Override
    public void usa(Nemico n) {
        if (eRotta()) return;
        n.setVita(n.getVita() - getDanno());
        pacchetti(n);
        setUsura(getUsura() + 9);
    }

    @Override
    public String stampaDescrizione() {
        return getNome() + ", Description: " + getDescrizione() + ", Damage: " + getDanno() + ", Range: " + getRaggioAzione() + ", Wear: " + getUsura();
    }
}

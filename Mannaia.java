public class Mannaia extends Arma {

    public Mannaia() {
        super("Cleaver", "A heavy butcher's cleaver capable of brutal strikes", 7, 1, 0);
    }

    public void fendente(Nemico n) {
        int extra = 4;
        n.setVita(n.getVita() - extra);
        System.out.println("Cleave deals " + extra + " additional damage.");
    }

    @Override
    public void usa(Nemico n) {
        if (eRotta()) return;
        n.setVita(n.getVita() - getDanno());
        fendente(n);
        setUsura(getUsura() + 14);
    }

    @Override
    public String stampaDescrizione() {
        return getNome() + ", Description: " + getDescrizione() + ", Damage: " + getDanno() + ", Range: " + getRaggioAzione() + ", Wear: " + getUsura();
    }
}

public class TuboAffilato extends Arma {

    public TuboAffilato() {
        super("Sharpened Pipe", "A metal pipe sharpened into a deadly improvised weapon", 6, 2, 0);
    }

    public void perfora(Nemico n) {
        int extra = 2;
        n.setVita(n.getVita() - extra);
        System.out.println("Piercing Strike deals " + extra + " armor‑ignoring damage.");
    }

    @Override
    public void usa(Nemico n) {
        if (eRotta()) return;
        n.setVita(n.getVita() - getDanno());
        perfora(n);
        setUsura(getUsura() + 10);
    }

    @Override
    public String stampaDescrizione() {
        return getNome() + ", Description: " + getDescrizione() + ", Damage: " + getDanno() + ", Range: " + getRaggioAzione() + ", Wear: " + getUsura();
    }
}
